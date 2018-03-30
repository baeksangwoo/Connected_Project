package test;

public class WordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WordCount a = new WordCount();
		String s = "Java is a object oriented programming language and general purpose language";
		System.out.println("결과1: " + a.countString(s, true));
		System.out.println("결과2: " + a.countString(s, false));
		
	}
}
