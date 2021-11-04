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
        alphabet.put(1,'a');
        alphabet.put(2,'b');
        alphabet.put(3,'c');
        alphabet.put(4,'d');
        alphabet.put(5,'e');
        alphabet.put(6,'f');
        alphabet.put(7,'g');
        alphabet.put(8,'h');
        alphabet.put(9,'i');
        alphabet.put(10,'j');
        alphabet.put(11,'k');
        alphabet.put(12,'l');
        alphabet.put(13,'m');
        alphabet.put(14,'n');
        alphabet.put(15,'o');
        alphabet.put(16,'p');
        alphabet.put(17,'q');
        alphabet.put(18,'r');
        alphabet.put(19,'s');
        alphabet.put(20,'t');
        alphabet.put(21,'u');
        alphabet.put(22,'v');
        alphabet.put(23,'w');
        alphabet.put(24,'x');
        alphabet.put(25,'y');
        alphabet.put(26,'z');

        //Traitement
        int[] compteurLettre = new int[26];
        String stringInLower = string.toLowerCase(Locale.ROOT);
        for (int i=0; i<string.length(); i++) {
            if (alphabet.containsValue(stringInLower.toCharArray()[i])){
                for (int j = 0; j < alphabet.size(); j++) {
                    if (alphabet.get(j+1) == stringInLower.toCharArray()[i]){
                        compteurLettre[j]++;
                    }
                }
            }
        }

        //Affichage
        System.out.printf("'%s' est composé de :",string);
        for (int i = 0; i < compteurLettre.length; i++) {
            if (compteurLettre[i] != 0){
                System.out.printf("\n%s : %d",alphabet.get(i+1),compteurLettre[i]);
            }
        }
    }
}
