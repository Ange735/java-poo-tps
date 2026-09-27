public class CompteBancaire {

    private int numCompte;
    private double solde;

    public CompteBancaire(int numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public void deposer(double s) {
        solde += s;
    }

    public void retirer(double s) {
        if(s <= solde) {
            solde -= s;
        } else {
            System.out.println("Solde insuffisant pour le retrait de " + s + " Dhs");
        }
    }

    public String info() {
        return "[Compte numéro: " + numCompte + ", Solde: " + solde + " Dhs]";
    }
}