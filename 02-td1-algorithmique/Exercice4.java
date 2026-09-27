import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre n qui sera la taille du tableau:");
        int n = sc.nextInt();

        int[] tab = new int[n];
        System.out.println("Veuillez entrer les éléments du tableau:");

        for (int i = 0; i < n; i++) {
            System.out.println("Entrez l'élément " + (i + 1) + ":");
            tab[i] = sc.nextInt();
        }
        System.out.println("Les éléments du tableau sont:");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }

        //Min, Max,Moyenne
        int min = tab[0];
        int max = tab[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
            if (tab[i] > max) {
                max = tab[i];
            }
            sum += tab[i];
        }
        double moyenne = (double) sum / n;
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Moyenne: " + moyenne);

        //Variance et ecart type
        double variance = 0;
        for (int i = 0; i < n; i++) {
            variance += Math.pow(tab[i] - moyenne, 2);
        }
        double ecartType = Math.sqrt(variance / n);
        System.out.println("Variance: " + variance);
        System.out.println("Ecart type: " + ecartType);

        //Mediane et mode sans arrays.sort
        int[] sortedTab = new int[n];
        for (int i = 0; i < n; i++) {
            sortedTab[i] = tab[i];
        }
        // Tri du tableau trié
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedTab[j] > sortedTab[j + 1]) {
                    int temp = sortedTab[j];
                    sortedTab[j] = sortedTab[j + 1];
                    sortedTab[j + 1] = temp;
                }
            }
        }
        // Calcul de la médiane
        double mediane;
        if (n % 2 == 0) {
            mediane = (sortedTab[n / 2 - 1] + sortedTab[n / 2]) / 2.0;
        } else {
            mediane = sortedTab[n / 2];
        }
        System.out.println("Médiane: " + mediane);

        // Calcul du mode
        int maxCount = 0;
        int mode = sortedTab[0];
        int currentCount = 1;
        for (int i = 1; i < n; i++) {
            if (sortedTab[i] == sortedTab[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = sortedTab[i - 1];
                }
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            mode = sortedTab[n - 1];
        }
        System.out.println("Mode: " + mode);

        //tableau sans les doublons
        int[] uniqueTab = new int[n];
        int uniqueIndex = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (tab[i] == uniqueTab[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueTab[uniqueIndex++] = tab[i];
            }
        }
        System.out.println("Tableau sans doublons:");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.print(uniqueTab[i] + " ");
        }
    }
}
