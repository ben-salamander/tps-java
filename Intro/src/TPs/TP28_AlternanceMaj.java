package TPs;

import java.util.Arrays;

public class TP28_AlternanceMaj {
    static char[] alternateMaj(char[] tabChar){
        for (int i = 1; i < tabChar.length; i = i+2) {
            tabChar[i] = Character.toUpperCase(tabChar[i]);
        }
        return tabChar;
    }

    public static void main(String[] args) {
        char[] tab = {'a','b','c','d','e','f','g'};
        System.out.print(Arrays.toString(alternateMaj(tab)));
    }
}
