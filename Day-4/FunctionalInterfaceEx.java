
//functional interface
@FunctionalInterface
interface A{
    int add(int i,int j);
}

public class FunctionalInterfaceEx{
    public static void main(String[] args) {
        A obj=( i, j)-> i+j;
        
                
            
             
        int re=obj.add(9,0);
        System.out.println(re);
    }

   
}
