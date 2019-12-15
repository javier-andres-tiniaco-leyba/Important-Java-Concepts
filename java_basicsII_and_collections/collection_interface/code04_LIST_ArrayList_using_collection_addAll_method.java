import java.util.Iterator;
import java.util.ArrayList;

class TestCollection4{
 public static void main(String args[]){

  ArrayList<String> al=new ArrayList<String>();
  al.add("a");
  al.add("b");
  al.add("c");

  ArrayList<String> al2=new ArrayList<String>();
  al2.add("d");
  al2.add("e");
  al2.add("f");

  al.addAll(al2);

  Iterator itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
