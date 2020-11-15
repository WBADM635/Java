public class Plate {
    private int amountFood;

    Plate(int amountFood) {
        this.amountFood = amountFood;
    }

    @Override
    public String toString() {
        return "В тарелке еды: " + amountFood;
    }

    void decreaseFood(int satiety) {
        if (amountFood >= satiety) {
            amountFood -= satiety;
        }
    }

    int getAmountFood() {
        return amountFood;
    }

    void increaseFood(int amount) {
        amountFood += amount;
    }
}