import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array");
        int size = input.nextInt();
        int array[]= new int[size];
        for(int i = 0; i <= size; i++){
            System.out.print("Input array[" + i+ "]: ");
            array[i] = input.nextInt();
        }
        /*for (int j =0; j<= 4;j++){
            for(int k = j; k<= 4; k++){
                int temp =0;
                if(array[k]<array[j]){
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
            System.out.print(array[j] +" ");
        }*/
        Arrays.sort(array);
        System.out.print("The sorted array is : ");
        for(int num=0;num<=size;num++){
            System.out.print(array[num]);
        }
        System.out.print("}");
        //System.out.println(Arrays.toString(array));   
    }
}
