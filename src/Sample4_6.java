public class Sample4_6 {
    public static void main(String[] args) {

        Car6 cars[] = new Car6[2];

        cars[0] = new Car6();
        cars[0].setCar(123, 20.4);

        cars[1] = new RacingCar6();
        cars[1].setCar(11, 25.4);

        for(int i = 0; i < cars.length; i++){
            cars[i].show();
        }
    }
}
class Car6{
    protected int number;
    protected double gas;

    public Car6(){
        this.number = 0;
        this.gas = 0;
        System.out.println("made a car");
    }
    public Car6(int n, double g) {
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
class RacingCar6 extends Car6{
    private int course;

    public RacingCar6(){
        this.course = 0;
        System.out.println("Made a racing car");
    }

    public RacingCar6(int n, double g, int c) {
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
