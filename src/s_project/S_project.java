
package s_project;
// main class
import java.util.*;

public class S_project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> usedIds = new HashSet<>();
        principal principal = new principal("Yusra", 24, 0, "Principal's Office"){};

        while (true) {
            System.out.println("1 - Register\n2 - View\n3 - Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID (-1 to Exit):");
                    int id = scanner.nextInt();
                    if (id == -1) {
                        System.out.println("Exiting...");
                        return;
                    }
                    if (usedIds.contains(id)) {
                        System.out.println("ID already in use. Enter a unique ID.");
                        continue;
                    }

                    usedIds.add(id);
                    if (id % 2 != 0) {
                        student student = new student();
                        student.add();
                        principal.addStudent(student);
                        student.sendMessageToPrincipal();
                    } else {
                        staff staff = new staff() {};
                        staff.add();
                        principal.addStaff(staff);
                    }
                    break;

                case 2:
                    principal.view();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
//rakoooo,aryannn