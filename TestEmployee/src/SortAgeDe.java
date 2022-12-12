import java.util.Comparator;

public class SortAgeDe implements Comparator <Employee> {
    @Override
    public int compare(Employee o1, Employee o2){
        return o2.getYear() - o1.getYear();
    }
}
