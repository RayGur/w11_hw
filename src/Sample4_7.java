public class Sample4_7 {
    public static void main(String[] args) {

        Car7 car7 = new Car7();

        car7.setCar(1234, 20.5);

        System.out.println(car7);
    }
}
class Car7{
    protected int number;
    protected double gas;

    public Car7(){
        this.number = 0;
        this.gas = 0;
        System.out.println("made a car");
    }
    public Car7(int n, double g) {
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

    public String toString(){
        String str = "number = " + number + ", gas = " + gas;
        return str;
    }
}
