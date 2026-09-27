import java.util.Scanner;

public class TestCercle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir le rayon du premier cercle: ");
        double r1 = sc.nextDouble();
        Cercle cercle1 = new Cercle(r1);

        System.out.println("\nPremier cercle:");
        cercle1.afficherInfos();

        Cercle cercle2 = new Cercle(cercle1.getDiametre());
        System.out.println("\nDeuxième cercle (rayon = diamètre du premier cercle):");
        cercle2.afficherInfos();

        cercle2.setRayon(3);
        System.out.println("\nDeuxième cercle après modification du rayon à 3:");
        cercle2.afficherInfos();

        cercle2.deplacerCentre(2, 2);
        System.out.println("\nDeuxième cercle après déplacement du centre de (2,2):");
        cercle2.afficherCentre();

        sc.close();
    }
}