package exo1;
import java.util.StringTokenizer;


public class Decoupe {
	public static void main(String args[]) {
		String phrase = "Bonjour, tout le monde*il fait beau";
		StringTokenizer tokens = new StringTokenizer( phrase , " *," );
		while(tokens.hasMoreElements()) {
			System.out.println("Element :" +tokens.nextToken());
		}
	}
}
