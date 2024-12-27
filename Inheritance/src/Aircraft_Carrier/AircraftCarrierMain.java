package Aircraft_Carrier;

public class AircraftCarrierMain {
    public static void main(String[] args) {
        Aircraft aircraft1 = new Aircraft("F35");
        Aircraft aircraft2 = new Aircraft("F16");
        Carrier carrier1 = new Carrier(50, 6);
        Carrier carrier2 = new Carrier(80, 1);

        carrier1.add("F35");
        carrier1.add("F16");

        carrier1.fill();
        carrier1.getStatus();
        carrier2.getStatus();
    }
}
