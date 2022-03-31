public class MyHashMap<K,V> {

    private final static int SIZE = 16;
    private Nod tables[] = new Nod[SIZE];



    private int hash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public Object get (K key) {
        int hash = hash(key);
       var n = tables[hash];
        if (n != null) {
            while (n.getKey().equals(key)) {
                return n.getValue();
            }
            n = n.next;
        }
        return null;
    }

    public  void put (K key, V value){
        int hash = hash(key);
        var n = tables[hash];
        if (n == null){
            tables[hash(key)] = new Nod<>(key,value);
        } else {
            while (n.next!=null){
               n = n.next;
            }
            n.next = new Nod<>(key, value);
        }
    }

    }


