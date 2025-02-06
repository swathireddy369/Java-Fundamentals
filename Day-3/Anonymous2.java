

public class Anonymous2 {
    public static void main(String[] args) {
        A ob=new A()// to implement abstract class
       {
        public void show(){
            System.out.println("in news show"); // anonymus means instead of creating new class to define new functionality for method we can do like this by definin while creating obj
        }
      };
      ob.show();
    } 
}
abstract class A{
    public abstract void show();
}
class  B extends A{
    public void show(){
        System.out.println("in B Show");
    }
}
