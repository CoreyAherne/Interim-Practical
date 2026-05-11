public class car {
    private String make;
    private String model;
    private int year;
    private String color;

    car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    public String getMake() {
        return make;
    }
}
