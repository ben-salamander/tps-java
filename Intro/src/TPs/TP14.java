package TPs;

import java.util.*;
import java.util.stream.Collectors;

public class TP14 {
    public static void main(String[] args) {
        //Saisies
        int[] tabEntiers = {5,6,7,8,1,654,7,5,1,6,1,8,8,5,4,8};

        //Traitement
        int valFrequent = 0;
        int nbFrequent = 0;

        for (int tabEntier : tabEntiers) {
            //Tab to List, pour utiliser Collections.frequency
            int nbFreq = Collections.frequency(
                    Arrays.stream(tabEntiers)
                    .boxed()
                    .toList()
                    , tabEntier);
            if (nbFreq > nbFrequent) {
                nbFrequent = nbFreq;
                valFrequent = tabEntier;
            }
        }

        //Affichage
        System.out.printf("%d est le plus fréquent avec %d apparitions.",valFrequent,nbFrequent);
    }
}
