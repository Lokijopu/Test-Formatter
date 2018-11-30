
public class TrueFalse extends Question{
/**
* fields: String answer
* methods: toString (displays formatted question with "true/false")
* 		   getSolution (returns answer) 
*/
	private String answer;
	
	public TrueFalse(String ans) {
		answer = ans;
	}
	
	public String toString() {
		return super.getText() + "true/false";
	}
	
	public String getSolution() {
		return answer;
	}
}
