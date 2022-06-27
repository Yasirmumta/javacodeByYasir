import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int array[] = new int[50];
        for(int i = 0; i<=5;i++){
            array[i] = input.nextInt();
        }
        System.out.print("Array = {");
        for(int i = 0; i<=5;i++){
            System.out.print( array[i] + ", ");
        }
        System.out.print("}");
    }
}
