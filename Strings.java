

public class Strings {
    public static void main(String[] args) {
        String name = "jim";
        String name1=new String("boon");
        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(name1));
        String s1 = "jim";
        String s2 = "";
        if(s1.hashCode() == s2.hashCode()){
            System.out.println(s1.hashCode() +" "+s2.hashCode()+""+"");
    
        };
        StringBuffer sb=new StringBuffer("sdjsabf,snbf,"); // thread safe while StringBuilder not
        sb.append("reddy");
        sb.deleteCharAt(0);
        sb.indexOf("s");
        sb.setLength(90);
        sb.ensureCapacity(100);
        System.out.println(sb);
        String st=sb.toString();
       }
      
}
