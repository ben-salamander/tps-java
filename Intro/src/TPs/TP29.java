package TPs;

import java.util.Arrays;
import java.util.Objects;

public class TP29 {

    static int[] bouger (String[] dir){
        int[] pos = new int[2];
        pos[0] = (int) Arrays.stream(dir).filter(direction -> Objects.equals(direction, "droite")).count()
                - (int) Arrays.stream(dir).filter(direction -> Objects.equals(direction, "gauche")).count();
        pos[1] = (int) Arrays.stream(dir).filter(direction -> Objects.equals(direction, "haut")).count()
                - (int) Arrays.stream(dir).filter(direction -> Objects.equals(direction, "bas")).count();

        return pos;
    }

    public static void main(String[] args) {
        String[] mouvements = new String[]{
                "haut", "haut", "bas", "gauche", "gauche", "droite", "haut"
        };

        System.out.println(Arrays.toString(bouger(mouvements)));
    }
}
