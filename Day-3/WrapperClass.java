public class WrapperClass {
    //int-Integer // every primitive we will be having class for that
    // char = Character
    // double-Double
    public static void main(String[] args) {
        int num=9;
        Double 
        Integer num1=new Integer(8);
        Integer num4=num; // auto boxing when you store primitive in object 
        int num2=num1; // auto-Unboxing takeout primitive value out
        System.out.println(num1);
        String str="3";
        int num5=Integer.parseInt(str);
        System.out.println(str*2);
    }
}
