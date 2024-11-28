public class Sample4_13 {
    public static void main(String[] args) {

        Car13 car13 = new Car13(123, 3.4);
        car13.vShow();
        car13.mShow();



    }
}

interface iVehicle13{
    void vShow();
}

interface iMaterial{
    void mShow();
}


class Car13 implements iVehicle13, iMaterial{
    private int number;
    private double gas;

    public Car13(int n, double g) {
        this.number = n;
        this.gas = g;
        System.out.println("Made a car number = " + number);
        System.out.println("Made a car gas = " + gas);
    }

    public void vShow(){
        System.out.println("Car number = " + number);
        System.out.println("Car gas = " + gas);
    }

    public void mShow(){
        System.out.println("Car material is metal");
    }
}
