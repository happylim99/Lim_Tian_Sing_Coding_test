
public class Challenge {
	public static void main(String[] args) {
		countWords("thisContainsFourWords");
	}
	
	public static int countWords(String inputstr) {
		int count = 0;
		if (Character.isUpperCase(inputstr.charAt(0))) {
			count++;
		}
		for (int i=0; i<inputstr.length(); i++) {
			if(Character.isUpperCase(inputstr.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
