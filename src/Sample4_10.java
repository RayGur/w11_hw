public class Sample4_10 {
    public static void main(String[] args) {

        Vehicle vc[] = new Vehicle[2];

        vc[0] = new Car10(123, 50.2);
        vc[0].setSpeed(5);

        vc[1] = new Plane(5);
        vc[1].setSpeed(52);

        for(int i = 0; i < vc.length; i ++){
            vc[i].show();
        }
    }
}
abstract class Vehicle{

    protected int speed;
    public void setSpeed(int s){
        this.speed = s;
        System.out.println("Speed = " + speed);
    }

    abstract void show();
}
class Car10 extends Vehicle{
    private int number;
    private double gas;

    public Car10(int n, double g) {
        this.number = n;
        this.gas = g;
        System.out.println("Made a car number = " + number);
        System.out.println("Made a car gas = " + gas);
    }

    public void show(){
        System.out.println("Car number = " + number);
        System.out.println("Car gas = " + gas);
        System.out.println("Car speed = " + speed);
    }
}
class Plane extends Vehicle{
    private int flight;

    public Plane(int f){
        flight = f;
        System.out.println("flight number = " + flight);
    }
    public void setFlight(int f){
        this.flight = f;
        System.out.println("Set flight number = " + flight);
    }

    public void show(){
        System.out.println("Plane number = " + flight);
        System.out.println("Plane speed = " + speed);
    }
}
