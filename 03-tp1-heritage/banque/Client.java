public class Client extends Personne {

    private static int nextNumCompte = 1000;
    private CompteBancaire compte;

    public Client(String nom, String prenom, int age, double soldeInitial) {
        super(nom, prenom, age, false);
        this.compte = new CompteBancaire(nextNumCompte++, soldeInitial);
    }

    @Override
    public void setAdmin(boolean admin) {
        setAdminValue(admin);
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println(compte.info());
    }

    public CompteBancaire getCompte() {
        return compte;
    }
}