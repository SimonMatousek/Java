package Wadrobe;

import java.util.Objects;

public class Cloth {
    private String type;
    private String color;
    private int condititon;
    private int daysWorn;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCondititon() {
        return condititon;
    }

    public void setCondititon(int condititon) {
        this.condititon = condititon;
    }

    public int getDaysWorn() {
        return daysWorn;
    }

    public void setDaysWorn(int daysWorn) {
        this.daysWorn = daysWorn;
    }
    public Cloth(String type, String color, int condititon) {
        setType(type);
        setColor(color);
        setCondititon(condititon);
        setDaysWorn(0);
    }
    public boolean needsToBeWashed() {
        boolean washing = false;
        if (Objects.equals(getType(), "Overwear")) {
            if (getDaysWorn() > 5) {
                System.out.println("Your Overwear needs to be washed");
                washing = true;
            } else  {
                System.out.println("Your Overwear is still clean");
            }
        } else if(Objects.equals(getType(), "Underwear")) {
            if (getDaysWorn() > 1) {
                System.out.println("Your Underwear needs to be washed");
                washing = true;
            } else {
                System.out.println("Your Underwear ist still clean");
            }
        }
        return washing;
    }
    public void needsToBeRepaired() {
        if (Objects.equals(getType(), "Overwear")) {
            if (getCondititon() < 1 && getCondititon() > 5) {
                System.out.println("Your Overwear needs to be repaired");
            } else  {
                System.out.println("Your Overwear is still ok");
            }
        } else if(Objects.equals(getType(), "Underwear")) {
            if (getCondititon() == 0) {
                System.out.println("Your Underwear needs to be repaired but it is not possible");
            } else {
                System.out.println("Your Underwear ist still fine");
            }
        }
    }
    public void wear() {
        try { if (!needsToBeWashed()) {
            setDaysWorn(getDaysWorn() + 1);
        }
        } catch (Exception e) {
                System.out.println("You must wash your clothes");
        }

    }
    public void repair() {
        setCondititon(condititon);
    }
    public void getInfo() {
        System.out.println(getColor() + getType() + " worn for " + getDaysWorn() + " days, has " + getCondititon() + " wash cycles left");
    }
}
