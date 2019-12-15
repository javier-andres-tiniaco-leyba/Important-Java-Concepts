import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TestCollection10{
 public static void main(String args[]){

  List<String> al=new ArrayList<String>();//creating arraylist
  al.add("a");//adding object in arraylist
  al.add("b");
  al.add("c");
  al.add("d");

  List<Integer> al2=new LinkedList<Integer>();//creating linkedlist
  al2.add(1);//adding object in linkedlist
  al2.add(2);
  al2.add(3);
  al2.add(4);

  System.out.println("arraylist: "+al);
  System.out.println("linkedlist: "+al2);
 }
}
