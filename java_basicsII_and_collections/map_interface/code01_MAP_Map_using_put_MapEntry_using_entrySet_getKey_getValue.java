import java.util.Map;
import java.util.HashMap;

class TestCollection1{
 public static void main(String args[]){

  Map<Integer,String> map=new HashMap<Integer,String>();
  map.put(100,"a");
  map.put(101,"b");
  map.put(102,"c");

  for(Map.Entry m:map.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
