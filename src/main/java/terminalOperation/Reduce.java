package terminalOperation;

import java.util.List;

public class Reduce {
    
    public static void main(String[] args) {
        Double total = getPeople().stream()
                                        .map(e -> e.getSalary())
                                        .reduce(0.0, Double::sum); // we combine all values
        System.out.println(total);

        total = getPeople().stream()
                            .map(e -> e.getSalary())
                            .reduce(0.0, (salary, combined) -> salary + combined);
        System.out.println(total);
    }

    static List<Employee> getPeople() {
        return List.of(new Employee("Shango", Double.valueOf(12000)),
                                    new Employee("Danny", Double.valueOf(34000)),
                                    new Employee("Joel", Double.valueOf(23000)));
    }
}

class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}
