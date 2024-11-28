public class Sample4_4 {
    public static void main(String[] args) {
        RacingCar4 rccar4 = new RacingCar4(1, 2.51, 1);

        rccar4.setCar(1234, 55.1);
        rccar4.setCourse(6);

        rccar4.show();

    }
}
class Car4{
    protected int number;
    protected double gas;

    public Car4(){
        this.number = 0;
        this.gas = 0;
        System.out.println("made a car");
    }
    public Car4(int n, double g) {
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
class RacingCar4 extends Car4{
    private int course;

    public RacingCar4(){
        this.course = 0;
        System.out.println("Made a racing car");
    }

    public RacingCar4(int n, double g, int c) {
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
