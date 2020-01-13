
public class CamelCase {
	public static void main(String[] args) {
		countCamelCase("thisContainsFourWords");
	}
	
	public static void countCamelCase(String str) {
		int count = 0;
		if (Character.isUpperCase(str.charAt(0))) {
			count++;
		}
		for (int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("haha");
		System.out.println(count);
	}
}
