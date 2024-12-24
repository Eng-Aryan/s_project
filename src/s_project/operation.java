/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s_project;

/**
 *
 * @author RTX
 */
import java.util.*;
public class operation extends person{
    
   
 void display() {
     Scanner scanner = new Scanner(System.in);
        HashSet<String> usedIds = new HashSet<>();
         principal principal = new principal("Yusra","muhammed","ali","O+", 24, "0", "Principal's Office"){};

        while (true) { 
             System.out.println("1 - Register\n2 - View\n3 - Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID: pleas start with s to sudent and t to staff");
                     this.id = scanner.next();
                     
                    if (usedIds.contains(id)) {
                        System.out.println("ID already in use. Enter a unique ID.");
                        continue;
                    }

                    usedIds.add(id);
                    if ( id.startsWith("s")) {
                        student student = new student();
                        student.add();
                        principal.addStudent(student);
                        student.sendMessageToPrincipal();
                    } else if(id.startsWith("t")) {
                        staff staff = new staff() {};
                        staff.add();
                        principal.addStaff(staff);
                         staff.sendMessageToPrincipal();
                    }
                    else {System.out.println("Pleas enter s to sutudent and enter t to teacher");}
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

    @Override
    public void attendanceAndPermission() {
   }

}
    
