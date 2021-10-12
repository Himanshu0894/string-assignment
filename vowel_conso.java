
public class vowel_conso {

	public static void main(String[] args) {
		String str = "This is a really simple sentence";
		int vowels = 0;
		int conso = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u'){
						vowels++;
					}
			else if(str.charAt(i) == ' '){
				continue;
				
			}
			else {
				conso++;
			}
		}
		System.out.println("No. of Vowels = "+vowels);
		System.out.println("No. of Consonants = "+conso);

	}

}
