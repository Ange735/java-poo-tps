import java.util.Scanner;

public class Exercice1Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre > 0 :");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Reesayer ! Veuillez entrer un nombre > 0 :");
            n = sc.nextInt();
        }
        System.out.println("Merci ! Vous avez entré : " + n);

        boolean prime = Exercice1.isPrime(n);
        if (prime) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }

        int[] facteurs = Exercice1.primeFactors(n);
        System.out.print("Les facteurs premiers de " + n + " sont : ");
        for (int i = 0; i < facteurs.length; i++) {
            if (facteurs[i] != 0) {
                System.out.print(facteurs[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Le nombre de diviseurs de " + n + " est : " + Exercice1.countDivisors(n));

        System.out.println("La somme des diviseurs de " + n + " est : " + Exercice1.sumDivisors(n));

    }
    }

