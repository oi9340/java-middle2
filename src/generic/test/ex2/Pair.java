package generic.test.ex2;

public class Pair<K, V> {

    private K item1;
    private V item2;
    public void setFirst(K item1) {
        this.item1 = item1;
    }

    public void setSecond(V item2) {
        this.item2 = item2;
    }

    public K getFirst() {
        return item1;
    }

    public V getSecond() {
        return item2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }
}
