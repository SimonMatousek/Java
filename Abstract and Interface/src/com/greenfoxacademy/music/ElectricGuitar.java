package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{
    public ElectricGuitar() {
        this.numberOfStrings = 6;
        this.sound = "Twang";
        this.name = "Electric Guitar";
    }
    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.sound = "Twang";
        this.name = "Electric Guitar";
    }
    @Override
    public void sound() {
        System.out.println(this.sound);
    }
}
