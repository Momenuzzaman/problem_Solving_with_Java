import java.util.Scanner;

public class Factorial_Calculation {
    public static void main(String[] args) {
        Scanner enterNumber = new Scanner(System.in);
        System.out.println("Enter number");

        Integer number = Integer.valueOf(enterNumber.nextLine());
        System.out.println(factRecursion(number));
    }

   static int factRecursion(int n)
    {
        if (n <= 1)
            return 1;
        else
            return n*factRecursion(n-1);
    }
}
