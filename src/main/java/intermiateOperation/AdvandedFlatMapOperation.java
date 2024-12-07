package intermiateOperation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Data;

public class AdvandedFlatMapOperation {
    
    public static final Logger LOGGER = Logger.getLogger(AdvandedFlatMapOperation.class.getName());

    public static void main(String[] args) {
        List<Item> itemsA = new ArrayList<>();
        itemsA.add(new Item(1L, "item 1", "IN_STOCK"));
        itemsA.add(new Item(2L, "item 2", "IN_STOCK"));
        itemsA.add(new Item(4L, "item 4", "SOLDOUT"));

        List<Item> itemsB = new ArrayList<>();
        itemsB.add(new Item(1L, "item 1", "IN_STOCK"));
        itemsB.add(new Item(2L, "item 2", "IN_STOCK"));

        List<Beneficiary> beneficiaries = new ArrayList<>();
        beneficiaries.add(new Beneficiary(1L, "Nigeria", "Ebuka", itemsA));
        beneficiaries.add(new Beneficiary(2L, "Ghana", "KiDi", itemsB));

        final var cart = new Cart(1L, "v.1.0", beneficiaries);

        // OPERATIONS
        // 1. Extract items -> Two Lists of items
        cart.getBeneficiaries()
            .stream()
            .map(Beneficiary::getItems)
            .forEach(System.out::println);

        List<Long> toGetFiltered = List.of(1L, 4L);

        // 2. Extract, Combine and update items
        cart.getBeneficiaries()
                .stream()
                .map(Beneficiary::getItems)
                .flatMap(Collection::stream)
                .filter(item -> !item.getStatus().equals("SOLDOUT") && toGetFiltered.contains(item.getId()))
                .forEach(item -> {
                    LOGGER.log(Level.INFO, "updating item {0}", item.getId());
                    item.setStatus("SOLDOUT");
                });

        LOGGER.log(Level.INFO, "processed cart {0}", cart);
    }
}

@Data
@AllArgsConstructor
class Cart {
    Long id;
    String hashVersion;
    List<Beneficiary> beneficiaries;
}

@Data
@AllArgsConstructor
class Beneficiary {
    Long id;
    String country;
    String Name;
    List<Item> items;
}

@Data
@AllArgsConstructor
class Item {
    Long id;
    String itemName;
    String status;
}
