package TPs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TP33_CoupleSommeIntTab {
    //FUNCTION
    static int[][] coupleSomme(int[] tab, int somme){
        HashMap<Integer, Integer> numbers = new HashMap<Integer,Integer>();
        HashMap<Integer,int[]> couples = new HashMap<Integer,int[]>();

        for (int i = 0; i < tab.length ; i++) {
            numbers.put(i,tab[i]);
        }

        int taille = numbers.size();
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println(numbers.toString());
                if (
                        numbers.get(i)!=null &&
                        numbers.get(j)!=null &&
                        numbers.get(i)+numbers.get(j)==somme &&
                        i!=j
                ) {
                    couples.put(couples.size(), new int[]{numbers.get(i), numbers.get(j)});
                    numbers.remove(i);
                    numbers.remove(j);
                }
            }
        }

        int[][] result = new int[couples.size()][];
        for (int i = 0; i < couples.size() ; i++) {
            result[i] = couples.get(i);
        }

        return result;
    }

    //MAIN
    public static void main(String[] args) {
        int somme = 6;
        int[] tab = new int[]{3,2,4,7,5,-1};
        int[][] couples = coupleSomme(tab,somme);

        System.out.print(Arrays.deepToString(couples));
    }
}
