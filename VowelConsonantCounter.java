import java.util.Scanner;

class VowelConsonant {
    Scanner sc = new Scanner(System.in);

    public void Count() {
        System.out.print("Enter any word: ");
        String userInput = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int len = userInput.length();
        for (int i = 0; i <=len-1; i++) {
            char ch = userInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonantCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
}

public class VowelConsonantCounter {
    public static void main(String[] args) {
        VowelConsonant vc = new VowelConsonant();
        vc.Count();
    }
}