import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int temp = num;
        int rem , rev = 0;
        while (temp>0){
            rem = temp % 10;
            rev = rev*10 + rem;
            temp /=10;

        }
        if (rev == num){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("not");
        }
    }
    
}
