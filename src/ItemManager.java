import java.util.ArrayList;

public class ItemManager {
    private ArrayList<Item> items;

    public ItemManager() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }
}
