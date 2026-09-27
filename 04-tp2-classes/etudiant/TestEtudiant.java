import java.util.Scanner;

public class TestEtudiant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Etudiant e1 = new Etudiant("Ahmed");
        Etudiant e2 = new Etudiant("Sara", "Fassi");
        Etudiant e3 = new Etudiant("Karim", "Oujdi", "CNE123");
        Etudiant e4 = new Etudiant(e3.getNom(), e3.getPrenom(), e3.getCne());

        e1.setInscriptionModules(true, true, true);
        e3.setInscriptionModules(true, true, false);
        e4.setInscriptionModules(true, false, true);

        System.out.println("Saisir notes pour l'étudiant 1:");
        System.out.print("Note1: "); double n11 = sc.nextDouble();
        System.out.print("Note2: "); double n12 = sc.nextDouble();
        System.out.print("Note3: "); double n13 = sc.nextDouble();
        e1.setNotes(n11, n12, n13);

        System.out.println("Saisir notes pour l'étudiant 3:");
        System.out.print("Note1: "); double n31 = sc.nextDouble();
        System.out.print("Note2: "); double n32 = sc.nextDouble();
        System.out.print("Note3: "); double n33 = sc.nextDouble();
        e3.setNotes(n31, n32, n33);

        System.out.println("\nEtudiant 1:");
        e1.afficher();
        System.out.println("Moyenne: " + e1.moyenne());
        e1.mention();

        System.out.println("\nEtudiant 3:");
        e3.afficher();
        System.out.println("Moyenne: " + e3.moyenne());
        e3.mention();

        System.out.println("\nEtudiant 4:");
        e4.afficher();
        e4.mention();

        System.out.println("\nNombre total d'étudiants inscrits: " + Etudiant.getNombreEtudiants());

        sc.close();
    }
}