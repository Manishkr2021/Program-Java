import java.util.*;
public class Arithmetic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        double a=sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double b=sc.nextDouble();
        try{
            int c=(int)a/(int)b;
            System.out.println("Divisor : "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by zero!! "+e.getMessage());
        }
    }
}
