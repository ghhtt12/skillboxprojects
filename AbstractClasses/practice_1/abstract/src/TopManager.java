public class TopManager implements Employee,Comparable<Employee>{

    public int profit;


    public TopManager( int profit) {
        this.profit = profit;
    }

    @Override
    public int getmonthsalary() {
        int benefit=salary;
        if (profit>=10_000_000){
            benefit*=1.5;
        }
        return benefit;
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
