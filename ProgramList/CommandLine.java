import java.util.*;
public class CommandLine {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        sc.close();
    }
}
