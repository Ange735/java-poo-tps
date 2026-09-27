public abstract class Personne {

    private String nom;
    private String prenom;
    private int age;
    private boolean admin;

    public Personne(String nom, String prenom, int age, boolean admin) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.admin = admin;
    }

    public abstract void setAdmin(boolean admin);

    public void afficher() {
        System.out.println("Nom: " + nom + " | Prenom: " + prenom + " | Age: " + age);
    }

    public boolean isAdmin() {
        return admin;
    }

    protected void setAdminValue(boolean admin) {
        this.admin = admin;
    }
}