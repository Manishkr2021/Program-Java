/*(To read the string char by char and appending these chars to StringBuffer obj
through while loop)
 */
import java.util.Scanner;
public class StringCharByChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            sb.append(c);
        }
        System.out.println(sb.toString());
        sc.close();
        }
}


