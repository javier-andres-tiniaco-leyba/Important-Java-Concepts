import java.util.ArrayList;

class TestCollection2{
 public static void main(String args[]){

  ArrayList<String> al = new ArrayList<String>();
  al.add("a");
  al.add("a");
  al.add("c");
  al.add("d");

  for(String obj: al)
    System.out.println(obj);
 }
}
