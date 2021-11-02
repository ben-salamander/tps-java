import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
        //Saisies
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez la valeur x : ");
        int x = keyboard.nextInt();
        System.out.print("Entrez la valeur y : ");
        int y = keyboard.nextInt();

        //Permutation
        int temp = x;
        x = y;
        y = temp;

        //Affichage
        System.out.printf("Les valeurs permuttées sont x=%d et y=%d", x, y);
    }
}
