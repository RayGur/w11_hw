public class Sample4_3 {
    public static void main(String[] args) {
        RacingCar3 rccar3 = new RacingCar3(1, 2.1, 1);

        rccar3.newShow();

    }
}
class Car3{
    protected int number;
    protected double gas;

    public Car3(){
        number = 0;
        gas = 0;
        System.out.println("made a car");
    }
    public Car3(int n, double g) {
        number = n;
        gas = g;
        System.out.println("made a car and set number to " + number + ". gas is " + gas);
    }

    public void setCar(int n, double g) {
        number = n;
        gas = g;
        System.out.println("set number to " + number + ". gas is " + gas);
    }

    public void show(){
        System.out.println("number is " + number + ". gas is " + gas);
    }
}
class RacingCar3 extends Car3{
    private int course;

    public RacingCar3(){
        course = 0;
        System.out.println("made a racing car");
    }

    public RacingCar3(int n, double g, int c) {
        super(n, g);
        course = c;
        System.out.println("made a racing car and set course = " + course);
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("set course to " + course);
    }

    public void newShow(){
        System.out.println("Racing car number = " + number);
        System.out.println("Racing car gas = " + gas);
        System.out.println("Racing car course = " + course);

    }
}
