package s_project;
import java . util . Scanner;
public class fulltime extends staff {
    private double salary;

    public fulltime(double salary, double income, String department, String name, String lname, String tname, String blood, int age, String id, String address) {
        super(income, department, name, lname, tname, blood, age, id, address);
        this.salary = salary;
           income = this.salary * 12;
    }

   
    public double getSalary() {
        return salary;
    }
  
    @Override
    public String toString() {
        return super.toString() + ", Salary=" + salary;
    }
}
