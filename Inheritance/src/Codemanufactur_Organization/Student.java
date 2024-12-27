package Codemanufactur_Organization;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.skippedDays = 0;
        this.previousOrganization = "The school of Life";
    }
    public Student(String name,int age,String gender,String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    public void getGoal() {
        System.out.println("My goal is to: Be a junior developer.");
    }
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + " ,a " + this.age + " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
    }
    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
}
