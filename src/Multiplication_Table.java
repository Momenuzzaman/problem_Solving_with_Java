import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");

        int number = input.nextInt();
        multiplication(number);
    }

    public static void multiplication(int n){

        for(int i = 1; i <= n; i++){
            System.out.println(n +" * " + i + " = "+ n*i);
        }
    }
}
