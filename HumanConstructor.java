public class HumanConstructor {
    public static void main(String[] args) {
        sample hcObj=new sample();
        sample hcObj1=new sample(27,"anand");
    }
   
    
}
 class sample{
    int age;
    String name;
    public sample(){
        age=26;
        name="sbd";
        System.out.println("in constructor"+age+"   "+name);
    }
    public sample(int a,String name){
        age=a;
        name=name;
        System.out.println("in constructor"+age+"   "+name);
    }
}
