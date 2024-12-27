import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party,
        // the second represents the number of boys
        //
        // If the number of girls and boys are equal and 20 or more people are
        // coming to the party, it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy
        // ratio is not 1-1, it should print: Quite a cool party!
        //
        // If there are fewer than 20 people coming,
        // it should print: Average Party ...
        //
        // If no girls are coming, regardless the count of the people,
        // it should print: Sausage party
        //
        // Please enter the number of girls: 15
        // Please enter the number of boys: 25
        // Quite a cool party!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of girls");
        int userInput1 = scanner.nextInt();
        System.out.println("Please enter the number of boys");
        int userInput2 = scanner.nextInt();
        if (userInput1 == userInput2 && userInput1+userInput2 >= 20 && userInput1 > 0){
            System.out.println(" The party is excellent!");
        } else if (userInput1 + userInput2 >= 20 && userInput1 > 0) {
            System.out.println("Quite a cool party!");
        } else if (userInput1 + userInput2 < 20  && userInput1 > 0) {
            System.out.println(" Average Party ...");
        } else if (userInput1 == 0) {
            System.out.println("Sausage party");
        }
    }
}
