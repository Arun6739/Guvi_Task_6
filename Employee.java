package task_6;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
    
    public Employee() {
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Arunkumar", "Thirunarayan", 100000);

        System.out.println(emp1);

        System.out.println("Employee Full Name: " + emp1.getName());
        System.out.println("Employee Monthly Salary: " + emp1.getSalary());
        System.out.println("Employee Annual Salary: " + emp1.getAnnualSalary());

        emp1.raiseSalary(10);
        System.out.println("Salary after 10% raise: " + emp1.getSalary());

       emp1.setSalary(150000);
        System.out.println("New salary after using setter: " + emp1.getSalary());
        
        System.out.println(emp1);

        System.out.println("Employee Full Name: " + emp1.getName());
        System.out.println("Employee Monthly Salary: " + emp1.getSalary());
        System.out.println("Employee Annual Salary: " + emp1.getAnnualSalary());

        emp1.raiseSalary(10);
        System.out.println("Salary after 10% raise: " + emp1.getSalary());
    }

}
