public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        // B obj1=new B();//we cann't create for b
        A.B obj2=obj.new B();
        obj2.config();
    }
}
class A{
    int age;
    public void show(){
System.out.println("show");
    }
    class B{
   public void config(){
    System.out.println("in config");
   }
    }
}
