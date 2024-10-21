public class Employee {
    //1. Buatlah method setter dari variable name, id, salary, dan departemen dalam kelas Employee
    //(Clue: Method setter saja tidak perlu getter)
    private String name;
    private int id;
    private double salary;
    private String department;
    public static final double BONUS_RATE = 0.1;

    public Employee(String name, int id, double salary, String department) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
        this.setDepartment(department);
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public void applyBonus() {
        //2. Ekstrak logika perhitungan bonus ke dalam method terpisah dalam kelas Employee dengan
        //nama calculateBonus() (Clue: Extract Method)
        setSalary(salary + calculateBonus());
        //3. Lakukan refactoring Inline Varible pada variable bonus dalam method applyBonus! (clue:Inline
        //Variable)
        System.out.println("Bonus applied! New salary: " + salary);
    }

    private double calculateBonus() {
        double bonus = salary * BONUS_RATE;
        return bonus;
    }

    public void updateDepartment(String newDepartment) {
        setDepartment(newDepartment);
        System.out.println("Department updated to: " + department);
    }

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
}
class Project {
    public String projectName;
    public String projectDeadline;
    public Employee projectLeader;
    public double budget;

    public Project(String projectName, String projectDeadline, Employee projectLeader, double budget) {
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
        this.projectLeader = projectLeader;
        this.budget = budget;
    }

    public void printProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Deadline: " + projectDeadline);
        System.out.println("Budget: " + budget);
        projectLeader.printDetails();
    }

    public void updateBudget(double newBudget) {
        budget = newBudget;
        System.out.println("Budget updated to: " + budget);
    }
}

class Client {
    public String clientName;
    public String clientEmail;
    public Project project;

    public Client(String clientName, String clientEmail, Project project) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.project = project;
    }

    public void printClientDetails() {
        System.out.println("Client Name: " + clientName);
        System.out.println("Client Email: " + clientEmail);
        project.printProjectDetails();
    }
}
//4. Buatlah kelas baru dengan nama Main!
//5. Pindahkan method main ke dalam kelas baru bernama Main menggunaka teknik refactoring
//(Clue: Move members)


