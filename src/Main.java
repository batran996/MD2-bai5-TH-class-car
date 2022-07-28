public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Car");
//        khoi tao doi tuong car1
        Car car1 = new Car("Mazda3", "Skyactiv");
         System.out.println(Car.numberOfCars);
        car1.display();
        Car car2 = new Car("mazda6", "Skyactiv");
        System.out.println(Car.numberOfCars);
        car2.display();

    }
}