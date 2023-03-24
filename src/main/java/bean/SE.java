package bean;

public class SE extends Employee{
    private String tool;

    public SE() {

    }

    public SE(String tool) {
        this.tool = tool;
    }

    public SE(int id, String name, String email, double salary, String tool) {
        super(id, name, email, salary);
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
}
