import java.util.Scanner;
public class Exercice2 {
    Scanner sc = new Scanner(System.in);

    static boolean est_parfait(int a){
        int x=0;
        for(int i=1;i<a;i++){
            if(a%i == 0){
                x+=i;
            }
        }
        return x==a;
    }

    static boolean est_armstrong(int a){
        int original=a;
        int sum=0;
        int temp=a;
        int nbr=0;

        while(temp >0){
            nbr++;
            temp/=10;
        }
        temp=a;
        while(temp>0){
            int chiffre=temp%10;
            sum+=Math.pow(chiffre,nbr);
            temp/=10;
        }
        return sum==original;
    }

    static boolean sont_amicaux(int a, int b){
        int sum_nbra=0;
        int sum_nbrb=0;

        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum_nbra+=i;
            }
        }
        for(int i=1;i<=b/2;i++){
            if(b%i==0){
                sum_nbrb+=i;
            }
        }

        return sum_nbra==b && sum_nbrb==a;
    }

}
