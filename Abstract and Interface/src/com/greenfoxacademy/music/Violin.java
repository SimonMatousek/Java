package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{
    public Violin() {
        this.numberOfStrings = 4;
        this.sound = "Screech";
        this.name = "Violin";
    }
    @Override
    public void sound() {
        System.out.println(this.sound);
    }
}
