
/**
 *The class of the linked list node.
 *Used only in hashmap, implemented as a linked lis.
 * @param <K> the type of keys supported by this map
 * @param <V> the type of mapped values
 * @author Vitaliy Belinsky
 */

public class Nod<K,V> {
    K key;
    V value;
    Nod<K,V> next;

    public Nod(K key, V value) {
        this.key = key;
        this.value = value;

    }

    public K getKey() {
        return key;
    }


    public V getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Nod{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
