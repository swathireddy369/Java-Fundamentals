 class Demo {
   public void playMusic()
    {
         System.out.println("Music Playing...");
    }
    public String getMeAPen(int a,int b,int c){

        if(a>=10)
            return "Pen";
        
        return "Nothing";
    }
    public String getMeAPen(int a,int b,double  c){

        if(a>=10)
            return "Pen";
        
        return "Nothing";
    }
    
}
public class Methods{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.playMusic();
       String str= d.getMeAPen(9,5,6);
       System.out.println(str);
    }
}
