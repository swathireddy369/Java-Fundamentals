//object oriented programming
//object-properties and behaviours
//Class 
class Calculator{
       int add(int num1,int num2){ //method
            System.out.println("hello");
            int r = num1 + num2;//variable
            return r;
        }
    
   
}
public class Demo{
    public static void main(String args[]){
        int a=3;
        int b=6;
        Calculator cal = new Calculator();//object creation (jvm will create object)
       int res= cal.add(a,b);
       System.out.println(res);

    }
}