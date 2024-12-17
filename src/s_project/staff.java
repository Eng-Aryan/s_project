package s_project;
import java.util.Scanner;
import java.util.ArrayList;
public class staff extends person {
    protected int attendance = 20;
    protected int permission = 20;
    protected double income;
    protected String department;
private ArrayList<String> messagesToPrincipal = new ArrayList<>();
    public staff(double income, String department, String name, int age, int id, String address) {
        super(name, age, id, address);
        this.income = income;
        this.department = department;
    }

    public staff() { }

       @Override
    public void attendanceAndPermission() {
        System.out.println("Attendance: " + attendance + ", Permissions: " + permission);
        if (permission > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Request permission? (yes/no):");
            if (scanner.next().equalsIgnoreCase("yes")) {
                permission--;
                System.out.println("Permission granted. Remaining: " + permission);
            }
        }
    }
 public void sendMessageToPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to send a message to the principal? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Enter your message:");
            String message = scanner.next();
            messagesToPrincipal.add(message);
            System.out.println("Message sent to the principal.");
        }
        else{System.out.println("NO.......");}
    }
  public ArrayList<String> getMessagesToPrincipal() {
        return messagesToPrincipal;
    }
    @Override
    public void add() {
        super.add();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department:");
        this.department = scanner.next();
    }
}

