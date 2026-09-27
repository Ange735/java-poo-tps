import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = "o";
        while(r.equals("o")){

        int a, b;
       
        System.out.println("Entrez le premier nombre a: ");
        a = sc.nextInt();
        System.out.println("Entrez le deuxième nombre b: ");
        b = sc.nextInt();
        System.out.println("Veuillez entrer l'operation voulue (+,-,*,/) :");
        String x = sc.next(); 

        switch (x) {
            case "+":
                System.out.println("La somme de a et b est : " + (a + b));
                break;
            case "-":
                System.out.println("La différence de a et b est : " + (a - b));
                break;
            case "*":
                System.out.println("Le produit de a et b est : " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Le quotient de a et b est : " + (a / b));
                } else {
                    System.out.println("Division par zéro n'est pas autorisée.");
                }
                break;
            default:
                System.out.println("Opération non reconnue.");
        }
        System.out.println("Souhaitez-vous effectuer une autre opération ? (o/n)");
        r = sc.next();
    }
        sc.close();

}
}