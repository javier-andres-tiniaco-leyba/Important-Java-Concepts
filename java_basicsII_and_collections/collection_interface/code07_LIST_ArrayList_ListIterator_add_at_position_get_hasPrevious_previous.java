import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

class TestCollection7{
  public static void main(String args[]){
    ArrayList<String> al=new ArrayList<String>();
    al.add("a");
    al.add("b");
    al.add("c");
    al.add(1,"d");

    System.out.println("element at 2nd position: "+al.get(2));

    ListIterator<String> itr=al.listIterator();

    System.out.println("traversing elements in forward direction...");
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

    System.out.println("traversing elements in backward direction...");
    while(itr.hasPrevious()){
      System.out.println(itr.previous());
    }
  }
}
