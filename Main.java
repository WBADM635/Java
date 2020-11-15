public class Main {

    public static void main(String[] args) {

        Cat[] x = {new Cat("Беляш", 20), new Cat("Барсик", 17), new Cat("Мурзик", 24)};
        Plate plate = new Plate(40);
        System.out.println("\n" + plate);
        System.out.println();
        System.out.println("Добавляем еды");
        System.out.println();
        plate.increaseFood(20);
        System.out.println(plate);
        System.out.println();
        System.out.println("Коты кушают по очереди:");
        for (Cat a : x) {
            a.eat(plate);
            System.out.println(a);
            System.out.println(plate);
        }
    }
}