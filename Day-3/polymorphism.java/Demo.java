
//compil,runtime polymorphism(same thing many bhehaviour)
//overloading compiletime
//overwrting runtime
public class Demo {
    public static void main(String[] args) {
        A obj=new A(); //refereance super class object of class
        obj.show();
        A obj1=new B(); //refereance super class object of class
        obj1.show();
        A obj2=new Computer(); //refereance super class object of class // irrespective of what type of referance we have its on type of object
        obj2.show();
    }
  
  
}
class A{
public void show(){
    System.out.println("A");
}
}
class B extends A{
    public void show(){
        System.out.println("B");
    }  
}
class Computer extends A{

}
class Laptop extends Computer{

}

