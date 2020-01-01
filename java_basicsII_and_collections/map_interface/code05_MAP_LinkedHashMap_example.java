import java.util.LinkedHashMap;
import java.util.Map;

class TestCollection5 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();

        hm.put(100,"a");
        hm.put(101,"b");
        hm.put(102,"c");

        for(Map.Entry m : hm.entrySet()) {
            System.out.format("key:%s value:%s%n",m.getKey(), m.getValue());
        }
    }
}
