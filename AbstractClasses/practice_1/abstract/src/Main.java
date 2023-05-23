import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int profit =100_000_000;
        ArrayList<Employee> employees=new ArrayList<>();
        Company company=new Company(profit);
        for (int i=0;i<270;i++){
            if (i<180){
                company.hire(new Operator());
            }else if(i>180 && i<260){
                company.hire(new Manager());
            }else {
                company.hire( new TopManager(profit));
            }
        }
        System.out.println(company.Tostring(company.getTopSalaryStaff(15)));
        System.out.println(company.Tostring(company.getLowestSalaryStaff(30)));
        for (int i=0;i<(company.Employees.size()/2+1);i++){
            company.fire(company.Employees.get(i));
        }
        System.out.println(company.Tostring(company.getTopSalaryStaff(15)));
        System.out.println(company.Tostring(company.getLowestSalaryStaff(30)));
        System.out.println(company.Employees.size());
    }
}