
//final-variable,method,class
public class Demo {
    public static void main(String[] args) {
     final int num=8; //final varibale simple making variable constant
       System.out.println(num);
       A obj=new A();
       obj.show();
       obj.add(5,6);
    }
   
}
final class A{
 public final void show(){ // no one can overwite our method
  System.out.println("show in a");
 } 
 public void add(int a,int b){
  System.out.println(a+b);

 } 
}
class B extends A{ //cannot inherit final classes

}
