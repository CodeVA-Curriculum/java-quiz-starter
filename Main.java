import java.util.Scanner; // import the Scanner

public class Main {
    public static void main(String[] args) {
        // Create the Scanner
        Scanner input = new Scanner(System.in);
        
        // Ask the user a question
        System.out.println("What is 2 + 2?");

        // Get the user's answer, store it in a variable
        int answer = input.nextInt();

        // Check to see if the answer is 4
        if(answer == 4) {
            // If so, print a success message
            System.out.println("That's right!");
        } else {
            // If not, print a failure message
            System.out.println("That's incorrect");
        }

        // At the end of the quiz, print a closing message
        System.out.println("That's the end!");
        input.close(); // close the Scanner to prevent memory leakage
    }
}