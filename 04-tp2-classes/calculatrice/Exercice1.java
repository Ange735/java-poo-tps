import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier: ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxième entier: ");
        int b = sc.nextInt();

        System.out.println("Somme: " + (a + b));
        System.out.println("Soustraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
        } else {
            System.out.println("Division: impossible (division par zéro)");
        }

        sc.close();
    }
}