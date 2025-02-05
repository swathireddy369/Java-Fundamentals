public class SuperDemo {
    public static void main(String[] args) {
        A obj1=new B();
        //  A obj2=new B(6);//it calls construtor of parent also 
        
    }
}
class A extends Object{ //by default every class extends object class in java
public A(){
    super();
    System.out.println("A");
}
public A(int a){
    super();
    System.out.println("A int ");
}
}
class B extends A{
    public B(){
        // super(5);
        this(9);
        System.out.println("in b");
    }
    public B(int n){
        super(n);//to call parametarised con in parent class
        System.out.println("in b int");
    }
}
