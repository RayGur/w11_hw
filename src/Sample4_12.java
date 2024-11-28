public class Sample4_12 {
    public static void main(String[] args) {

        iVehicle ivc[] = new iVehicle[2];

        ivc[0] = new Car12(123, 50.2);


        ivc[1] = new Plane12(5);


        for(int i = 0; i < ivc.length; i ++){
            ivc[i].show();
        }
    }
}

interface iVehicle{
    int weight = 1000;
    void show();
}


class Car12 implements iVehicle{
    private int number;
    private double gas;

    public Car12(int n, double g) {
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
class Plane12 implements iVehicle{
    private int flight;

    public Plane12(int f){
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
