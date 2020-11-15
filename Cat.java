public class Cat {
    private String name;
    private int satiety;
    private boolean full;

    Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
        this.full = false;
    }

    @Override
    public String toString() {
        return "Кот: " + name + ", сытость: " + satiety + ", хватило еды: " + full;
    }

    void eat(Plate plate) {
        if (plate.getAmountFood() >= satiety) {
            plate.decreaseFood(satiety);
           full = true;
        }
    }
}