package Item;

public abstract class Item {
    private String name;

    Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}