public class Sample4_8 {
    public static void main(String[] args) {

        Car8 cars[] = new Car8[3];

        cars[0] = new Car8();
        cars[0].setCar(123, 20.4);

        cars[1] = new Car8();
        cars[1].setCar(11, 25.4);

        cars[2] = cars[0];

        System.out.println("car0 and 1 differes " + cars[0].equals(cars[1]));
        System.out.println("car0 and 1 differes " + cars[0].equals(cars[2]));
    }
}
class Car8{
    protected int number;
    protected double gas;

    public Car8(){
        this.number = 0;
        this.gas = 0;
        System.out.println("made a car");
    }
    public Car8(int n, double g) {
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

