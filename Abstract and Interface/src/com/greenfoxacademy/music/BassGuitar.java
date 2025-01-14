package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{
    public BassGuitar() {
        this.numberOfStrings = 4;
        this.sound = "Duum-duum-duum";
        this.name = "BassGuitar";
    }
    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.sound = "Duum-duum-duum";
        this.name = "BassGuitar";
    }
    @Override
    public void sound() {
        System.out.println(this.sound);
    }
}
