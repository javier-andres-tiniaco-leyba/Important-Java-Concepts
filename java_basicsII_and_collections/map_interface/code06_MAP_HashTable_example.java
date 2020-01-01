import java.util.Hashtable;
import java.util.Map;

class TestCollection6 {

    public static void main(String[] args) {

        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();

        hm.put(100,"a");
        hm.put(102,"b");
        hm.put(101,"c");
        hm.put(103,"d");

        for(Map.Entry m : hm.entrySet()) {
            System.out.format("key:%s value:%s%n",m.getKey(), m.getValue());
        }
    }
}
