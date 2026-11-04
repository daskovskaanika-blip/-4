package tatata;
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(
                1, "Вероніка", "Дашковська", "програміст"
        );

        WorkDay workDay = new WorkDay(
                1, 1, "29.09.26", "09:00", "18:00", 8.0
        );

        TimeRecord timeRecord = new TimeRecord(
                1, 1, "29.09.26", 8.0, "завершила"
        );

        Admin admin = new Admin(
                1, "адміністратор", "admin", "admin"
        );

        System.out.println(employee);
        System.out.println(workDay);
        System.out.println(timeRecord);
        System.out.println(admin);

        employee.setPosition("менеджер");
        System.out.println("нова посада: "
                + employee.getPosition());

        workDay.startWork();
        workDay.endWork();

        admin.viewEmployeeInfo(employee);
        admin.viewTimeRecord(timeRecord);
    }
}