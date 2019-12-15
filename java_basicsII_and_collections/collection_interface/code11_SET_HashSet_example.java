import java.util.Iterator;
import java.util.HashSet;

class TestCollection11{
 public static void main(String args[]){

  HashSet<String> hs=new HashSet<String>();
  hs.add("a");
  hs.add("b");
  hs.add("c");
  hs.add("d");

  Iterator<String> itr=hs.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
