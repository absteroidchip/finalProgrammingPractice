package bsu.comp152;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void testStopSetsSpeedToZero(){
        Car car = new Car("Honda Accord", 1999);
        car.setSpeed(50);
        car.stop();
        assert(car.getSpeed() == 0);
    }

    @Test
    void testIsNewerReturnsTrueIfCarIsNewer(){
        Car newerCar = new Car("Tesla", 2018);
        Car olderCar = new Car("Chevy BelAir", 1956);
        assert(newerCar.isNewer(olderCar) == true);
    }

    @Test
    void testIsNewerReturnsFalseIfCarIsOlder(){
        Car newerCar = new Car("Tesla", 2018);
        Car olderCar = new Car("Chevy BelAir", 1956);
        assert(olderCar.isNewer(newerCar) == false);
    }

    @Test
    void testIsNewerReturnsFalseIfCarsSameAge(){
        Car car1 = new Car("Kia Sorento", 2014);
        Car car2 = new Car("Kia Soul", 2014);
        assert(car1.isNewer(car2) == false);
    }
}
