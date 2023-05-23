public class Manager implements Employee {

    int profit=generateprofit();
    @Override
    public int getmonthsalary() {
        return (int) (salary+profit*0.05);
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(o.getmonthsalary(),getmonthsalary());
    }

    @Override
    public String Tostring() {
        return "Должность работника: "+getClass()+" Зарплата :"+getmonthsalary();
    }

    public int generateprofit(){
        return (int) (115_000 + Math.random()*25_000); //115 000 до 140 000 рублей.;
    }
}
