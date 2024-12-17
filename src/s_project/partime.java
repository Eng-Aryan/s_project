package s_project;

public class partime extends staff {
    private double hourlyRate;
    private int hoursWorkedPerWeek;

    public partime(double hourlyRate, int hoursWorkedPerWeek, String department, String name, int age, int id, String address) {
        super(hourlyRate * hoursWorkedPerWeek * 4, department, name, age, id, address);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate=" + hourlyRate + ", Hours/Week=" + hoursWorkedPerWeek;
    }
}

