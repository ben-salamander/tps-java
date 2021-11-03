package TPs;

public class TP10 {
    public static void main(String[] args) {
        //Affichage
        System.out.println("Tables de multiplication");
        for (int i=2;i<=10;i++){
            System.out.printf("\nTable de %d :\n",i);
            for (int j=1;j<=10;j++){
                System.out.printf("%dx%d = %d\n",j,i,i*j);
            }
        }
    }
}
