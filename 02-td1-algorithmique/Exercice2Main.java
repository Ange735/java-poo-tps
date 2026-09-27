import java.util.Scanner;

public class Exercice2Main {
    public static void main(String[] args) {
        boolean parfait;
        boolean armstrong;
        boolean amicaux;
        int nbr_parfait=0;
        int nbr_armstrog=0;
        int nbr_amicaux=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vous allez entrer 2 nombres a et b tel que a <= b !");
        System.out.println("");

        System.out.print("Veuillez entrer un nombre a  :");
        int a = sc.nextInt();
        System.out.print("Veuillez entrer un nombre b > a :");
        int b = sc.nextInt();
        while (a >= b) {
            System.out.print("Reesayer ! Veuillez entrer un nombre a :");
            a = sc.nextInt();
            System.out.print("Reesayer ! Veuillez entrer un nombre b > a :");
            b = sc.nextInt();
        }

        System.out.println("Les nombres parfaits entre a et b sont :");
        for(int i=a;i<=b;i++){
            parfait=Exercice2.est_parfait(i);
            if(parfait==true) {
                System.out.println(i);
                nbr_parfait++;
            }
        }

        System.out.println("Les nombres d'armstrongs entre a et b sont :");
        for(int i=a;i<b;i++){
            armstrong=Exercice2.est_armstrong(i);
            if(armstrong==true) {
                System.out.println(i);
                nbr_armstrog++;
            }
        }

        System.out.println("Les nombres amicaux entre a et b sont :");
        for(int i=a;i<=b;i++){
            for(int j=i;j<=b;j++){
                amicaux=Exercice2.sont_amicaux(i,j);
                if(amicaux ==true) {
                    System.out.println(i+" et "+ j);
                    nbr_armstrog++;
                }
            }
            
        } 
       

     }
}
