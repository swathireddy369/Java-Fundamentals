public class AbstarctKeyword {
    public static void main(String[] args) {
        // Car obj=new Car(); //cannot create object for abstract class
        Car obj=new updatedWagonr();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
abstract class Car{
    public abstract void drive(); //declare a method in parent then it will be defined in child class
    public abstract void fly(); 
    public void playMusic(){
        System.out.println();
    }
}
abstract class WagonR extends Car{
    // public void fly(){
    //     System.out.println("fly");
    // }
      public void drive(){
        System.out.println("Driving...");
    }

}
class updatedWagonr extends WagonR{//concrete class
        public void fly(){
            System.out.println("fly");
        }
}