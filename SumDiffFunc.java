import java.util.Scanner;

public class SumDiffFunc {
    static int Sum(int x, int y){
        return x+y;
    }
    static int Difference(int x, int y){
        return x-y;
    }
    static int Product(int x, int y){
        return x*y;
    } 
    static int Divison(int x, int y){
        return x/y;
    }
    static int Modulus(int x, int y){
        return x%y;
    }
    static int Power (int x, int y){
        return x^y;

    }
    static String SwitchCase(int a, int b, int choice){
        Scanner input = new Scanner(System.in);
        switch (choice) {
            case 1:
            System.out.println("Sum: "+ Sum(a,b) );
            break;
            case 2:
            System.out.println("Diffence: "+ Difference(a,b) );
            break;
            case 3:
            System.out.println("Multiplication: "+ Product(a,b) );
            break;
            case 4:
            System.out.println("Divison: "+ Divison(a,b) );
            break;
            case 5:
            System.out.println("Modulus: "+ Modulus(a,b) );
            break;
            case 6:
            System.out.println("Power: "+ Power(a,b) );
            break;
            default:
            System.out.println("Wrong choice.");
            break;
        }
        System.out.print("Do you want to continue: ");
        String cont = input.next();
        return cont;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a,b,choice;
        System.out.print("Enter the value of x: ");
        a = input.nextInt();
        System.out.print("Enter the value of y: ");
        b = input.nextInt();
        System.out.println("******Welcome to Calculator*******");
        System.out.print("1.Addition \n2.Subtraction \n3.Multiplication \n4.Divison \n5.Remainder \n6.Power \n");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        SwitchCase(a, b, choice);
        System.out.print("Do you want to continue: ");
        String cont = input.next(); 
        while(SwitchCase(a, b, choice) == "yes"){
        SwitchCase(a, b, choice);
        if(cont != "yes"){
            break;
        }
    } 
          

    }
}
