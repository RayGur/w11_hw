public class Sample4_5 {
    public static void main(String[] args) {
        Car5 car5 = new RacingCar5(1, 2.51, 1);

        car5.setCar(1235, 55.1);

        car5.show();

    }
}
class Car5{
    protected int number;
    protected double gas;

    public Car5(){
        this.number = 0;
        this.gas = 0;
        System.out.println("made a car");
    }
    public Car5(int n, double g) {
        this.number = n;
        this.gas = g;
        System.out.println("Made a car number = " + number);
        System.out.println("Made a car gas = " + gas);
    }

    public void setCar(int n, double g) {
        this.number = n;
        this.gas = g;
        System.out.println("Set car number = " + number);
        System.out.println("Set car gas = " + gas);
    }

    public void show(){
        System.out.println("Car number = " + number);
        System.out.println("Car gas = " + gas);
    }
}
class RacingCar5 extends Car5{
    private int course;

    public RacingCar5(){
        this.course = 0;
        System.out.println("Made a racing car");
    }

    public RacingCar5(int n, double g, int c) {
        super(n, g);
        this.course = c;
        System.out.println("Made a racing car course = " + course);
    }

    public void setCourse(int c) {
        this.course = c;
        System.out.println("Set course to " + course);
    }

    public void show(){
        System.out.println("Racing car number = " + number);
        System.out.println("Racing car gas = " + gas);
        System.out.println("Racing car course = " + course);

    }
}
