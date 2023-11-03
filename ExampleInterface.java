/*To implement the interface 'Language' and concate the other string using getName() user defined method */
import java.util.*;
interface Language{

    public void getInput();
}
class Demo1 implements Language{
    Scanner sc=new Scanner(System.in);
     String s1,s2;
    public void getInput(){
       
        System.out.print("Enter 1st String : ");
        s1=sc.next();
        System.out.print("Enter 2nd String : ");
        s2=sc.next();
        getName(s1,s2);
    }
    public void getName(String s1,String s2){
        System.out.println("String Concatanation : "+s1.concat(s2));
    }
}
class ExampleInterface{
    public static void main(String args[]){
        Demo1 obj=new Demo1();
        obj.getInput();
    }    
}

