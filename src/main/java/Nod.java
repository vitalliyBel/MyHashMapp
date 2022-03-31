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

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Nod{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
