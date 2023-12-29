import java.util.Scanner;

public class Factorial_Calculation {
    public static void main(String[] args) {
        Scanner enterNumber = new Scanner(System.in);
        System.out.println("Enter number");

        Integer number = Integer.valueOf(enterNumber.nextLine());
//        System.out.println(factorial(number));
        System.out.println(factRecursion(number));
    }


    static long factorial(int number){
        long result = 1l;
        for(int i = 1;i <= number; i++){
            result *= i;
        }
        return  result;
    }


   static int factRecursion(int n)
    {
        if (n <= 1)
            return 1;
        else
            return n*factRecursion(n-1);
    }
}
