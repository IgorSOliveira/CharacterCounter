package characterCounter;

import java.util.Scanner;

public class CharacterCounterMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o texto que deseja verificar a quantidade de 'a' presentes:");
		String text = sc.nextLine();
		
		sc.close();
		
		int count = CharacterCounter.ContarLetraA(text);
		
		System.out.println("A letra 'a' aparece " + count + " vezes no texto.");
	}

}
