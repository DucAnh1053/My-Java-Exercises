package ex3;

public class MyArrayIterator implements Iterator {
    private String[] items;
    private int position;

    public MyArrayIterator(String[] items) {
        this.items = items;
        this.position = 0;
    }

    public String next() {
        /* TODO */
        position++;
        return items[position - 1];
    }

    public boolean hasNext() {
        /* TODO */
        return position < items.length;
    }
}
