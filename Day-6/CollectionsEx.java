import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsEx{
         public static void main(String[] args) {

            Comparator<String> c=(String s1,String s2
            )->{
                  if(s1.length() < s2.length() )
                      return 1;
                  else
                      return -1;
                
            };
            List<String> sList=new ArrayList<>();
            sList.add("jim");
            sList.add("andrewCamphel1");
            sList.add("ben");
            sList.add("Boone");
            sList.add("and");
            sList.add("andrewCamphel");
            Collections.sort(sList,c);
            System.out.println("===="+sList);

         }
}