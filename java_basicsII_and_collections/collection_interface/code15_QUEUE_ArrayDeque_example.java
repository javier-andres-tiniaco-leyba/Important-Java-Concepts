import java.util.Deque;
import java.util.ArrayDeque;

class TestCollection15 {
   public static void main(String[] args) {
     //Creating Deque and adding elements
     Deque<String> deque = new ArrayDeque<String>();
     deque.add("a");
     deque.add("b");
     deque.add("c");

     //Traversing elements
     for (String str : deque) {
       System.out.println(str);
     }
   }
}
