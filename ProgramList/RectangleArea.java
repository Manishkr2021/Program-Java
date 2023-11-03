import java.util.Scanner;
public class RectangleArea {
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.print("Enter Length of Rectangle : ");
double l=sc.nextDouble();
System.out.print("Enter Breadth of Rectangle : ");
double b=sc.nextDouble();
double area=(l*b);
System.out.print("Area of Rectagle : "+area);
}
}
