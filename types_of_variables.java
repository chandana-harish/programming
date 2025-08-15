import java.util.Scanner;

class Car {
    static int wheels = 4;// ststic variable
    String color;// ins var
    int year;// ins var

    public void display() {
        String display = "Car details";// local variable
        System.out.println(display);
        System.out.println("color" + color);
        System.out.println("year" + year);
        System.out.println(Car.wheels);
    }
}

public class types_of_variables {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "blue";
        car2.color = "red";
        car1.year = 2021;
        car2.year = 2022;
       

        car.display();
        

    }

}
