public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.type = "Cat";
        this.maxRun = 200;
        this.maxJump = 2.0;
    }

    @Override
    public void swim(int dist) {
        System.out.println("Кошки не умеют плавать ");
    }
}