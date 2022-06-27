import java.util.Scanner;

public class twodArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r,c;
        int[][] array = new int[50][50];
        System.out.print("Enter now of rows: ");
        r = input.nextInt();
        System.out.print("Enter now of column: ");
        c = input.nextInt();
        //to take the variable 
        for (int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                System.out.print("array["+i+"]["+j+"]= ");
                array[i][j] = input.nextInt();
            }
        }
        //to dispaly in matrix form
        for (int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                System.out.print(array[i][j] + " ");
                 
            }
            System.out.println();
        }
    }
}
