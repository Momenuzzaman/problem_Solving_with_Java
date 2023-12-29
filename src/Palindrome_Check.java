import java.util.Scanner;

public class Palindrome_Check {

    public static void main(String[] args) {

        int number = 121;
        int sum = 0;
        int temp = number;


        while (temp != 0) {
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if(number == sum){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
