import java.util.*;

interface Webable<anyType> {
    public abstract boolean add(String name, ArrayList<String> string, Country a);
    public abstract boolean add(String n, ArrayList<String> string, Country a, int index);
    public abstract void remove(int index);
    public abstract int size();
    public abstract boolean isEmpty();
}
 