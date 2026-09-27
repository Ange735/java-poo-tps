import java.util.Scanner;

public class Exercice5 {
    static Scanner sc = new Scanner(System.in);

    public static int[][] initmatrice(int n, int m){
        int[][]matrice = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println("Entrer le ["+i+"]["+j+"] element :");
                matrice[i][j] = sc.nextInt();
            }
        }
        return matrice;
    }

    public static int[] sommeligne(int[][] matrice){
        int[] somme = new int[matrice.length];
        for (int i=0;i<matrice.length;i++){
            int sum = 0;
            for (int j=0;j<matrice[i].length;j++){
                sum += matrice[i][j];
            }
            somme[i] = sum;
        }
        return somme;
    }

    public static int[] sommecolonne(int[][] matrice){
        int[] somme = new int[matrice[0].length];
        for (int j=0;j<matrice[0].length;j++){
            int sum = 0;
            for (int i=0;i<matrice.length;i++){
                sum += matrice[i][j];
            }
            somme[j] = sum;
        }
        return somme;
    }

    public static boolean estSymetrique(int[][] matrice){
        if (matrice.length != matrice[0].length) {
            return false; // Une matrice non carrée ne peut pas être symétrique
        }
        for (int i=0;i<matrice.length;i++){
            for (int j=0;j<matrice[i].length;j++){
                if (matrice[i][j] != matrice[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] sousmatmax(int[][] matrice){
        int[][] sousmatrice = new int[2][2];
        int n = matrice.length;
        int m = matrice[0].length;

        if(n==2 && m==2){
            return matrice;
        }

        int max= Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                int sum= matrice[i][j] + matrice[i+1][j]+ matrice[i][j+1] + matrice[i+1][j+1];
                if(sum>max){
                    max= sum;
                    sousmatrice[0][0]= matrice[i][j];
                    sousmatrice[0][1]= matrice[i][j+1];
                    sousmatrice[1][0]= matrice[i+1][j];
                    sousmatrice[1][1]= matrice[i+1][j+1];
                }
            }
        }
        return sousmatrice;
    }
}
