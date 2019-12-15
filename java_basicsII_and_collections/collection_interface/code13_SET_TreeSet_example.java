import java.util.Iterator;
import java.util.TreeSet;

class TestCollection13{
 public static void main(String args[]){

  TreeSet<String> al=new TreeSet<String>();
  al.add("a");
  al.add("b");
  al.add("c");
  al.add("d");

  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
