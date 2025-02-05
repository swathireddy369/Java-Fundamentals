public class Basic{
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile mObj=new Mobile();
        Mobile mObj1=new Mobile();
        Mobile mObj2=new Mobile();
        // mObj.brand="Apple";
        // mObj.price=1200;
        // Mobile.name="16promax";
        // mObj.show();
        Class.forName("Mobile");
        Mobile.show1(mObj);//static method
    }
}


class Mobile{
    String brand;
   static String name;
    int price;
    static {
        name="shksbff";
        System.out.println("static block");
    }
    public Mobile(){
         brand ="sam" ;
         price=90;
         System.out.println("construct  block");
    }
    public void show(){
     System.out.println("=" +brand+""+
     name+""+""+ price);
    }
    public static void show1(Mobile mObj){
        System.out.println("static methid"+name+"   "+mObj.brand);
    }
}