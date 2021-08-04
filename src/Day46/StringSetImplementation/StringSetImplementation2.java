package Day46.StringSetImplementation;

public class StringSetImplementation2 implements StringSet{

    String [] storage = new String[0];

    @Override
    public void add(String s) {
        // checking if String s exists in our Array
        for (int i = 0; i < storage.length; i++){
            if (storage[i].equals(s))
                return;                 // void metotsa ve sonda return varsa kosul saglandiysa execution i durdurur.
                                        // diger kisimlar i run etmez
        }

        // copy and add the element
        String [] copy = new String[storage.length + 1];        // yeni array orijinalin'den bir fazla olacak.
        for (int i = 0; i < storage.length; i++) {
            copy[i] = storage[i];               // this is how we copy to another array. line 18 -19
        }

        storage = copy;                 // simdi ise copy orijinal oldu.

        storage[storage.length - 1] = s;

    }

    @Override
    public void remove(String s) {
        // check if element exists or not
        int index = -1 ;        // buraya sifir yazmadik, cunku ...
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].equals(s)){
                index = i;
            }
        }
        if (index == -1){
            // element not found
            return;
        }

        // copy and remove element from array
        String [] copy = new String[storage.length-1];          // created copy array to make the lenght - 1
        boolean found = false;
        for (int i = 0; i < storage.length; i++) {
            if (i == index && !found ){         // !found = not true
                found = true;
                continue;               // means skip it, will not stop the execution.
            }
            copy[!found ? i : i-1] = storage[i];        // if found is false
        }
        storage = copy;
    }

    @Override
    public void clear() {
        storage = new String[0];
    }

    @Override
    public boolean isEmpty() {
        return storage.length ==0;
    }

    @Override
    public int size() {
        return storage.length;
    }
}
