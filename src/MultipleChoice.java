
public class MultipleChoice extends Question{
/**
 * fields: String[] AnswerChoices
 * 		   char correctAnswer
 * methods: toString (displays properly formatted question)
 * 			getSolution(returns correctAnswer converted to a String)
 */
	private String[] answerChoices;
	private char correctAnswer;
	public MultipleChoice(String[] aC, char cA) {
		answerChoices = aC;
		correctAnswer = cA;
	}
	
	public String toString(String str) {
		String s = "\n";
		for  (String i: answerChoices) {
			s = s + i;
			s = s + "\n";
		}
		return super.getText() + s;
		
	}
	
	public String getSolution() {
		return Character.toString(correctAnswer);
	}
}
