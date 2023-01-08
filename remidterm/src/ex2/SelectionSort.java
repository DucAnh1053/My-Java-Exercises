package ex2;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minPos]) {
                    minPos = j;
                }
            }
            int temp = data[i];
            data[i] = data[minPos];
            data[minPos] = temp;
            count++;
        }
        return count;
    }
}
