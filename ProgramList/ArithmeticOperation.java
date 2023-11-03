import java.util.*;
public class ArithmeticOperation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int con=1;
        while(con==1){
        System.out.print("Enter 1st Number : ");
        double a=sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double b=sc.nextDouble();
        System.out.print("\n--------------- Arithmetic Operation --------------\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Remainder\n6. Exit\n Choose Any One : ");
        int choice=sc.nextInt();
        double c;
        switch(choice){
            case 1: 
            c=a+b;
            System.out.println("Addition : "+(a+b));
            break;
            case 2: 
            c=a-b;
            System.out.println("Subtraction : "+(a-b));
            break;
            case 3: 
            c=a*b;
            System.out.println("Multiplication : "+(a*b));
            break;
            case 4: 
            c=a/b;
            System.out.println("Division : "+(a/b));
            break;
            case 5: 
            c=a%b;
            System.out.println("Remainder : "+(a%b));
            break;
            case 6: 
            System.out.println("Exit!!!");
            System.exit(0);
            default:
                System.out.println("Please Press Valid Option!!!");
        }
        System.out.print("\nDo you want to Continue(1/0)? : ");
        con=sc.nextInt();
        
    }
    sc.close();


    }
}
