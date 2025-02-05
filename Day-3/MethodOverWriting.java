
class A {
    public int show(int n1,int n2) {
        System.out.println("in ahkghkgjkjkhj");
        return n1+n2;
    }
  
 }
 class B extends A{
    
    public int ashow(int n1,int n2){
        return super.show(n1, n2);
    }
   
    public int show(int n1,int n2){
     System.out.println("in b show");
    return n1+n2+1;
    }

 }
public class  MethodOverWriting{
    public static void main(String[] args) {

        A obj=new B();
     B obj1 =(B)obj;
      int r1=  obj.show(3,4);
      int r2=  obj1.show(3, 4);
      System.out.println("="+r1+""+r2);
        
    }
}