import java.util.Scanner;

public class Exercice1 {
    Scanner sc = new Scanner(System.in);
    
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int[] primeFactors(int n) {

        int[] temp = new int[n];
        int index = 0;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                temp[index++] = i;
                n /= i;
            }
        }

        // Création du tableau de taille exacte
        int[] facteurs = new int[index];
        for (int i = 0; i < index; i++) {
            facteurs[i] = temp[i];
        }

        return facteurs;
    }

    static int countDivisors(int n){
        int count =0;
        if(isPrime(n)){
            return 2; // Un nombre premier a exactement 2 diviseurs : 1 et lui-même
        }
        else{
            for(int i=1; i<=n; i++){
                if(n % i == 0){
                    count++;
                }
            }
            return count;
        }
    }

    static int sumDivisors(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    
}
