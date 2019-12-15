import java.util.Map;
import java.util.HashMap;

class TestCollection2{
 public static void main(String args[]){

  HashMap<Integer,String> hm=new HashMap<Integer,String>();
  hm.put(100,"a");
  hm.put(101,"b");
  hm.put(102,"c");

  for(Map.Entry m:hm.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
