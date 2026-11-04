package tatata;
public class Admin {
    private int id;
    private String full_name;
    private String login;
    private String role;

    public Admin(int id, String full_name,
                 String login, String role) {
        this.id = id;
        this.full_name = full_name;
        this.login = login;
        this.role = role;
    }
    public int getId() {
        return id;
    }
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void viewEmployeeInfo(Employee employee) {
        employee.showInfo();
    }
    public void viewTimeRecord(TimeRecord record) {
        System.out.println(record);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", login='" + login + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}