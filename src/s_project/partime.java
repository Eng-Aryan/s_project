
package s_project;
import java.util.Scanner;
public class partime extends staff {

  private double hourlyRate;
    private int hoursWorkedPerWeek;

    public partime(double hourlyRate, int hoursWorkedPerWeek, double income, String department, String name, String lname, String tname, String blood, int age, String id, String address) {
        super(income, department, name, lname, tname, blood, age, id, address);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
this.income = hourlyRate *  hoursWorkedPerWeek *12;
    }


    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate=" + hourlyRate + ", Hours Worked Per Week=" + hoursWorkedPerWeek;
    }

}