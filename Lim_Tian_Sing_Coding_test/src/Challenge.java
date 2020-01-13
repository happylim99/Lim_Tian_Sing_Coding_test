
public class Challenge {
	public static void main(String[] args) {
		countWords("thisContainsFourWords");
	}
	
	public static int countWords(String str) {
		int count = 0;
		if (Character.isUpperCase(str.charAt(0))) {
			count++;
		}
		for (int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
