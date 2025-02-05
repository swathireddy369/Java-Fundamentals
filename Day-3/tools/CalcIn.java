
package tools
public class CalcIn {
   public static void main(String[] args) {
    Cal c1=new Cal();
    AdvCalc c2=new AdvCalc();
    VeryAdvCalc vObj=new VeryAdvCalc();
    int r1=vObj.add(3,6);
    int r2=vObj.sub(3,6);
    int r3=vObj.multi(3,6);
    int r4=vObj.div(3,6);
    double r5=vObj.power(3,6);
   
    System.out.println("=add "+r1+"sub "+r2+"mul "+r3+"div "+r4+"pow "+r5);
   }
}
class Cal{
    public int add(int n1,int n2){
            return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
