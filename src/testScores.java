import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
String userInput = JOptionPane.showInputDialog("What is your test score?"); 
double testScore = Double.parseDouble(userInput);	

if(testScore <= 90) {
System.out.println("Wow, you did decent!");
}else {
System.out.println("Wow, you did really well!!");	
	
}
}

}
