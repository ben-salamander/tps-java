package TPs;

import java.util.Arrays;
import java.util.Scanner;

public class TP15 {
    public static void main(String[] args) {
        //SAISIES
        Scanner keyboard = new Scanner(System.in);
        //Tab1
        System.out.print("Saisissez la taille de votre premier tableau : ");
        int tab1Size = keyboard.nextInt();
        int[] tab1 = new int[tab1Size];
        for (int i=0; i<tab1Size; i++) {
            System.out.printf("Tableau 1 [%d] : ",i);
            tab1[i] = keyboard.nextInt();
        }
        //Tab2
        System.out.print("Saisissez la taille de votre deuxième tableau : ");
        int tab2Size = keyboard.nextInt();
        int[] tab2 = new int[tab2Size];
        for (int i=0; i<tab2Size; i++) {
            System.out.printf("Tableau 2 [%d] : ",i);
            tab2[i] = keyboard.nextInt();
        }
        //Tab3
        System.out.print("Saisissez la taille de votre troisième tableau : ");
        int tab3Size = keyboard.nextInt();
        int[] tab3 = new int[tab3Size];
        for (int i=0; i<tab3Size; i++) {
            System.out.printf("Tableau 3 [%d] : ",i);
            tab3[i] = keyboard.nextInt();
        }

        //TRAITEMENT et AFFICHAGE
        int sommeMultiple3 = 0;

        System.out.printf("T1 : %s", Arrays.toString(tab1));
        System.out.printf("\nT2 : %s", Arrays.toString(tab2));
        System.out.printf("\nT3 : %s", Arrays.toString(tab3));
        System.out.print("\nS = ");

        boolean firstElement = true;
        //Tab1
        for (int e : tab1) {
            if (e%3 == 0){
                sommeMultiple3 = sommeMultiple3 + e;
                if (firstElement){
                    System.out.printf("%d",e);
                    firstElement = false;
                } else {
                    System.out.printf("+%d",e);
                }
            }
        }
        //Tab2
        for (int e : tab2) {
            if (e%3 == 0){
                sommeMultiple3 = sommeMultiple3 + e;
                if (firstElement){
                    System.out.printf("%d",e);
                    firstElement = false;
                } else {
                    System.out.printf("+%d",e);
                }
            }
        }
        //Tab3
        for (int e : tab3) {
            if (e%3 == 0){
                sommeMultiple3 = sommeMultiple3 + e;
                if (firstElement){
                    System.out.printf("%d",e);
                    firstElement = false;
                } else {
                    System.out.printf("+%d",e);
                }
            }
        }
        //Somme
        if (firstElement){
            System.out.print(0);
        } else {
            System.out.printf(" = %d", sommeMultiple3);
        }
    }
}
