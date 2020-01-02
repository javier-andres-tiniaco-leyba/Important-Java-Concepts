// K - key
// T - type
// E - Element
// V - value
// N - Number
// S,U,V etc - 2nd, 3rd, 4th types

interface Pair<K, V> {
    public K getKey();
    public V getValue();
    public void setKey(K key);
    public void setValue(V value);
}

class OrderedPair<K, V> implements Pair<K, V>{
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static <K, V> boolean equals(Pair<K,V> p1, Pair<K,V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
           p1.getValue().equals(p2.getValue());
    }
}

class GenericsDemo {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, Integer>  p2 = new OrderedPair<String, Integer>("odd", 7);
        boolean same = OrderedPair.equals(p1,p2);
        System.out.format("Pair 1 equals Pair 2: %s%n", same);
    }
}
