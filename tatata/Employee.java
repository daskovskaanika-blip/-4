package tatata;
public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String position;

    public Employee(int id, String first_name,
                    String last_name, String position) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}