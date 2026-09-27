import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class MiniProjett {
    public static class Etudiant {
        private int Id;
        private double Note;

        public Etudiant(int id, double note) {
            this.Id = id;
            this.Note = note;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            this.Id = id;
        }

        public double getNote() {
            return Note;
        }

        public void setNote(double note) {
            this.Note = note;
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static Etudiant[] initEtudiant(int n) {
        Etudiant[] etudiants = new Etudiant[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Entrer l'Id de l'étudiant " + (i + 1) + " :");
            int id = sc.nextInt();
            System.out.println("Entrer la note de l'étudiant " + (i + 1) + " :");
            double note = sc.nextDouble();
            etudiants[i] = new Etudiant(id, note);
        }
        return etudiants;

    }
    
    /*
    public static Etudiant[] initEtudiant(int n) {
    Etudiant[] etudiants = new Etudiant[n];

    for (int i = 0; i < n; i++) {

        int id;
        boolean idExiste;

        // boucle jusqu'à ce que l'ID soit unique
        do {
            System.out.println("Entrer l'Id de l'étudiant " + (i + 1) + " :");
            id = sc.nextInt();

            idExiste = false;

            // vérifier si l'ID est déjà utilisé
            for (int j = 0; j < i; j++) {
                if (etudiants[j].getId() == id) {
                    System.out.println("Cet ID existe déjà ! Veuillez en choisir un autre.");
                    idExiste = true;
                    break;
                }
            }

        } while (idExiste); // répéter si l'ID existe déjà

        System.out.println("Entrer la note de l'étudiant " + (i + 1) + " :");
        double note = sc.nextDouble();

        etudiants[i] = new Etudiant(id, note);
    }

    return etudiants;
} */

    public static Etudiant[] modifnote(double n, Etudiant[] etudiants, int id) {
        for (int i = 0; i < etudiants.length; i++) {
            if (id == etudiants[i].getId()) {
                etudiants[i].setNote(n);
                System.out.println("Note de l'etudiant d'ID " + id + " a été modifié avec succes !");
                return etudiants;
            }
        }
        System.out.println("Nous n'avons pas trouver l'etudiant d'ID " + id);
        return etudiants;
    }

    public static Etudiant[] Tridecroi(Etudiant[] etudiants) {
        for (int i = 0; i < etudiants.length; i++) {
            double max = etudiants[i].getNote();
            int ind_max = i;
            for (int j = i; j < etudiants.length; j++) {
                if (etudiants[j].getNote() > max) {
                    ind_max = j;
                    max = etudiants[j].getNote();
                }
            }
            Etudiant temp = etudiants[ind_max];
            etudiants[ind_max] = etudiants[i];
            etudiants[i] = temp;
        }
        return etudiants;

    }

    public static double moyenne(Etudiant[] etudiants) {
        double somme = 0;
        for (int i = 0; i < etudiants.length; i++) {
            somme += etudiants[i].getNote();
        }
        double moy = somme / etudiants.length;
        return moy;
    }

    public static double mediane(Etudiant[] etudiants) {

        Arrays.sort(etudiants, Comparator.comparingDouble(Etudiant::getNote));

        int n = etudiants.length;
        if (n % 2 == 0) {
            return (etudiants[n / 2 - 1].getNote() + etudiants[n / 2].getNote()) / 2;
        } else {
            return etudiants[n / 2].getNote();
        }
    }

    public static Etudiant[] top3(Etudiant[] etudiants) {
        Etudiant[] top3 = new Etudiant[3];
        Etudiant[] trié = Tridecroi(etudiants);
        for (int i = 0; i < 3 && i < trié.length; i++) {
            top3[i] = trié[i];
        }
        return top3;
    }

    public static Etudiant[] normaliser(Etudiant[] etudiants){
        //je veu normaliser les notes entre 6 et 20
        double max = etudiants[0].getNote();
        double min = etudiants[0].getNote();
        for (int i = 1; i < etudiants.length; i++) {
            if (etudiants[i].getNote() > max) {
                max = etudiants[i].getNote();
            }
            if (etudiants[i].getNote() < min) {
                min = etudiants[i].getNote();
            }
        }
        double intervalle = max - min;
        for (int i = 0; i < etudiants.length; i++) {
            if (intervalle != 0) {
                etudiants[i].setNote(6 + (etudiants[i].getNote() - min) * (20 - 6) / intervalle);
            } else {
                etudiants[i].setNote(13); // Mettre la note au milieu de l'intervalle si toutes les notes sont identiques
            }
        }
        return etudiants;

    }

    public static Etudiant recherche(Etudiant[] etudiants, int id) {
        for (int i = 0; i < etudiants.length; i++) {
            if (etudiants[i].getId() == id) {
                return etudiants[i];
            }
        }
        return null; 
    }

}
