//class--class extends
//class-interface implements
//int-int - extends

interface A{
    int age = 26; // final and static
    String area = "Hyderabad"; // final and static
    public abstract void show();
    public abstract void config();
}
interface xyz{
   
    public abstract void run();
}
class B implements A,xyz{

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void config() {
        System.out.println("config");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}

public class AbstractExample(){
    public static void main(String[] args) {
        A obj;
        xyz obj1;
        obj =new  B();
        obj1 =new  B();
        obj.show();
        obj.config();
        obj1.run();
       
        System.out.println( A.area);
    }
}