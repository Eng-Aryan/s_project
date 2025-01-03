
package s_project;
import java.util.ArrayList;
import java.util.Scanner;
public class principal extends person {
    
int attendance = 20;
int permission = 20;


Scanner ara = new Scanner(System.in);
private ArrayList<student> students = new ArrayList<>();
    private ArrayList<staff> staff = new ArrayList<>();
public principal() {
        //overlodin krawa
    }

    public principal(String name, String lname, String tname, String blood, int age, String id, String address) {
        super(name, lname, tname, blood, age, id, address);
    }

   
   

    public void addStudent(student student) {
        students.add(student);
    }

    public void addStaff(staff staffMember) {
        staff.add(staffMember);
    }

    public void viewRecords() {
        System.out.println("Student Records:");
        for (student student : students) {
            System.out.println(student);
            System.out.println("Messages: " + student.getMessagesToPrincipal());
        }

        System.out.println("\nStaff Records:");
        for (staff staffMember : staff) {
            System.out.println(staffMember);
            System.out.println("Messages: " + staffMember.getMessagesToPrincipal());
        }
    }

    public void deleteRecord(String name , int id) {
        students.removeIf(student -> student.getName().equalsIgnoreCase(name) || String.valueOf(student.getId()).equals(id));
        staff.removeIf(staffMember -> staffMember.getName().equalsIgnoreCase(name) || String.valueOf(staffMember.getId()).equals(id));
        System.out.println("Record deleted if it existed.");
    }

    public void searchRecord(String name) {
        boolean found = false;

        for (student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + student);
                found = true;
            }
        }

        for (staff staffMember : staff) {
            if (staffMember.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + staffMember);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No record found with the given name or ID.");
        }
    }

    public void updateRecord(String nameOrId) {
        Scanner scanner = new Scanner(System.in);

        for (student student : students) {
            if (student.getName().equalsIgnoreCase(nameOrId) || String.valueOf(student.getId()).equals(nameOrId)) {
                System.out.println("Updating student: " + student);
                System.out.println("Enter new name");
                student.name = scanner.next();
                System.out.println("Enter new age : ");
                student.age = scanner.nextInt();
                System.out.println("Enter new address:");
                student.address = scanner.next();
                System.out.println("Record updated.");
                return;
            }
        }

        for (staff staffMember : staff) {
            if (staffMember.getName().equalsIgnoreCase(nameOrId) || String.valueOf(staffMember.getId()).equals(nameOrId)) {
                System.out.println("Updating staff: " + staffMember);
                            System.out.println("Updating student: " + staffMember);
                System.out.println("Enter new name");
                staffMember.name = scanner.next();
                System.out.println("Enter new age : ");
                staffMember.age = scanner.nextInt();
                System.out.println("Enter new address:");
                staffMember.address = scanner.next();
                System.out.println("Record updated.");
                return;
            }
        }

        System.out.println("No record found with the given name or ID.");
    }

    public void manageSchool() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action: view / delete / update / profile / search / exit");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "view":
                    viewRecords();
                    break;
                case "delete":
                    System.out.println("Enter name and ID to delete:");
                    String delname = scanner.nextLine();
                    int delid = scanner.nextInt();
                    deleteRecord(delname,delid);
                    break;
                case "update":
                    System.out.println("Enter name or ID to update:");
                    String updateKey = scanner.nextLine();
                    updateRecord(updateKey);
                    break;
                case "search":
                    System.out.println("Enter name or ID to search:");
                    String searchKey = scanner.nextLine();
                    searchRecord(searchKey);
                    break;
                     case "profile":
                         System.out.println("attendance = " + attendance +" permission = "+ "permission");
                         System.out.println(name + lname + tname + blood + age + id + address);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid action.");
            }
        }
    }


public void view(){

 boolean found = false;
    System.out.println("Enter name");
    String name1= ara.next();
    System.out.println("enter  id");
    String id1 = ara.next();
    

        for (student student : students) {
            if (student.getName().equalsIgnoreCase(name1)) {
                
                System.out.println(" welcome " + student);
                found = true;
                student.attendanceAndPermission();
               
            }

        }
    
        for (staff staffMember : staff) {
            if (staffMember.getName().equalsIgnoreCase(name1)) {
                System.out.println("Found: " + staffMember);
                found = true;
                staffMember.attendanceAndPermission();
    
            }
        }

      if(id.equalsIgnoreCase("0") && name.equalsIgnoreCase("yusra")){System.out.println("Managing as Principal.");
                manageSchool();}
else {   
 
  System.out.println("No record found with the given name or ID.");
 }
}


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

}
