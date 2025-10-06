package lessons.lesson03.basicClasses;

public class Car {
    private final String country;
    private final String model;
    private final int yearOfManufacture;

    public Car(String country, String model, int yearOfManufacture) {
        this.country = country;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void printInfo() {
        System.out.println("Information about car:" +
                "\nThe country of a car is " + country +
                "\nThe model is " + model +
                "\nThe year of made is " + yearOfManufacture);
    }
}
