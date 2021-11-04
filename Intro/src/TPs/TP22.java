package TPs;

import java.util.HashMap;
import java.util.Scanner;

public class TP22 {
    public static void main(String[] args) {
        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez une chSansDoublons à tester : ");
        String chDepart = keyboard.nextLine();
        String chSansDoublons = chDepart;

        //Traitement
        HashMap<Character,Integer> occurences=new HashMap<>();
        int posPhrase = 0;
        for(int i=0;i<chDepart.length();i++){
            if(occurences.get(chDepart.charAt(i))==null){
                occurences.put(chDepart.charAt(i),1);
                posPhrase++;
            }else{
                occurences.replace(chDepart.charAt(i),occurences.get(chDepart.charAt(i))+1);
                chSansDoublons = chSansDoublons.substring(0,posPhrase) +  chSansDoublons.substring(posPhrase+1);
            }
        }

        //Affichage
        System.out.printf("Phrase de départ : %s",chDepart);
        System.out.printf("\nPhrase sans doublons : %s",chSansDoublons);
        System.out.printf("\nDoublons : %s",occurences.toString());
    }
}
