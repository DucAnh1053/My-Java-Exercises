package ex4;

import java.util.LinkedList;
import java.util.List;

public class BreadStore {
    private List<Bread> breads;

    public BreadStore() {
        breads = new LinkedList<>();
    }

    /**
     * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
     * Bắt đầu, tạo ra và cho vào cửa hàng:
     * 5 bánh mỳ ThickcrustBread chỉ có cheese,
     * 5 bánh mỳ ThickcrustBread chỉ có olives,
     * 5 bánh mỳ ThickcrustBread có cả cheese và olives,
     * 5 bánh mỳ ThincrustBread chỉ có cheese,
     * 5 bánh mỳ ThincrustBread chỉ có olives,
     * 5 bánh mỳ ThincrustBread có cả cheese và olives.
     */

    public void init() {
        /* TODO */
        for (int i = 0; i < 5; i++) {
            breads.add(new Cheese(new ThickcrustBread()));
            breads.add(new Olives(new ThickcrustBread()));
            breads.add(new Olives(new Cheese(new ThickcrustBread())));
            breads.add(new Cheese(new ThincrustBread()));
            breads.add(new Olives(new ThincrustBread()));
            breads.add(new Olives(new Cheese(new ThincrustBread())));
        }
    }

    /**
     * Thêm bánh mỳ vào cửa hàng.
     */
    public void add(Bread bread) {
        /* TODO */
        breads.add(bread);
    }

    /**
     * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
     * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
     * bánh mỳ yêu cầu.
     * Nếu còn bánh mỳ để bán thì trả về giá trị true,
     * nếu không còn trả về giá trị false.
     */
    public boolean sell(Bread bread) {
        /* TODO */
        for (int i = 0; i < breads.size(); i++) {
            if (breads.get(i).cost() == bread.cost()) {
                breads.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * In ra những bánh mỳ còn trong cửa hàng.
     */
    public void print() {
        /* TODO */
        for (int i = 0; i < breads.size(); i++) {
            System.out.println((i + 1) + ". " + breads.get(i).getDescription());
        }
    }

    /**
     * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
     * nếu order là true, sắp xếp theo thứ tự tăng dần,
     * nếu order là false, sắp xếp theo thứ tự giảm dần.
     * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
     */
    public List<Bread> sort(boolean order) {
        /* TODO */
        List<Bread> result = new LinkedList<>(breads);
        int sort;
        if (order) {
            sort = 1;
        } else {
            sort = -1;
        }
        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (sort * result.get(i).cost() > (sort * result.get(j).cost())) {
                    Bread tmp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, tmp);
                }
            }
        }
        return result;
    }

    /**
     * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
     * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
     * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
     */
    public List<Bread> filter(int howMany, boolean order) {
        /* TODO */
        if (howMany > breads.size()) {
            return null;
        }
        List<Bread> sorted = sort(!order);
        return sorted.subList(0, howMany);

    }

    public static void main(String args[]) {
        BreadStore breadStore = new BreadStore();
        breadStore.init();

        /*
         * Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
         * - Thêm một số bánh mỳ vào cửa hàng
         * - Bán một số bánh mỳ từ cửa hàng
         * - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
         * - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
         */
        /* TODO */
        System.out.println("Banh trong cua hang: ");
        breadStore.print();
        System.out.println();

        System.out.println("Them banh vao cua hang: ");
        breadStore.add(new Cheese(new ThickcrustBread()));
        breadStore.add(new Cheese(new ThickcrustBread()));
        breadStore.add(new Olives(new ThincrustBread()));
        breadStore.add(new Olives(new Cheese(new ThincrustBread())));
        System.out.println("Cua hang sau khi them banh: ");
        breadStore.print();
        System.out.println();

        System.out.println("Banh mi con lai theo thu tu gia tang dan: ");
        List<Bread> sortedBreads = breadStore.sort(true);
        for (int i = 0; i < sortedBreads.size(); i++) {
            System.out.println((i + 1) + ". " + sortedBreads.get(i).getDescription());
//            System.out.println((i + 1) + ". " + sortedBreads.get(i).cost());
        }
        System.out.println();

        System.out.println("10 banh mi gia thap nhat con trong cua hang: ");
        List<Bread> cheapBreads = breadStore.filter(10, false);
        for (int i = 0; i < cheapBreads.size(); i++) {
            System.out.println((i + 1) + ". " + cheapBreads.get(i).getDescription());
//            System.out.println((i + 1) + ". " + cheapBreads.get(i).cost());
        }
    }
}
