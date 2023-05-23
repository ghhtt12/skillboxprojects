import java.util.Comparator;

public class EmpoyeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getmonthsalary(), o2.getmonthsalary());
    }
}
