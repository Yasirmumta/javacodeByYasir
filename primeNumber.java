import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = in.nextInt();
        int flag = 0;
        if ((num > 0) && (num % 1==0)){
            flag = 1;
        }
        for (int i = 2; i <= num/2; i++){
            if(num % i == 0){
                flag = 0;
            }
            else{
                flag = 1;
            }
        }
        if (flag == 1){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
    }
}
