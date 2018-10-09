import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGaming {

	public static void main(String[] args) {
randomGame(null); 

		
		
		
		}	
	
	static public void randomGame(String[] args) {
		Random rand = new Random(); 
		int randomNum = rand.nextInt(100-0)+1;
		System.out.println(randomNum);
		for (int i = 5; i >= 0; i--) {
		
		String userInput = JOptionPane.showInputDialog("Guess the number.");
		int userGuess = (Integer.parseInt(userInput));
		if(randomNum == userGuess ){
			
		JOptionPane.showMessageDialog(null,"Congratulations you have guessed the right number!" ); 
		
		String newGame = JOptionPane.showInputDialog("New game?");
		if(newGame.equalsIgnoreCase("yes")) {
		randomGame(null);
		
		}
		else if(newGame.equalsIgnoreCase("no")){
			break;
		}
		
		}else {
		JOptionPane.showMessageDialog(null, "Wrong! Try again! Don't worry you still have" + i + "guesses left");
		}
		
		
		}
	}
}
