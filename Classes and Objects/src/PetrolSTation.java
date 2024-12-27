public class PetrolSTation {
    public static void main(String[] args) {
        /*
    Create Station and Car classes
    Station
        it stores how much gas is available: gasAmount
        the gas amount must be given when we create a station
        it can refill a car: refill(car):
            decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
            increases the car's gasAmount
    Car
        it stores how much gas is actually present: gasAmount
        it stores the capacity of the tank: capacity
        create a constructor for the Car class where you:
            initialize gasAmount -> 0
            initialize capacity -> 100

         */
        Station station = new Station(1000);
        Car car = new Car();
        System.out.println("station gasAmount before:" + station.gasAmount);
        System.out.println("car gasAmount before:" + car.gasAmount);
        station.refill(car);
        System.out.println("car gasAmount after:" + car.gasAmount);
        System.out.println("station gasAmount after:" + station.gasAmount);
    }
}
