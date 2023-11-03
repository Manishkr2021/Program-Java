import java.util.*;
public class IntegerFloatConsole {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer Value : ");
        int a=sc.nextInt();
        System.out.println("You entered Integer Value : "+a);
        System.out.print("Enter Float Value : ");
        float b=sc.nextFloat();
        System.out.println("You entered Float Value : "+b);
        sc.close();
        }
}
