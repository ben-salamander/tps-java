package TPs;

import java.util.*;
import java.util.stream.Collectors;

public class TP17 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez une chaine de caractère à décomposer : ");
        String string = keyboard.nextLine();
        //Alphabet
        HashMap<Integer,Character> alphabet = new HashMap<>();
        alphabet.put(0,'a');
        alphabet.put(1,'b');
        alphabet.put(2,'c');
        alphabet.put(3,'d');
        alphabet.put(4,'e');
        alphabet.put(5,'f');
        alphabet.put(6,'g');
        alphabet.put(7,'h');
        alphabet.put(8,'i');
        alphabet.put(9,'j');
        alphabet.put(10,'k');
        alphabet.put(11,'l');
        alphabet.put(12,'m');
        alphabet.put(13,'n');
        alphabet.put(14,'o');
        alphabet.put(15,'p');
        alphabet.put(16,'q');
        alphabet.put(17,'r');
        alphabet.put(18,'s');
        alphabet.put(19,'t');
        alphabet.put(20,'u');
        alphabet.put(21,'v');
        alphabet.put(22,'w');
        alphabet.put(23,'x');
        alphabet.put(24,'y');
        alphabet.put(25,'z');
        alphabet.put(26,',');
        alphabet.put(27,'.');
        alphabet.put(28,'!');
        alphabet.put(29,'*');

        //Traitement
        int[] compteurLettre = new int[alphabet.size()];
        String stringInLower = string.toLowerCase(Locale.ROOT);
        for (int i=0; i<string.length(); i++) {
            if (alphabet.containsValue(stringInLower.toCharArray()[i])){
                for (int j = 0; j < alphabet.size(); j++) {
                    if (alphabet.get(j) == stringInLower.toCharArray()[i]){
                        compteurLettre[j]++;
                    }
                }
            }
        }

        //Affichage
        System.out.printf("'%s' est composé de :",string);
        for (int i = 0; i < compteurLettre.length; i++) {
            if (compteurLettre[i] != 0){
                System.out.printf("\n%s : %d",alphabet.get(i),compteurLettre[i]);
            }
        }
    }
}
