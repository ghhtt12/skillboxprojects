public class Operator implements Employee {

    @Override
    public int getmonthsalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(o.getmonthsalary(),getmonthsalary());
    }

    @Override
    public String Tostring() {
        return "Должность работника: "+getClass()+" Зарплата :"+getmonthsalary();
    }
}
