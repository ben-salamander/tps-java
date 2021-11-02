import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        //Saisies
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez la valeur a : ");
        int a = keyboard.nextInt();
        System.out.print("Entrez la valeur b : ");
        int b = keyboard.nextInt();
        System.out.print("Entrez la valeur c : ");
        int c = keyboard.nextInt();

        //Permutation
        int temp;
        temp = a;
        a = c;
        c = b;
        b = temp;

        //Affichage
        System.out.printf("Les valeurs permuttées sont a=%d, b=%d et c=%d", a, b, c);
    }
}

