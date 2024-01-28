package Activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car() {
        this.tyres = 4;
        this.doors = 4;
    }

    public  void displayCharacteristics(){
        System.out.println("Color of the car : "+color);
        System.out.println("make of the car: "+make);
        System.out.println("No of tyres on the car: "+tyres);
        System.out.println("No of doors on the car: "+doors);
    }


    public void accelerate(){
        System.out.println("Car is moving forward");

    }

    public void brake (){
        System.out.println("Car has stopped");

    }
}
