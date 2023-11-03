import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to check Prime Number : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(n+" is Prime Number");
        }
        else{
            System.out.print(n+" is Not Prime Number");
        }
        sc.close();
    }
}
