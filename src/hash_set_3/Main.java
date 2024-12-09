package hash_set_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = getStringHashSet();
        String string = "DoWhileLoop";

        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()) {
            String setString = iterator.next();
            if (setString.equals(string)) {
                iterator.remove();
                System.out.println("Elemento \"" + setString + "\" rimosso");
            }
        }

        stringHashSet.clear();
        System.out.println("Il set è vuoto? " + stringHashSet.isEmpty());
    }

    public static HashSet<String> getStringHashSet() {
        return new HashSet<>(Arrays.asList("ForLoop", "WhileLoop", "DoWhileLoop", "Develhope"));
    }
}
