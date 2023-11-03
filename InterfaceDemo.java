/* 
 * To Implement the interface 'Polygon' and calculate the area of Rectangle using getArea() {User defined method}
 */
import java.util.*;
interface Polygon{
   public  void input();
}
class Demo implements Polygon{
    public void input(){
        Scanner sc=new Scanner(System.in);
        double l,b;
        System.out.print("Enter Length and Breadth of Rectangle : ");
        l=sc.nextDouble();
        b=sc.nextDouble();
        getArea(l,b);
    }
    public void getArea(double l,double b){
        System.out.println("Area of Rectangle : "+(l*b));
    }
}
public class InterfaceDemo {
    public static void main(String args[]){
        Demo d=new Demo();
        d.input();
        
    }
}
