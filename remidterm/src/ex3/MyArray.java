package ex3;

public class MyArray implements MyIterable {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems;
    private String[] menuItems;

    public MyArray() {
        numberOfItems = 0;
        menuItems = new String[MAX_ITEMS];
    }

    public void addItem(String name) {
        /* TODO */
        if (numberOfItems <= MAX_ITEMS) {
            menuItems[numberOfItems] = name;
            numberOfItems++;
        }
    }

    public String[] getMenuItems() {
        /* TODO */
        return menuItems;
    }

    public Iterator createIterator() {
        /* TODO */
        return new MyArrayIterator(menuItems);
    }

    public String toString() {
        return "My Array Structure";
    }
}
