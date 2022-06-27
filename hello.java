import java.util.Scanner;

public class hello{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter First name: ");
        String fname = input.next();
        System.out.print("Enter last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello\n" + fname + " " + lname);
    }
}
