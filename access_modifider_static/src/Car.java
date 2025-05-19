public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Mazda 7", "Skyactiv 7");
        System.out.println(Car.numberOfCars);
        Car car4 = new Car("Mazda 8", "Skyactiv 8");
        car4.setName("Mazda 9");
        car4.setEngine("Skyactiv 9");
        System.out.println(Car.numberOfCars + " " + car4.getName() + " " + car4.getEngine());
    }
}
