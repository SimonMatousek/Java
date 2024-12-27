package Aircraft_Carrier;

import java.util.Objects;

public class Aircraft {

    private String type;
    private int maxAmmo;
    private int baseDamage;
    private int ammo;

    public Aircraft(String type) {
        setType(type);
        if (type == "F16") {
            setMaxAmmo(8);
            setBaseDamage(30);
        } else if ( type == "F35") {
            setMaxAmmo(12);
            setBaseDamage(50);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void fight() {
        System.out.println(getAmmo() * getBaseDamage());
        setAmmo(0);
    }

    public void getStatus() {
        System.out.println("Type: " + getType() + " Ammo: " + getAmmo() + " Base Damage: " + getBaseDamage() + " All Damage: " + getBaseDamage() * getMaxAmmo());
    }
    public void refillAmmo(int refilled) {
            if (getMaxAmmo() > refilled) {
                setAmmo(refilled);
            } else if (getMaxAmmo() < refilled) {
                System.out.println("Returned ammo: " + (refilled - getMaxAmmo()));
            }
    }
    public boolean isPriority() {
        boolean priority = false;
        if (getType() == "F16") {
            priority = false;
        } else if (getType() == "F35") {
            priority = true;
        }
        System.out.println(priority);
        return priority;
    }
}
    
