public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid.
        //
        // Set the 3 sides to 10.4, 13.5, 8.2 and your program should
        // produce the following output:
        //
        // Surface Area: 672.76
        // Volume: 1151.28
        double siteA = 10.4;
        double siteB = 13.5;
        double siteC = 8.2;

        System.out.println("surface area:" + 2 * ((siteA * siteB)  + (siteA * siteC) + (siteB * siteC)));
        System.out.println("volume:" +siteA * siteB * siteC);

    }
}