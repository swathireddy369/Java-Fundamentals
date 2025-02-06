
import java.util.Arrays;

enum Status{ //class we cannot extend with any other class
    Running,Failed,Pending,Success;//objects of status
}
enum Laptop{
    Macbook(2000),XPS(2200),Surface(1500),ThinkPad(1800);
    private int price;
    public int getPrice() {
        return price;
    }
    private Laptop(){
        price=800;
    }
    private Laptop(int price){
        this.price=price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
 
}
public class EnumEx{
    public static void main(String[] args) {
        Status[] s=Status.values();
        System.out.println(Arrays.toString(s));
        System.out.println(s.getClass().getSuperclass());
        // Laptop lap=Laptop.Macbook;
        // System.out.println(lap.getPrice());
        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" "+lap.getPrice());
        }
    }
}