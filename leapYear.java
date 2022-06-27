import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not");
        }
    }    
}
