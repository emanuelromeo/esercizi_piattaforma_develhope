// Scrivere una funzione che restituisca un HashSet riempito
// Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
// Verificare che l' elemento sia parte del Set e stampare il risultato

package hash_set_2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = getStringHashSet();
        String string = "ForLoop";

        System.out.println("La stringa è presente nel set? " + stringHashSet.contains(string));
    }

    public static HashSet<String> getStringHashSet() {
        return new HashSet<>(Arrays.asList("ForLoop", "WhileLoop", "DoWhileLoop", "Develhope"));
    }
}
