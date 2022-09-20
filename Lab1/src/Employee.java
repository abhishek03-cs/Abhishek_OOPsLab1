public class Employee {
    private String firstName;
    private String lastName;
    private String department;



    Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  void setDepartMent(String department){
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
