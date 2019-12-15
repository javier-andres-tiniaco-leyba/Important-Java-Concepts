import java.util.Iterator;
import java.util.ArrayList;

class TestCollection6{
 public static void main(String args[]){

  ArrayList<String> al=new ArrayList<String>();
  al.add("a");
  al.add("b");
  al.add("c");

  ArrayList<String> al2=new ArrayList<String>();
  al2.add("b");
  al2.add("d");

  al.retainAll(al2);

  System.out.println("iterating the elements after retaining the elements of al2...");
  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
