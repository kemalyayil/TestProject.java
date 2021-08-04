package Day46.StringSetImplementation;

import java.util.ArrayList;
import java.util.List;

public class StringSetImplementation1 implements StringSet{

    List<String> storage = new ArrayList<>();

    @Override
    public void add(String s) {
        if (!storage.contains(s))
        storage.add(s);
    }

    @Override
    public void remove(String s) {
        storage.remove(s);
    }

    @Override
    public int size() {
        return storage.size();
    }


    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }
}
