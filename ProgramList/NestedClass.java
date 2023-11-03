import java.util.*;
class Greater{
    class Check{
        Scanner sc=new Scanner(System.in);
        public Check(){
        System.out.print("Enter 1st Value : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Value : ");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a + " is the Greatest!");
        }
        else{
            System.out.println(b+ " is the Greatest!");
        }
    }
    }
}
public class NestedClass{
    public static void main(String args[]){
        
        Greater.Check obj=new Greater().new Check();
        
    }
}