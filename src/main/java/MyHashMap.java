import java.util.Arrays;

public class MyHashMap<K, V> {

    private final static int SIZE = 16;
    private Nod<K, V> tables[] = new Nod[SIZE];


    private int hash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public Object get(K key) {
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

    public void put(K key, V value) {
        int hash = hash(key);
        Nod<K, V> n = tables[hash];
        if (n != null) {

            if (n.getKey().equals(key)) {
                n.value = value;
            } else {

                while (n.next != null) {
                    n = n.next;
                }
                Nod<K, V> nodOld = new Nod<>(key, value);
                tables[hash] = nodOld;
            }

        } else {
            Nod<K, V> entryNew = new Nod<>(key, value);
            tables[hash] = entryNew;
        }
    }

    public void remove(K key) {
        int hash = hash(key);
        Nod<K,V> removeNod ;
        removeNod = null;
        tables[hash] =removeNod;
    }


    public void print() {
        for (Nod<K, V> m : tables) {
            if (m != null)
                System.out.println(m.getKey() + "  " + m.getValue());
        }

    }

}


