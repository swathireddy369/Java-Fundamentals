class A{
    public A() {
        System.out.println("object created");
  
    }
    public void show(){
    }
}
public class AInheritance{
    public static void main(String[] args) {
        int marks;
        marks=99;

        A obj;
        obj=new A(); //object creation
        new A(); //anonymous object
        new A().show();
        obj.show();
        
    }
}