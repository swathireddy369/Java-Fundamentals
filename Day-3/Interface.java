public class Interface {
    public static void main(String[] args) {
        Devloper c=new Devloper();
        Computer laptop=new Laptop();
        Computer des=new Desktop();
        c.devApp(laptop);
        c.devApp(des);
    }
}
class Devloper  {
public void devApp(Computer com){
    com.code();
    System.out.println("Coding....");
}
}
interface Computer{
    public abstract void code();
}
class Laptop implements  Computer{
    public void code(){
        System.out.println("code,complie,run and success");
    }
}
class Desktop implements  Computer{
    public void code(){
        System.out.println("code,complie,run and success with fase access speed");
    }
}
