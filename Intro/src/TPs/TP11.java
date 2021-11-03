package TPs;

import java.util.Scanner;

public class TP11 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez un numéro à factorialiser : ");
        int number = keyboard.nextInt();
        int result = number;
        System.out.printf("%d",number);

        //Traitement et Affichage factoriel
        for (int i = number-1;i>1;i--){
            System.out.printf("x%d",i);
            result = result * i;
        }

        //Affichage résultat
        System.out.printf("x%d = %d",1,result);

    }
}
