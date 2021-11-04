package TPs;

import java.util.HashMap;
import java.util.Scanner;

public class TP20 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez une première chaine à tester : ");
        String chaine1 = keyboard.nextLine();
        System.out.print("Saisissez une deuxième chaine à tester : ");
        String chaine2 = keyboard.nextLine();
        String ch1 = chaine1;
        String ch2 = chaine2;
        HashMap<Character,Integer> occurences1=new HashMap<>();
        HashMap<Character,Integer> occurences2=new HashMap<>();
        boolean estAnagramme;

        //Traitement CH1
        //Suppression des premiers espaces
        while (ch1.charAt(0) == ' '){
            ch1 = ch1.substring(1);
        }
        //Suppression des espaces de fin
        while (ch1.charAt(ch1.length()-1) == ' '){
            ch1 = ch1.substring(0,ch1.length()-1);
        }
        //Suppression des espaces dans la chaine
        for (int i = 0; i < ch1.length() ; i++) {
            while(ch1.charAt(i) == ' '){
                ch1 = ch1.substring(0,i) + ch1.substring(i+1);
            }
        }

        //Traitement CH2
        //Suppression des premiers espaces
        while (ch2.charAt(0) == ' '){
            ch2 = ch2.substring(1);
        }
        //Suppression des espaces de fin
        while (ch2.charAt(ch2.length()-1) == ' '){
            ch2 = ch2.substring(0,ch2.length()-1);
        }
        //Suppression des espaces dans la chaine
        for (int i = 0; i < ch2.length() ; i++) {
            while(ch2.charAt(i) == ' '){
                ch2 = ch2.substring(0,i) + ch2.substring(i+1);
            }
        }

        //Occurences CH1
        for(int i=0;i<ch1.length();i++){
            if(occurences1.get(ch1.charAt(i))==null){
                occurences1.put(ch1.charAt(i),1);
            }else{
                occurences1.replace(ch1.charAt(i),occurences1.get(ch1.charAt(i))+1);
            }
        }

        //Occurences CH2
        for(int i=0;i<ch2.length();i++){
            if(occurences2.get(ch2.charAt(i))==null){
                occurences2.put(ch2.charAt(i),1);
            }else{
                occurences2.replace(ch2.charAt(i),occurences2.get(ch2.charAt(i))+1);
            }
        }

        //Comparaison des deux hashmap d'occurences
        estAnagramme = occurences1.equals(occurences2);

        System.out.printf("%s et %s %s",chaine1,chaine2,estAnagramme?
                "sont des anagrammes":
                "ne sont pas des anagrammes");
    }
}
