package inheritance;

public class Shop {

//    should have a name, description, and number of dollar signs.
    String name;
    String description;
    String numDollar;

    public Shop(String name, String description, String numDollar) {
        this.name = name;
        this.description = description;
        this.numDollar = numDollar;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numDollar='" + numDollar + '\'' +
                '}';
    }
}
