package ex2;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            for (int j = i - 1; j >= 0; j--) {
                if (data[j] > key) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
