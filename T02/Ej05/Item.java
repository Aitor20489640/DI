package Ej05;

public class Item {
    private String name;
    private boolean checking;

    public Item(String name, boolean checking) {
        this.name = name;
        this.checking = checking;
    }

    public String getName() {
        return name;
    }

    public boolean isChecking() {
        return checking;
    }
}
