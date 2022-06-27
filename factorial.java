import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int n, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = input.nextInt();
        for(int i = 1; i <= n; i ++){
            fact = fact*i;
        }
        System.out.println("Factorial: " + fact);        
    }   
}
