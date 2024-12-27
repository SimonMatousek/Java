import java.util.Scanner;

public class GuessMyNumber {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lives = 5;
         System.out.println("Please enter the min and max for the guess range:");
         int userInputmin = scanner.nextInt();
         int userInputmax = scanner.nextInt();
         System.out.println("Guess a Number between" + " " + userInputmin + " and " + userInputmax);
         int randomnumber = userInputmin +  (int) (Math.random() * userInputmax - userInputmin);
         int i = 0;
         while (i < 1) {
             int userInput1 = scanner.nextInt();
             if (userInput1 == randomnumber) {
                 System.out.println("You've won!");
                 i += 1;
             } else if (userInput1 < randomnumber) {
                 System.out.println("Too low. Try again:");
             } else if (userInput1 > randomnumber) {
                 System.out.println("Too high. Try again:");
             }
         }
     }
}
