package bean;

public class Admin extends Employee{
    public Admin() {
    }

    public Admin(String branch) {
        this.branch = branch;
    }

    public Admin(int id, String name, String email, double salary, String branch) {
        super(id, name, email, salary);
        this.branch = branch;
    }

    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
