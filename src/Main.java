public class Main {
    public static void main(String[] args) {
        ItemManager manager = new ItemManager();

        Item item1 = new Item("JJ" +
                "J", 1);
        Item item2 = new Item("PPP", 2);

        manager.addItem(item1);
        manager.addItem(item2);

        Item searchItem = new Item("JJJ", 1);

        if (manager.hasItem(searchItem)) {
            System.out.println("Item found: " + searchItem);
        } else {
            System.out.println("Item not found: " + searchItem);
        }
    }
}
