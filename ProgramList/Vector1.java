/*21.LanguageVector.java
(To assign the values in Vector list through Command line argument and then
inserting element to this list using insertElementAt("Cobol",2)) */
import java.util.*;
public class Vector1 {
    public static void main(String args[]){
        Vector<String> language= new Vector<>();
        for(int i=0;i<args.length;i++){
            language.add(args[i]);   
        }
        language.insertElementAt("Cobol", 2);
        for(String str:language){
            System.out.println(str);
        }
    }
}
