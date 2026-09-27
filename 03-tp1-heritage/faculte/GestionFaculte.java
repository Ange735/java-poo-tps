import java.util.Scanner;

public class GestionFaculte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employe employe = null;
        Professeur professeur1 = null, professeur2 = null;
        Etudiant etudiant1 = null, etudiant2 = null;
        Departement departement = null;

        String choix;
        do {
            System.out.println("\nEntrer le type de personne à saisir:");
            System.out.println("e -> Employe");
            System.out.println("p -> Professeur");
            System.out.println("t -> Etudiant");
            System.out.println("q -> Quitter");
            System.out.print("Choix: ");
            choix = sc.next();

            switch (choix) {
                case "e":
                    sc.nextLine();
                    System.out.print("Nom: "); String nomE = sc.nextLine();
                    System.out.print("Prenom: "); String prenomE = sc.nextLine();
                    System.out.print("Adresse: "); String adresseE = sc.nextLine();
                    System.out.print("Numero: "); String numeroE = sc.nextLine();
                    System.out.print("Numero Secu: "); String secu = sc.nextLine();
                    System.out.print("Departement: "); String dep = sc.nextLine();
                    employe = new Employe(nomE, prenomE, adresseE, numeroE, secu, dep);
                    break;

                case "p":
                    sc.nextLine();
                    System.out.print("Nom: "); String nomP = sc.nextLine();
                    System.out.print("Prenom: "); String prenomP = sc.nextLine();
                    System.out.print("Adresse: "); String adresseP = sc.nextLine();
                    System.out.print("Numero: "); String numeroP = sc.nextLine();
                    System.out.print("Numero Secu: "); String secuP = sc.nextLine();
                    System.out.print("Departement: "); String depP = sc.nextLine();
                    System.out.print("Responsable module (true/false): "); boolean resp = sc.nextBoolean();
                    sc.nextLine(); 
                    if (professeur1 == null) {
                        professeur1 = new Professeur(nomP, prenomP, adresseP, numeroP, secuP, depP, resp);
                    } else if (professeur2 == null) {
                        professeur2 = new Professeur(nomP, prenomP, adresseP, numeroP, secuP, depP, resp);
                    } else {
                        System.out.println("Deux professeurs déjà saisis !");
                    }
                    break;

                case "t":
                    sc.nextLine();
                    System.out.print("Nom: "); String nomT = sc.nextLine();
                    System.out.print("Prenom: "); String prenomT = sc.nextLine();
                    System.out.print("Adresse: "); String adresseT = sc.nextLine();
                    System.out.print("Numero: "); String numeroT = sc.nextLine();
                    System.out.print("CNE: "); String numEt = sc.nextLine();
                    System.out.println("Filière: "); String filiere = sc.nextLine();
                    if (etudiant1 == null) {
                        etudiant1 = new Etudiant(nomT, prenomT, adresseT, numeroT, numEt, filiere);
                    } else if (etudiant2 == null) {
                        etudiant2 = new Etudiant(nomT, prenomT, adresseT, numeroT, numEt, filiere);
                    } else {
                        System.out.println("Deux étudiants déjà saisis !");
                    }
                    break;

                case "q":
                    System.out.println("Fin de saisie.");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (!choix.equals("q"));

        System.out.println("\n--- Informations saisies ---");

        if (employe != null) {
            System.out.println("\nEmployé:");
            employe.afficher();
        } else System.out.println("\nAucun employé saisi.");

        if (professeur1 != null) {
            System.out.println("\nProfesseur 1:");
            professeur1.afficher();
        } else System.out.println("\nAucun professeur 1 saisi.");

        if (professeur2 != null) {
            System.out.println("\nProfesseur 2:");
            professeur2.afficher();
        } else System.out.println("\nAucun professeur 2 saisi.");

        if (etudiant1 != null) {
            System.out.println("\nEtudiant 1:");
            etudiant1.afficher();
        } else System.out.println("\nAucun étudiant 1 saisi.");

        if (etudiant2 != null) {
            System.out.println("\nEtudiant 2:");
            etudiant2.afficher();
        } else System.out.println("\nAucun étudiant 2 saisi.");
    }
}