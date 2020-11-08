public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Беляш");

        Dog dog1 = new Dog("Дружок");
        Dog dog2 = new Dog("Бобик");

        dog1.run(600);
        dog1.swim(7);
        dog1.jump(0.6);

        System.out.println();

        cat1.run(700);
        cat1.swim(3);
        cat1.jump(1.8);

        System.out.println();

        dog2.run(300);
        dog2.swim(15);
        dog2.jump(0.3);

        System.out.println();

        cat2.run(150);
        cat2.swim(20);
        cat2.jump(2.7);
    }
}