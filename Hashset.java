import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
   public static void main(String args[]) {
      HashSet<String> hset = 
               new HashSet<String>();
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      hset.add("Apple");
      hset.add("Mango");
      hset.add(null);
      hset.add(null);
      System.out.println(hset);
      Iterator<String> it = hset.iterator();
      while(it.hasNext()){
          System.out.println(it.next());}
          hset.clear();
          System.out.println("After: HashSet contains: "+ hset);
    }
}
