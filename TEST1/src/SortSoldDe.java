import java.util.Comparator;

public class SortSoldDe implements Comparator<Order> {
    public int compare(Order o1, Order o2) {
        if (o1.getAmount() > o2.getAmount()) {
            return -1;
        }
        if (o1.getAmount() == o2.getAmount()) {
            return 0;
        }
        return 1;


    }
}
