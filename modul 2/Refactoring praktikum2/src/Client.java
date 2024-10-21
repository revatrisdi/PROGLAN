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
        System.out.println("\n===== Client Details =====");
        System.out.println("Client Name: " + clientName);
        System.out.println("Client Email: " + clientEmail);
        project.printProjectDetails();
    }
}
