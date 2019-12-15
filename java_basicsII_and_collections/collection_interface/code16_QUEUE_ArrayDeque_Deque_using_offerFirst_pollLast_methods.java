import java.util.Deque;
import java.util.ArrayDeque;

class TestCollection16 {
  public static void main(String[] args) {
      Deque<String> deque=new ArrayDeque<String>();
      deque.offer("a");
      deque.offer("b");
      deque.add("c");
      deque.offerFirst("d");
      System.out.println("After offerFirst Traversal...");
      for(String s:deque){
          System.out.println(s);
      }

      //deque.poll();
      //deque.pollFirst(); -- it is same as poll()

      deque.pollLast();
      System.out.println("After pollLast() Traversal...");
      for(String s:deque){
          System.out.println(s);
      }
  }
}
