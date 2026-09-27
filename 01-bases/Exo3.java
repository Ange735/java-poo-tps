import java.util.Scanner;
public class Exo3 {

    public static int rechercher (int x, int t[]){
        for(int i=0; i<t.length; i++){
            if(t[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static int[] init(int n){
        int t[]=new int[n];
        for(int i=0; i<t.length; i++){
            t[i]=(int)(Math.random()*n);
        }
        return t;
    }

    public static void afficher(int t[]){
        for(int i = 0; i<t.length; i++){
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = init(10);
        afficher(tab);
        int pos = rechercher(5, tab);
        System.out.println("Position de 5 dans le tableau : " + pos);
        sc.close();
    }
}
