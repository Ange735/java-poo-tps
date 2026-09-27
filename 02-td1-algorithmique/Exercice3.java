import java.util.Scanner;
import java.util.Random;

public class Exercice3 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    Random random = new Random();
    int magique;
    int utilisateur;
    int index=0;
    int[] tab_mag = new int[4];
    int[] tab_uti = new int[4];
    
    magique=random.nextInt(9000) + 1000;

    int temp=magique;
    while(temp>0){
        tab_mag[index++]=temp%10;
        temp/=10;
    }

    do{
    int indexx=0;
    System.out.println("Veuillez entrer une combinaison de 4 chiffres et tenté de trouver le combo gagnant ! :");
    utilisateur = sc.nextInt();
    
    int temps=utilisateur;
    while(temps>0){
        tab_uti[indexx++]=temps%10;
        temps/=10;
    }

    int cpt=0;
    for(int i=0;i<=3;i++){
        if(tab_mag[i]==tab_uti[i]){
            cpt++;
        }
    }
    if(cpt==4) System.out.println("Felicitation, vous avez trouver la combinison magique ! : " + magique); 
    else System.out.println("Vous avez trouvez " + cpt + " bonnes positions, continuez d'essayer ! : "); 

    } while(magique != utilisateur);
}
}
