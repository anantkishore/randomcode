import java.util.Date;

public class Employee {
    int id; // 2
    String name; // Amitesh, Anant
    String managerName; // SomeOne
    int salary; // 1000
    int grade; // 3
    Date joiningDate; // 10-10-2020
    Date dob; // 01-01-1990
    String designation; // senior engineer
    String branchCode; // Delhi
    int departmentId; // Engineering

    //write a method to get employee age
    public String getEmployeeAge(){
        return this.dob.toString();
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"John");
        Employee emp2 = new Employee(2,"King");
    }
}

