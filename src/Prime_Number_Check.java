import java.util.Scanner;

public class Prime_Number_Check {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");

        int number = input.nextInt();

        checkPrime(number);

    }

    public static  void checkPrime(int n){
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }
    }
}
