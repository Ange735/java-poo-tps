import java.util.Scanner;

public class Exo2 {
    static int Trie (int a, int b, int c) {
            if (a <= b && a <= c) {
                return a;
            } else if (b <= a && b <= c) {
                return b;
            } else {
                return c;
            }
        }
    public static void main(String[] args) {
        int a,b,c,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre a: ");
        a = sc.nextInt();   
        System.out.println("Entrez le deuxième nombre b: ");
        b = sc.nextInt();
        System.out.println("Entrez le troisième nombre c: ");
        c = sc.nextInt();
        x=Trie(a,b,c);
        System.out.println("Le plus petit nombre est : " + x);
        sc.close();
    }
}
