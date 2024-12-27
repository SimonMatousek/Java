package Codemanufactur_Organization;

public class Mentor extends Person {

    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = "intermediate";
    }
    public Mentor() {
        this.name = "John Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }
    public void getGoal() {
        System.out.println("My goal ist to: Educate brilliant junior software developers.");
    }
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + " ,a " + this.age + " year old " + this.gender + " " + this.level + " mentor");
    }
}
