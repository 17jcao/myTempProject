package girlsWhoCode;

import java.util.*; 

public class RockPaperScissors {
	
	public static void main(String[] args) {
		
		int compAnswer; 
		
		String answer, computerAnswer, another; 
		
		Scanner scan = new Scanner(System.in); 
		
		Random srand = new Random();
		
		System.out.println("Welcome to the game \"Rock, Paper, Scissors!\""); 
		
		do {
			compAnswer = srand.nextInt(3) + 1; 
			
			if (compAnswer == 1) {
				computerAnswer = "rock";
			} else if (compAnswer == 2) {
				computerAnswer = "paper"; 
			} else {
				computerAnswer = "scissors"; 
			}
			System.out.println("Enter your choice: "); 
			
			answer = scan.next(); 
			
			System.out.println("\"Rock, paper, scissors!\"");
			
			if (answer.equalsIgnoreCase(computerAnswer)) {
				System.out.println("The computer played " + answer + "!");
				System.out.println("Tied!");
			} else if (answer.equalsIgnoreCase("rock") && computerAnswer == "paper") {
				System.out.println("The computer played paper!");
				System.out.println("You lose!");
			} else if (answer.equalsIgnoreCase("rock") && computerAnswer == "scissors") {
				System.out.println("The computer played scissors!");
				System.out.println("You win!");
			} else if (answer.equalsIgnoreCase("paper") && computerAnswer == "rock") {
				System.out.println("The computer played rock!");
				System.out.println("You win!");
			} else if (answer.equalsIgnoreCase("paper") && computerAnswer == "scissors") {
				System.out.println("The computer played scissors!");
				System.out.println("You lose!");
			} else if (answer.equalsIgnoreCase("scissors") && computerAnswer == "paper") {
				System.out.println("The computer played paper!");
				System.out.println("You win!");
			} else if (answer.equalsIgnoreCase("scissors") && computerAnswer == "rock") {
				System.out.println("The computer played rock!");
				System.out.println("You lose!");
			}
			
			System.out.println("Try again? y or n");
			
			another = scan.next(); 
		
		} while (another.equalsIgnoreCase("y"));
		
		scan.close(); 
		
		System.out.println("Thanks for playing!");
	}

}
