import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to check Prime or Not : ");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<=(n/2);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime==true){
            System.out.println(n+" is Prime Number");
        }
        else{
            System.out.println(n+" is Not Prime Number");
        }
        sc.close();
    }
}
