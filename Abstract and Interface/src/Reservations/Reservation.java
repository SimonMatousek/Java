package Reservations;

import java.time.DayOfWeek;

public class Reservation implements Reservable{
    public String getBookingDow() {
        int ran = (int) (Math.random() * 7 + 1);
        return DayOfWeek.of(ran).toString();
    }
    public String getBookingCode() {
        String text = "ABCDEFGHIJKL0123456789";
        String out = "";
        for (int i = 0; i < 8; i++) {
            out += text.charAt((int) (Math.random() * text.length()));
        }
        return out;
    }
}
