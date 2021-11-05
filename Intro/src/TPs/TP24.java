package TPs;

import java.util.ArrayList;
import java.util.Scanner;

public class TP24 {
    public static void main(String[] args) {
        //Init
        Scanner keyboard = new Scanner(System.in);
        int num=0;
        String sortie = "sortie";
        ArrayList<Integer> nombre = new ArrayList<>();
        ArrayList<Integer> nombreARetirer = new ArrayList<>();

        //Saisie
        //Liste des num
        while (true){
            System.out.print("\nSaisir un nombre à ajouter à la liste\n(Taper entrer pour sortir)\n : ");
            sortie = keyboard.nextLine();
            if (sortie.equals("")) break;
            num = (int) Integer.parseInt(sortie);
            nombre.add(num);
            System.out.print(nombre);
        }

        //Liste des num non désirés
        while (true){
            System.out.print("\nSaisir un nombre à supprimer à la liste\n(Taper entrer pour sortir)\n : ");
            sortie = keyboard.nextLine();
            if (sortie.equals("")) break;
            num = (int) Integer.parseInt(sortie);
            nombreARetirer.add(num);
            System.out.print(nombreARetirer);
        }

        //Suppression des langages à enlever
        for (int numero:nombreARetirer) {
            nombre.removeIf(n -> n == numero);
        }
        System.out.print(nombre);
    }
}
