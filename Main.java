public class Main {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89233125644", 30000, 30);
        persArray[0].info();

        persArray[1] = new Employee("Popov Andrey", "Miner", "andrew1234@rambler.ru", "89078947367", 47000, 33);
        persArray[1].info();

        persArray[2] = new Employee("Klyachin Sergey", "Electrician", "siroga45@mail.ru", "89089089564", 35000, 34);
        persArray[2].info();

        persArray[3] = new Employee("Basov Semen", "Chauffeur", "sen'ka4321@gmail.com", "89059654578", 15000, 56);
        persArray[3].info();

        persArray[4] = new Employee("Petrov Boris", "Welder", "bbborya65@mail.ru", "89237589902", 28500, 45);
        persArray[4].info();

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].old();
        }
    }
}