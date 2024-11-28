public class Sample4_11 {
    public static void main(String[] args) {

        Vehicle11 vc[] = new Vehicle11[2];

        vc[0] = new Car11(123, 50.2);
        vc[1] = new Plane11(5);

        for(int i = 0; i < vc.length; i ++){
            if (vc[i]instanceof Car11){
                System.out.println("object no " + (i + 1) + " is in class Car11");
            }else{
                System.out.println("object no " + (i + 1) + " is not in class Car11");
            }
        }
    }
}

abstract class Vehicle11{
    protected double speed;


    abstract void show();
}


class Car11 extends Vehicle11{
    private int number;
    private double gas;

    public Car11(int n, double g) {
        this.number = n;
        this.gas = g;
        System.out.println("Made a car number = " + number);
        System.out.println("Made a car gas = " + gas);
    }

    public void show(){
        System.out.println("Car number = " + number);
        System.out.println("Car gas = " + gas);
    }
}
class Plane11 extends Vehicle11{
    private int flight;

    public Plane11(int f){
        flight = f;
        System.out.println("flight number = " + flight);
    }
    public void setFlight(int f){
        this.flight = f;
        System.out.println("Set flight number = " + flight);
    }

    public void show(){
        System.out.println("Plane number = " + flight);
    }
}
