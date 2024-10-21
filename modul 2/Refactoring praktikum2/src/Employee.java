public class Employee {

    public String name;

    public int id;

    public double salary;

    public String department;

    //====== Setter ======//
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static final double BONUS_RATE = 0.1;

    public Employee(String name, int id, double salary, String department) {

        setName(name);
        setId(id);
        setSalary(salary);
        setDepartment(department);

    }

    public void printDetails() {
        System.out.println("\n===== Employee Details =====");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);

    }

    public void applyBonus() {

        salary += calculateBonus();

        System.out.println("\n>>Bonus applied. New salary: " + salary);

    }

    private double calculateBonus() {
        return salary *     BONUS_RATE;
    }

    public void updateDepartment(String newDepartment) {

        department = newDepartment;

        System.out.println("\n>>Department updated to: " + department);

    }

}