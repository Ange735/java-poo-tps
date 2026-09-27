public class Etudiant {

    private String nom;
    private String prenom;
    private String cne;
    private int numExam;

    private double note1, note2, note3;
    private boolean inscrModule1, inscrModule2, inscrModule3;

    private static int compteur = 1;

    public Etudiant(String nom) {
        this.nom = nom;
        this.prenom = "";
        this.cne = "";
        this.numExam = compteur++;
    }

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.cne = "";
        this.numExam = compteur++;
    }

    public Etudiant(String nom, String prenom, String cne) {
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.numExam = compteur++;
    }

    public void setNotes(double n1, double n2, double n3) {
        this.note1 = n1;
        this.note2 = n2;
        this.note3 = n3;
    }

    public void setInscriptionModules(boolean m1, boolean m2, boolean m3) {
        this.inscrModule1 = m1;
        this.inscrModule2 = m2;
        this.inscrModule3 = m3;
    }

    public double moyenne() {
        double somme = 0;
        int count = 0;
        if(inscrModule1) { somme += note1; count++; }
        if(inscrModule2) { somme += note2; count++; }
        if(inscrModule3) { somme += note3; count++; }
        if(count == 0) return 0;
        return somme / count;
    }

    public void mention() {
        if(inscrModule1 && inscrModule2 && inscrModule3) {
            double m = moyenne();
            if(m >= 16) System.out.println("Mention: Très Bien");
            else if(m >= 14) System.out.println("Mention: Bien");
            else if(m >= 12) System.out.println("Mention: Assez Bien");
            else if(m >= 10) System.out.println("Mention: Passable");
            else System.out.println("Mention: Échec");
        } else {
            System.out.println("Etudiant non inscrit dans 3 modules");
        }
    }

    public void afficher() {
        System.out.println("NumExam: " + numExam + " | Nom: " + nom + " | Prenom: " + prenom + " | CNE: " + cne);
    }

    public static int getNombreEtudiants() {
        return compteur - 1;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getCne() { return cne; }
}