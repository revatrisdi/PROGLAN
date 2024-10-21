import InfoTiketPesawat.Info;

class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("John Doe", 12345, 75000, "Engineering");
        Project proj = new Project("AI Development", "2024-12-31", emp, 1000000);
        Client client = new Client("Acme Corp", "contact@acme.com", proj);
        Pemesanan tiketPesawat = new TiketPesawat(new Info("John Doe", "Jakarta", "Surabaya", 500000, 0.1));

        client.printClientDetails();
        emp.applyBonus();
        emp.updateDepartment("Research and Development");
        proj.updateBudget(1200000);
        tiketPesawat.tampilkanInformasi();
    }
}
