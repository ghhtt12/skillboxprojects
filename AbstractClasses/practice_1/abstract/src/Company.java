import java.util.ArrayList;

public class Company extends EmpoyeeComparator {
    ArrayList<Employee> Employees=new ArrayList<>();

    public int profit;

    EmpoyeeComparator empoyeeComparator= new EmpoyeeComparator();

    public Company( int profit) {
        this.profit = profit;
    }
//найм одного сотрудника — hire(Employee employee),
    //найм списка сотрудников – hireAll(Collection<Employee> employes),
    //увольнение сотрудника – fire(Employee employee),
    //получение значения дохода компании – getIncome().



    public void hire(Employee employee){
        Employees.add(employee);
    }

    public void hireAll(ArrayList<Employee> employees){
        Employees.addAll(employees);
    }

    public void fire(Employee employee) {
        Employees.remove(employee);
    }

    public int getIncome(){
        int Income=0;
        for (Employee employee : Employees) {
            if (employee instanceof Manager){
                Income+=((Manager) employee).profit;
            }
        }
        profit+=Income;
        return profit;
    }
    //List<Employee> getTopSalaryStaff(int count),
    //List<Employee> getLowestSalaryStaff(int count).
    public ArrayList<Employee> getTopSalaryStaff(int count){
        ArrayList<Employee> res=new ArrayList<>();
        Employees.sort(empoyeeComparator);
        int i= Employees.size()-1;
        int end=Employees.size()-count-1;
        while (i>end){
            res.add(Employees.get(i));
            i--;
        }
        return res;
    }


    public ArrayList<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> res=new ArrayList<>();
        int i=0;
        Employees.sort(empoyeeComparator);
        while (i!=count){
            res.add(Employees.get(i));
            i++;
        }
        return res;
    }

    public String Tostring(ArrayList<Employee> current) {
        String res="";
        for (Employee employee : current) {
            res+=employee.Tostring()+" ";
        }
        return res;
    }

}
