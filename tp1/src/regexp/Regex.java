package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void exercice1() {
		String patternString = "\\b\\d*([13579]{2,})\\d*\\1\\d*[02468]\\b"; //"\\bi(?=[^i]*)\\b";
		String text = "l'ensemble contient 2153155 elements et non pas 375247556";
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		while(m.find()) {
			System.out.println("Sélection : " + m.group());
		}
	}
	
	public static void exercice2() {
		String patternString = "(?i)\\[(?=[^7]*7[^7]*7[^7]*?\\])(?=.*[k].*?\\])(.*?\\.)\\]";
		String text = "La table contient les références [xb27-75K32.] et [KB277-KB37.]";
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(text);
		System.out.println("R.E.: " + patternString);
		System.out.println("Test: " + text);
		while(m.find()) {
			System.out.println("Sélection : " + m.group(1));
		}
	}
	
	public static void main (String[] args){
		System.out.println("Exercice réalisé par Damien Coqueux et Guillaume Gomez");
		System.out.println("-----------------------------------------\n");
		Regex.exercice1();
		System.out.println("Fin de l'exercice 1");
		System.out.println("-----------------------------------------\n");
		Regex.exercice2();
		System.out.println("Fin de l'exercice 2");
		System.out.println("-----------------------------------------\n");
	}
}
