import java.util.Scanner;
public class Exercice5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre de lignes de la matrice :");
        int n = sc.nextInt();
        System.out.println("Entrer le nombre de colonnes de la matrice :");
        int m = sc.nextInt();
        int[][] matrice = Exercice5.initmatrice(n, m);
        int[] sommeLignes = Exercice5.sommeligne(matrice);
        int[] sommeColonnes = Exercice5.sommecolonne(matrice);
        boolean symetrique = Exercice5.estSymetrique(matrice);
        int[][] sousmatrice = Exercice5.sousmatmax(matrice);
        System.out.println("La somme des lignes de la matrice est :");
        for (int i=0;i<sommeLignes.length;i++){
            System.out.println("Ligne "+i+" : "+sommeLignes[i]);
        }
        System.out.println("La somme des colonnes de la matrice est :");
        for (int j=0;j<sommeColonnes.length;j++){
            System.out.println("Colonne "+j+" : "+sommeColonnes[j]);
        }
        System.out.println("La matrice est-elle symétrique ? " + symetrique);
        System.out.println("La sous-matrice de taille 2x2 d'éléments maximum est :");
        for (int i=0;i<sousmatrice.length;i++){
            for (int j=0;j<sousmatrice[i].length;j++){
                System.out.print(sousmatrice[i][j] + " ");
            }
            System.out.println();
        }

    }
}
