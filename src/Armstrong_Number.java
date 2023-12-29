import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;

            while (temp != 0){

                int r = temp % 10;
                sum = sum + r*r*r;
                temp = temp / 10;


            }
            if (sum == n){
                System.out.println("Armstrong");
            }
            else {
                System.out.println("Not Armstrong");
            }
    }
}
