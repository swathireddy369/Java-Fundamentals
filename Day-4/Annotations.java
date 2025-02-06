public class Annotations { //supplying extra info to compiler
 public static void main(String[] args) {
    B bobj=new B();
    bobj.showDataWhichBelongsToThisClass();
 }   
}
class A{
    
    public void showDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}
class B extends A{
    
    @Override
    public void showDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }
}
