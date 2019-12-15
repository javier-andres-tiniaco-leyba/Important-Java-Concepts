import java.util.LinkedHashSet;
import java.util.Iterator;

class TestCollection12{
 public static void main(String args[]){

  LinkedHashSet<String> al=new LinkedHashSet<String>();
  al.add("a");
  al.add("b");
  al.add("c");
  al.add("d");

  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
  System.out.println(al);
 }
}
