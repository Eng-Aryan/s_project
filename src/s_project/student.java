package s_project;
import java.util.ArrayList;
import java.util.Scanner;

public class student extends person {
    private int attendance = 10;
    private int permission = 10;
    private String transport;
    private int grade;
    private ArrayList<String> messagesToPrincipal = new ArrayList<>();

    public student(String transport, int grade, String name, int age, int id, String address) {
        super(name, age, id, address);
        this.transport = transport;
        this.grade = grade;
    }

    public student() { }

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
      public ArrayList<String> getMessagesToPrincipal() {
        return messagesToPrincipal;
    }

     public void sendMessageToPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to send a message to the principal? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Enter your message:");
            String message = scanner.nextLine();
            messagesToPrincipal.add(message);
            System.out.println("Message sent to the principal.");
        }
       else System.out.println("NO.....");
    }

    @Override
    public void add() {
        super.add();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade:");
        this.grade = scanner.nextInt();
        System.out.println("Enter transport:");
        this.transport = scanner.next();
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Age=" + age + ", Transport=" + transport + "]";
    }
}
