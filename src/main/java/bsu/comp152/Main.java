package bsu.comp152;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Prius", 2010);
        Car carCopy = car1.copy();

        // Make it go 50 mph.
        car1.setSpeed(50);
        // Call a getter on the car object to print the car's speed.
        System.out.println(car1.getSpeed());
        // Print the car object.
        System.out.println(car1);
        /*
         * Call the accelerate method twice to make the car accelerate twice. Call the brake method to make it brake once.
         */
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        // Call a getter on the car object to print the car's speed.
        System.out.println(car1.getSpeed());
        /*
         * Call the isSpeeding method on the car to determine whether the car is speeding in a 55 mph zone.
         */
        System.out.println(car1.isSpeeding(55));
        // Car car2 = new Car("Honda Civic", 1897);
        Car car2 = new Car("Honda Civic", 1997);
        car2.setSpeed(75);
        /*
         * Call the isFaster method on the first car to confirm that the first car is going more slowly than the second car.
         */
        System.out.println(car1.isFaster(car2));

        // How could we practice with ArrayLists?

        ArrayList<Car> fleet = new ArrayList<Car>();
        fleet.add(car1);
        fleet.add(car2);

        System.out.println(fleet);

        System.out.println();

        // We can loop through item-by-item:
        for (Car car : fleet){
            System.out.println(car);
        }

        System.out.println();

        // We can loop through index-by-index:
        for (int i = 0; i < fleet.size(); i++){
            System.out.println(fleet.get(i));
        }

        System.out.println(car1);
        System.out.println(carCopy);
    }
}