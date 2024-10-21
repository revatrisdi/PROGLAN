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
        System.out.println("\n===== Project Details =====");
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Deadline: " + projectDeadline);
        System.out.println("Budget: " + budget);
        projectLeader.printDetails();
    }

    public void updateBudget(double newBudget) {
        budget = newBudget;
        System.out.println("\n>>Budget updated to: " + budget);
    }
}

