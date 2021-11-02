package Cours;

public class Conditions {
    public static void main(String[] args) {
        int a=1, b=4;
        boolean aSupB = a>b;
        if (aSupB){
            System.out.println("A > B");
        } else {
            System.out.println("A pas > B");
        }

        int age = 12;
        boolean peutVoter = age>=18;
        if (peutVoter){
            System.out.println("Peut voter");
        } else {
            System.out.println("Ne peut pas voter");
        }

    }
}
