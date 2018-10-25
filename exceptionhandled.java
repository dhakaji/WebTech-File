import java.util.*;
public class Main{
    public static void main(String []args){
        method1();
    }
    static void method1(){
        System.out.println("inside method1");
        method2();
        System.out.println("inside method2");
        try{
        method3();
        }
        catch(Exception e){
            System.out.println("Exception handled:"+e);
        }
        System.out.println("returned from method3");
        static void method3(){
            System.out.println("inside method3");
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("method3 exit");
        }
    }
}
