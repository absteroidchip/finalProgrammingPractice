package bsu.comp152;

public class Car {

    // Define three instance variables.
    private String makeModel;
    private int year;
    private int speed;

    // How could we do practice with throwing exceptions?

    /**
     * Constructor to initialize makeModel and year and set speed to 0
     *
     * @param mk
     * @param yr
     */
    public Car(String mk, int yr) {
        makeModel = mk;
        if (yr < 1900) {
            throw new IllegalArgumentException("Year must be later than 1900.");
        }
        year = yr;
        speed = 0;
    }

    /**
     * Accessor for makeModel
     *
     * @return makeModel
     */
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * Accessor for year
     *
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Accessor for speed
     *
     * @return return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Mutator to add 5 mph to the speed.
     */
    public void accelerate() {
        speed = speed + 5;
    }

    /**
     * Mutator to subtract 5 mph from the speed.
     */
    public void brake() {
        speed = speed - 5;
    }

    /**
     * Accessor returns a string of the form year make model. For example, if you print the car with the make and model Toyota Prius and the year 2010 from client code, you will see 2010 Toyota Prius.
     *
     * @return year + " " + makeModel
     */
    @Override
    public String toString() {
        return year + " " + makeModel;
    }

    /**
     * Accessor returns whether the make and model of the car is the same as the make and model of the other car and the year is the same as the other year
     *
     * @param other
     * @return whether makeModels and years are equal
     */
    public boolean equals(Car other) {
        return makeModel.equals(other.makeModel) && year == other.year;
    }

    /**
     * Acccessor returns return whether the speed exceeds the limit
     *
     * @param limit
     * @return speed > limit
     */
    public boolean isSpeeding(int limit) {
        return speed > limit;
    }

    /**
     * Accessor returns whether the car is traveling at a higher speed than the other car
     */
    public boolean isFaster(Car other) {
        return speed > other.speed;
    }

    /**
     * Mutator updates the speed
     * @param newSpeed
     */
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    /**
     * Method makes a copy of the car
     * @return the copy
     */
    public Car copy() {
        Car newCar = new Car(makeModel, year);
        newCar.speed = speed;
        return newCar;
    }
}
