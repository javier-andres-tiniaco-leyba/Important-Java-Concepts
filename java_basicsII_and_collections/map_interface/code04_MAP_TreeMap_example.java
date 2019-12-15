import java.util.TreeMap;
import java.util.Map;

class TestCollection4{
 public static void main(String args[]){

  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();

  hm.put(100,"a");
  hm.put(102,"b");
  hm.put(101,"c");
  hm.put(103,"d");

  for(Map.Entry m:hm.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
