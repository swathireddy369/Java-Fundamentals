class NaException extends RuntimeException{
    public NaException(String string){
super(string);
    }
}


public class ExceptionEx {
    // 1.compile time
    // 2.Runtime //eception handling
    // 3.logical
    // System.out.println();
    public static void main(String[] args) {
        int i=0;
        int j=4;
        try
        {
        j=0;
        if(j==0)
        throw new NaException("i dont want to print");
        }catch(NaException e){
           System.out.println("went wrong"+e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
// object -> throwable---- error(we cannot do anything)out of memory, Io error ,Exception (something we can handle)
// runtime Exception,sql Exception.io Exception,
// array index outof bouds,
// null pointer Exception
// arthimatic Exception

// checked --forcly handled by compiler
// unchecked--

// throw new ArithimaticException(Exception e)

// catch(Exception e){

// }