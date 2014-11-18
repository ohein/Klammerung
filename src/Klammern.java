
import java.util.Stack;

public class Klammern {

	static void parse(char[] s) throws Exception {
		Stack<Integer> klammern = new Stack<Integer>();

		for(int i=0; i<s.length; i++) {
			switch(s[i]) {
			case '{': klammern.push((int)'}'); break;
			case '[': klammern.push((int)']'); break;
			case '(': klammern.push((int)')'); break;
			default:
				if (s[i] != klammern.pop())
					throw new Exception("Falsche Klammer!");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		String s = "([{]})";
		parse(s.toCharArray());
		System.out.println("ok");
	}
}
