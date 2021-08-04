package Day46.StringSetImplementation;

public interface StringSet {
    void add(String s);     // add elements only if unique
    void remove (String s);
    int size();
    void clear();           // remove all Strings from StringSet
    boolean isEmpty();

}
