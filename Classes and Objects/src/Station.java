public class Station {
    int gasAmount;
    public Station (int gasAmount) {
        this.gasAmount = gasAmount;
    }
    public void refill(Car car) {
        if (this.gasAmount >= car.capacity) {
            this.gasAmount -= car.capacity;
            car.gasAmount += car.capacity;
        } else {
            System.out.println("There is not enough gas for your car");
        }
    }
}
