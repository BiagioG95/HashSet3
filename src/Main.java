import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato

 */
public class Main {
    public static void main(String[] args) {

        HashSet<String> oggetti = creazioneSet();

        String newOggetto = "4";

        System.out.println("Oggetti: " + oggetti);

        oggetti.add(newOggetto);
        System.out.println("Oggetti: " + oggetti);



        Iterator<String> iterator = oggetti.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(newOggetto)) {
                iterator.remove();
            }
        }

        oggetti.clear();

        if (oggetti.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }

    }

    public static HashSet<String> creazioneSet(){
        HashSet<String> oggetti = new HashSet<>();

        oggetti.add("1");
        oggetti.add("2");
        oggetti.add("3");

        return oggetti;

    }
}