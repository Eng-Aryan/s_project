/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//principal class
package s_project;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RTX
 */
public class principal extends person {
    



Scanner ara = new Scanner(System.in);
private ArrayList<student> students = new ArrayList<>();
    private ArrayList<staff> staff = new ArrayList<>();
public principal() {
        //overlodin krawa
    }
    public principal(String name, int age, int id, String address) {
        super(name, age, id, address);
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
            System.out.println("Choose an action: view / delete / update / search / exit");
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
    String name = ara.next();
    System.out.println("enter  id");
    int id = ara.nextInt();
    if(id%2 != 0){
        for (student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                
                System.out.println(" welcome " + student);
                found = true;
                student.attendanceAndPermission();
            }

        }
       // && String.valueOf(staffMember.getId()).equals(id)
        }
   
    else if(id%2 ==0 && id !=0){ 
        for (staff staffMember : staff) {
            if (staffMember.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + staffMember);
                found = true;
                staffMember.attendanceAndPermission();
            }
        }

        if (!found) {
            System.out.println("No record found with the given name or ID.");
        }

    }

 else if(id==0){System.out.println("Managing as Principal.");
                manageSchool();}


}

    public void attendanceAndPermission() {
      
    }

}
