class A{
    public void info(){
        System.out.println("This is Super Class A");
    }
}
class B extends A{
    public void info(){
        super.info();
        System.out.println("This is Child Class B");
        super.info();
    }
}
public class UseOfSuper {
    public static void main(String args[]){
        B obj=new B();
        obj.info();
    }
}
