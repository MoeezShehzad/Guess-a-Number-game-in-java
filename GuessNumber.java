import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int userinput;
        int choice;
        boolean keepRunning = true;
        Random random = new Random();
        int rand = random.nextInt(20) + 1;

        System.out.println("Welcome to Guess a Number Game");
        System.out.println("******************************");

        while (keepRunning) {
            System.out.println("Are you ready to Play:");
            System.out.println("1. Yes \n2. No");
            choice = scan.nextInt();
            if (choice == 2) {
                System.out.println("OK, BYE....");
                keepRunning = false;
                System.exit(0);
            }
            boolean won = false;
            int MaxAttempt =5;
            while (!won) {
                System.out.println("Guess the Number");
                count++;
                userinput = scan.nextInt();
                if (count == MaxAttempt) {
                    System.out.println("You are out of tries.");
                    count =0;
                    won = true;
                } else if (userinput == rand) {
                    System.out.println("You won, the game in " + count + " tries The random number is: " + rand);
                    won = true;
                } else if (userinput > rand) {
                    System.out.println("The Number " + userinput + " is greater");
                } else if (userinput < rand) {
                    System.out.println("The Number " + userinput + " is Smaller");
                } else
                    won = true;
            }
        }
        scan.close();
    }
}
