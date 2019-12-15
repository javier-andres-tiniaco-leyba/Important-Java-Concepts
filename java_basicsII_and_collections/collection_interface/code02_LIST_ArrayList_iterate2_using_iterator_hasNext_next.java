import java.util.ArrayList;
import java.util.Iterator;

class TestCollection1{
 public static void main(String args[]){

  ArrayList<String> al=new ArrayList<String>();
  al.add("a");
  al.add("b");
  al.add("c");
  al.add("d");

  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
  System.out.println(itr);
 }
}
