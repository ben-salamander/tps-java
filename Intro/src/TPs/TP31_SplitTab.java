package TPs;

import java.util.Arrays;

public class TP31_SplitTab {
    static int[][] splitTab (int[] tab2split, int size){
        int nbRows = tab2split.length%size == 0 ? tab2split.length/size : tab2split.length/size +1;
        int[][] splittedTab = new int[nbRows][size];
        splittedTab[splittedTab.length-1] = new int[tab2split.length%size != 0 ? tab2split.length%size : size];
        for (int i = 0; i < tab2split.length; i++) {
            splittedTab[i/size][i%size] = tab2split[i];
        }
        return splittedTab;
    }

    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[][] result = splitTab(tab,7);
        for (int[]e:result) {
            System.out.print(Arrays.toString(e));
        }
    }
}
