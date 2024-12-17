//person class
package s_project;


import java.util.Scanner;

public abstract class person {
    protected String name;
    protected int age;
    protected int id;
    protected String address;

    public person(String name, int age, int id, String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public person() {
        // Default constructor for dynamic input
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getId() { return id; }
    public String getAddress() { return address; }

   

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = scanner.next();
        System.out.println("Enter age:");
        this.age = scanner.nextInt();
        System.out.println("Enter address:");
        this.address = scanner.next();
    }
}
