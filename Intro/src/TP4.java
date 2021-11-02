import java.time.YearMonth;
import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        //Saisies
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez votre age : ");
        int age = keyboard.nextInt();

        //Permutation
        int annee = YearMonth.now().getYear() - age;

        //Affichage
        System.out.printf("Votre année de naissance est %d",annee);
    }
}
