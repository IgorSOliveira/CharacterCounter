package characterCounter;

public class CharacterCounter {
	
	public static int ContarLetraA(String text) {
		
		String lowerCaseTransform = text.toLowerCase();
		
		int count = 0;
		
		for (char l : lowerCaseTransform.toCharArray()) {
			
			if (l == 'a') {
				count++;
			}
		}
		
		return count;
	}

}
