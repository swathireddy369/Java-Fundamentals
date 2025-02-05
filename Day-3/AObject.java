public class AObject {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.price=300;
        obj.brand="Mac";
        System.out.println(obj.toString());
    }
}
class Laptop{
 int price;
 String brand;
 public String toString(){
    return price+":"+brand;
 }
}