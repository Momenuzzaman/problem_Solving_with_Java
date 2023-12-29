import java.util.Scanner;

public class Leap_Year_Check {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year : ");

        int year = input.nextInt();

        checkLeapYear(year);
    }
    static  void  checkLeapYear(int y){
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
            System.out.println(y + " Leap Year");
        }
        else {
            System.out.println(y + " Not Leap Year");
        }
    }
}
