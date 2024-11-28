public class Sample4_9 {
    public static void main(String[] args) {

        Car9 cars[] = new Car9[2];

        cars[0] = new Car9();
        cars[0].setCar(123, 20.4);

        cars[1] = new RacingCar9();
        cars[1].setCar(11, 25.4);

        for(int i = 0; i < cars.length; i++){
            Class cl = cars[i].getClass();
            System.out.println("number " + (i + 1) + " object is in class" + cl);
        }
    }
}
class Car9{
    protected int number;
    protected double gas;

    public Car9(){
        this.number = 0;
        this.gas = 0;
        System.out.println("made a car");
    }
    public Car9(int n, double g) {
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
class RacingCar9 extends Car9{
    private int course;

    public RacingCar9(){
        this.course = 0;
        System.out.println("Made a racing car");
    }

    public RacingCar9(int n, double g, int c) {
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
