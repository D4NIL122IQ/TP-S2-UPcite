package exo2;
import java.util.Stack;
import java.util.StringTokenizer;

public class Mot {
	private String phrase;
	
	Mot(String phrase){
		this.phrase = phrase;
	}
	
	public String mirroirMots() {
		StringTokenizer tokens = new StringTokenizer(phrase, " ");
		int nbrtoken = tokens.countTokens();
		Stack<String> sm = new Stack<>();
		StringBuffer chaineFinale;
		while(tokens.hasMoreElements()) {
			sm.push(tokens.nextToken());
		}
		chaineFinale = new StringBuffer(sm.pop());
		while(!sm.empty()) {
			chaineFinale.append(" " +sm.pop());
		}
		return chaineFinale.toString();
	}
	
	public String mirroirLettres() {
		StringTokenizer tokens = new StringTokenizer(phrase, " .,*!?");
		Stack<StringBuffer> sm = new Stack<>();
		StringBuffer chaineFinale;
		while(tokens.hasMoreElements()) {
			StringBuffer temp = new StringBuffer(tokens.nextToken());
			temp.reverse();
			sm.push(temp);
		}
		chaineFinale = new StringBuffer(sm.pop());
		while(!sm.empty()) {
			chaineFinale.append(" " +sm.pop());
		}
		
		return chaineFinale.toString();
	}
}
