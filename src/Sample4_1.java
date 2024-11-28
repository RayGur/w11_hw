public class Sample4_1 {
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar();

        rccar1.setCar(123, 20.1);

        rccar1.setCourse(3);
    }
}
class Car{
    private int num;
    private double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("made a car");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("set num to " + num + ", gas to " + gas );
    }

    public void show(){
        System.out.println("num = " + num + ", gas = " + gas);
    }
}
class RacingCar extends Car{
    private int course;

    public RacingCar(){
        course = 0;
        System.out.println("made a racing car");
    }

    public void setCourse(int c){
        course = c;
        System.out.println("set course to " + course);
    }
}