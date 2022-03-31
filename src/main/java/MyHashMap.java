import java.util.Arrays;

/**
 * This is the class in which the basic methods are implemented, my simple HashMap implementation
 * these are the methods get, put, remove and print
 * @param <K> the type of keys supported by this map
 * @param <V> the type of mapped values
 * @author Vitaliy Belinsky
 */
public class MyHashMap<K, V> {

    private final static int SIZE = 16;
    private Nod<K, V> tables[] = new Nod[SIZE];

    /*
        a simple hash function for linking a key to an index
    */
    private int hash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    /**
     * This method allows you to get the values for the key
     * @param key
     * @return n.value or null
     */
    public V get(K key) {
        int hash = hash(key);
        if (tables[hash] == null) return null;
        else {
            Nod<K, V> n = tables[hash];
            while (n != null) {

                if (n.key.equals(key)) {
                    return n.value;
                }
                n = n.next;
            }
            return null;
        }
    }

    /**
     * The put method allows you to insert a key and values into a hashmap
     * If we already had such a key, it overwrites it
     * @param key
     * @param value
     */
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
            Nod<K, V> nodNew = new Nod<>(key, value);
            tables[hash] = nodNew;
        }
    }
    /**
     * This method allows us to delete the key node
     * @param key
     */
    public void remove(K key) {
        int hash = hash(key);
        Nod<K, V> removeNod;
        removeNod = null;
        tables[hash] = removeNod;
    }

    /**
     * Printing the hashmap data in the specified form
     */
       public void print() {
        for (Nod<K, V> m : tables) {
            if (m != null)
                System.out.println(m.getKey() + "  " + m.getValue());
        }

    }

}


