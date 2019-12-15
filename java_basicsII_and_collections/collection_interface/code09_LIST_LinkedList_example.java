import java.util.LinkedList;
import java.util.Iterator;

class TestCollection9{
 public static void main(String args[]){

  LinkedList<String> al=new LinkedList<String>();
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
