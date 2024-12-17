package s_project;

public class fulltime extends staff {
    private double salary;

    public fulltime(double salary, String department, String name, int age, int id, String address) {
        super(salary * 12, department, name, age, id, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary=" + salary;
    }
}
