public class Sample4_2 {
    public static void main(String[] args) {
        RacingCar2 rccar2 = new RacingCar2(123, 3.4, 5);
    }
}
class Car2{
    private int number;
    private double gas;

    public Car2(){
        number = 0;
        gas = 0;
        System.out.println("made a car");
    }
    public Car2(int number, double gas) {
        number = number;
        gas = gas;
        System.out.println("made a car and set number to " + number + ". gas is " + gas);
    }

    public void setCar(int number, double gas) {
        number = number;
        gas = gas;
        System.out.println("set number to " + number + ". gas is " + gas);
    }

    public void show(){
        System.out.println("number is " + number + ". gas is " + gas);
    }
}
class RacingCar2 extends Car2{
    private int course;

    public RacingCar2(){
        course = 0;
        System.out.println("made a racing car");
    }

    public RacingCar2(int number, double gas, int course) {
        super(number, gas);
        course = course;
        System.out.println("made a racing car and set course = " + course);
    }

    public void setCourse(int course) {
        course = course;
        System.out.println("set course to " + course);
    }
}
