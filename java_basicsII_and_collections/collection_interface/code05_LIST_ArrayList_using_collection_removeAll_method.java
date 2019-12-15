import java.util.Iterator;
import java.util.ArrayList;

class TestCollection5{
 public static void main(String args[]){

  ArrayList<String> al=new ArrayList<String>();
  al.add("a");
  al.add("b");
  al.add("c");
  al.add("d");

  ArrayList<String> al2=new ArrayList<String>();
  al2.add("b");
  al2.add("c");

  al.removeAll(al2);

  System.out.println("iterating the elements after removing the elements of al2...");
  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
   }
  }
}
