package ex2;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i + 1] < data[i]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    count++;
                    swap = true;
                }
            }
        }
        return count;
    }
}
