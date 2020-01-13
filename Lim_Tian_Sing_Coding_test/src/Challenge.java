
public class Challenge {
	public static void main(String[] args) {
		int cw = countWords("thisContainsFourWords");
		System.out.println(cw);
		int cws = countWordsStream("thisContainsFourWords");
		System.out.println(cws);
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
	
	public static int countWordsStream(String inputstr) {
		return (int) inputstr.chars().filter((s)->Character.isUpperCase(s)).count();
	}
}
