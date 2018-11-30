public abstract class Question {
/**
* Abstract
* fields: int number
* 		  String text
* methods: getNumber
* 		   getText
* 		   getSolution (Abstract returns String)
*/
	private int number;
	private String text;

	public int getNumber() {
		return number;
	}
	
	public String getText() {
		return text;
	}
	
	public abstract String getSolution();
	
	
}
