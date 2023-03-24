package bean;

public class HE extends Employee{
    private int hrs;

    public HE() {
    }

    public HE(int hrs) {
        this.hrs = hrs;
    }

    public HE(int id, String name, String email, double salary, int hrs) {
        super(id, name, email, salary);
        this.hrs = hrs;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
}
