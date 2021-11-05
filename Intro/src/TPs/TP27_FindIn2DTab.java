package TPs;

import java.util.ArrayList;
import java.util.Arrays;

public class TP27_FindIn2DTab {
    static ArrayList<int[]> findIn2DTab (int[][] tab, int number){
        ArrayList<int[]> results = new ArrayList<int[]>();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == number){
                    int[] result = {i,j};
                    results.add(result);
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[][] myTab = {{1,2,3},{4,5,6},{7,1,1}};
        int number = 1;
        var result = findIn2DTab(myTab,number);

        System.out.printf("Le tableau contient %d '%d' aux emplacement : ",result.size(),number);

        for (int[] ints : result) {
            System.out.print(Arrays.toString(ints));
        }

    }
}
