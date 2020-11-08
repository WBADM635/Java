abstract class Animals {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    public Animals(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.name + " пробежал " + dist + " м.");
        else System.out.println(this.name + " не может бежать такое расстояние ");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.name + " проплыл " + dist + " м.");
        else System.out.println(this.name  + " не может бежать такое расстояние ");
    }

    public void jump(double height) {
        if (this.maxJump >= height)
            System.out.println(this.name + " прыгнул " + height + " м");
        else System.out.println(this.name + " не может прыгать так высоко");
    }
}