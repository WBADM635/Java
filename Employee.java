public class Employee {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void info() {
        System.out.println(String.format("ФИО        %s", fullname));
        System.out.println(String.format("Должность  %s", position));
        System.out.println(String.format("email      %s", email));
        System.out.println(String.format("Телефон    %s", phone));
        System.out.println(String.format("Зарплата   %s", salary));
        System.out.println(String.format("Возраст    %s", age));
        System.out.println();
    }

    void old() {
        System.out.println("Старше 40 лет:");
        System.out.println(String.format("ФИО        %s", fullname));
        System.out.println(String.format("Должность  %s", position));
        System.out.println(String.format("email      %s", email));
        System.out.println(String.format("Телефон    %s", phone));
        System.out.println(String.format("Зарплата   %s", salary));
        System.out.println(String.format("Возраст    %s", age));
        System.out.println();
    }
}
