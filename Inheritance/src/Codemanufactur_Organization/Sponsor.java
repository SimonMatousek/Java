package Codemanufactur_Organization;

public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }
    public Sponsor() {
        this.name = "John Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + " ,a " + this.age + " year old " + this.gender + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far");
    }
    public void hire() {
        this.hiredStudents ++;
    }
    public void getGoal() {
        System.out.println("My goal is to: Hire brilliant junior software developers.");
    }
}
