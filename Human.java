public class Human{
    public static void main(String[] args) {
        HumanDetails humanObj=new HumanDetails();
        // humanObj.age=26;
        // humanObj.name="swe";
        humanObj.setAge(26,humanObj);
        humanObj.setName("swathi");
        System.out.println(humanObj.getAge()+","+humanObj.getName());
    }
}
class HumanDetails{
   private  int age;//
   private String name;
   public int getAge(){
    return age;
   }
   public String getName(){
    return name;
   }
   public void setAge(int age,HumanDetails obj){
    HumanDetails h1=obj;
    // h1.age=age; 
   this.age=age; //this represents current object
   }
   public void setName(String name){
   this. name=name;
   }

}