
import java.util.*;
public class SecondLargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter "+n+" Elements : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                   int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Second Largest Element : "+a[1]);
    }
}