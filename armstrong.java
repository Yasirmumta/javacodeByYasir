import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, temp, sum = 0,rem;
        System.out.print("Enter the number: ");
        num = input.nextInt();
        temp = num;
        while(temp>0){
            rem = temp%10;
            sum = sum + rem*rem*rem;
            temp =temp/10;
        }
        if (sum == num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not");
        }        
    }
}
