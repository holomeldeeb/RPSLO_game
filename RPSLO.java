import java.util.Random;
import java.util.Scanner;

public class RPSLO {
    public static void main(String[] args) {
        System.out.println("Enter your play: R , P , S , L , O");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(5); 
        String input = scanner.nextLine().toUpperCase(); 
        
        
        if (!input.equals("R") && !input.equals("P") && !input.equals("S") && !input.equals("L") && !input.equals("O")) {
            System.out.println("Invalid input (valid inputs: R, P, S, L, O)");
            
        }
    else {

        
        String computerPlay = "";
        switch (randomNumber) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            case 3:
                computerPlay = "L";
                break;
            case 4:
                computerPlay = "O";
                break;
        }
        
        System.out.println("Computer play is " + computerPlay);

        
        if (input.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else {
            switch (computerPlay) {
                case "R":
                    if (input.equals("S") || input.equals("L"))
                        System.out.println("Computer wins!");
                    else
                        System.out.println("You win!");
                    break;
                case "P":
                    if (input.equals("R") || input.equals("O"))
                        System.out.println("Computer wins!");
                    else
                        System.out.println("You win!");
                    break;
                case "S":
                    if (input.equals("P") || input.equals("L"))
                        System.out.println("Computer wins!");
                    else
                        System.out.println("You win!");
                    break;
                case "L":
                    if (input.equals("P") || input.equals("O"))
                        System.out.println("Computer wins!");
                    else
                        System.out.println("You win!");
                    break;
                case "O":
                    if (input.equals("R") || input.equals("S"))
                        System.out.println("Computer wins!");
                    else
                        System.out.println("You win!");
                    break;
            }
        }
    }}
}

