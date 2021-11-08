package TPs;

import java.util.Scanner;

public class TP32_PasHashtag {
    //Fonction
    static void affichPas(int n){
        StringBuilder result = new StringBuilder();
        result.append(" ".repeat(Math.max(0, n)));
        for (int i = 0; i < n ; i++) {
            result.setCharAt(i,'#');
            System.out.println(result);
        }
    }

    //MAIN
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez un numbre de pas à afficher : ");
        int num = keyboard.nextInt();
        affichPas(num);
    }
}
