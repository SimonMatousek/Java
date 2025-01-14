package Aircraft_Carrier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private List<Aircraft> listOfAircraft = new ArrayList<>();
    private int ammo;
    private int initialAmmo;
    private int healthPoint;

    public Carrier(int initialAmmo, int healthPoint) {
        setInitialAmmo(initialAmmo);
        setHealthPoint(healthPoint);
    }

    public List<Aircraft> getListOfAircraft() {
        return listOfAircraft;
    }

    public void setListOfAircraft(List<Aircraft> listOfAircraft) {
        this.listOfAircraft = listOfAircraft;
    }

    public int getInitialAmmo() {
        return initialAmmo;
    }

    public void setInitialAmmo(int initialAmmo) {
        this.initialAmmo = initialAmmo;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void add(String type) {
        List<Aircraft> toAdd = listOfAircraft;
        toAdd.add(new Aircraft(type));
        setListOfAircraft(toAdd);
    }

    public void fill() {
        try {
            for (Aircraft aircraft : listOfAircraft) {
                if (getAmmo() > 0) {
                    if (getAmmo() < aircraft.getMaxAmmo()) {
                        aircraft.refillAmmo(aircraft.getMaxAmmo());
                        setAmmo(getAmmo() - aircraft.getMaxAmmo());
                    } else if(aircraft.isPriority()){
                        aircraft.refillAmmo(aircraft.getMaxAmmo());
                        setAmmo(getAmmo() - aircraft.getMaxAmmo());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("No ammo!!");
        }
    }

    public void fight(Carrier enemy) {
        for (Aircraft aircraft : listOfAircraft) {
            enemy.setHealthPoint(aircraft.getAmmo() * aircraft.getBaseDamage());
            aircraft.setAmmo(0);
        }
    }

    public void getStatus() {
        if (getHealthPoint() > 0) {
            System.out.println("HP: " + getHealthPoint() + ", Aircraft count: " + listOfAircraft.size() + ", Ammo Storage: " + getAmmo() + ", Total damage: " + (getInitialAmmo() - getAmmo()));
            for (Aircraft aircraft : listOfAircraft) {
                System.out.println("Type " + aircraft.getType() + ",Ammo " + aircraft.getAmmo() + ",Base Damage " + aircraft.getBaseDamage() + ",All Damage " + (aircraft.getAmmo() * aircraft.getBaseDamage()));
            }
        } else {
            System.out.println("It's dead Jim :(");
        }
    }
}