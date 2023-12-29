import java.util.Scanner;

public class Count_Vowels_and_Consonants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        check(input);
    }

    static  void check(String c){
        int vowelsCount = 0;
        int consonantsCount = 0;
        for(int i = 0; i < c.length();i++){
            char ch = c.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               vowelsCount++;
           }
           else {
               consonantsCount++;
           }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
