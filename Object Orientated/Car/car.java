public class car {

    //creating the variables for the car class, using private so only extendions of the class can use them
    private String make;
    private String model;
    private int year;
    private String color;

//creating the first constructor for the car class, this will be used to create the car objects
    car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }
// a simple method to return the make variable
    public String getMake() {
        return make;
    }
}
