import java.util.Scanner;

public class table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int x = input.nextInt();
        int i = 1;
        /*for(int i = 1; i <= 10; i++){
            System.out.println(x + " x " + i + " = " + x*i);
        }*/
        /*while(i<=10){
            System.out.println(x + " x " + i + " = " + x*i);
            i++;
        }  */
        do{
            System.out.println(x + " x " + i + " = " + x*i);
            i++; 
        }while(i<=10);  
    }
    
}
