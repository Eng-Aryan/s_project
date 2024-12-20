//person class
package s_project;


import java.util.*;

public abstract class person {
    protected String name;
    protected String lname;  
    protected String tname;
    protected String blood;     
    protected int age;
    protected String id;
    protected String address;
  HashSet<String> usedIds = new HashSet<>();
    public person(String name, String lname, String tname, String blood,int age, String  id, String address) {
        this.name = name;
        this.lname = lname;
        this.tname = tname;
        this.blood = blood;
        this.age = age;
        this.id = id;
        this.address = address;
    }

 

    public person() {
        // oveloading
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getId() { return id; }
    public String getAddress() { return address; }

    public String getLname() {
        return lname;
    }

    public String getTname() {
        return tname;
    }

    public String getBlood() {
        return blood;
    }

      public void attendanceAndPermission(){
      
      
      
      
      
      
      }

    public void add() {
          
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        this.name = scanner.next();
          System.out.println("Enter second name:");
          this.lname = scanner.next();
            System.out.println("Enter third name:");
            this.tname = scanner.next();
              System.out.println("Enter blood:");
              this.blood = scanner.next();
        System.out.println("Enter age:");
        this.age = scanner.nextInt();
        System.out.println("Enter address:");
        this.address = scanner.next();
    }
}
