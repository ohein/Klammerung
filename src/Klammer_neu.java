import java.util.*;

public class Klammer_neu {

	public static void main(String[] args) {
		
		Stack<String> klammern = new Stack<String>();
		String p="(){}[]";
		String ch;
		int i=1;
		
		klammern.empty(); //leerer Stapel
		
		while (p.length() > i) {    // noch nicht alle Zeichen von P gelesen do
			ch = p.substring(i, i);
			if (ch == "(" || ch == "[" || ch == "{")
				klammern.push(ch);
			if (ch == ")" || ch == "]" || ch == "}")
				if (klammern.empty() || ch != klammern.firstElement())
					System.out.println("inkorrekt");
				else 
					klammern.pop();
		}
		
		if (klammern.empty())
			System.out.println("korrekt");
		else
			System.out.println("inkorrekt");
	}
}
