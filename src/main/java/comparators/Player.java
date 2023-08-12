package comparators;

public class Player implements Comparable<Player>{
    
    private String name;
    private int rank;
    private int age;

    public Player(String name, int rank, int age) {
        this.name = name;
        this.rank = rank;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", rank=" + rank + ", age=" + age + "]";
    }


     /*
     * The sorting order is decided by the return value of the compareTo() method.
     * The Integer.compare(x, y) returns -1 if x is less than y, 
     * 0 if they're equal, and 1 otherwise.
     */
    @Override
    public int compareTo(Player o) {
       return Integer.compare(getRank(), o.getRank());
    }
}
