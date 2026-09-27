public class Professeur extends Employe{
        private boolean responsable;

        public Professeur() {
            super();
            this.responsable = false;
        }

        public Professeur(String nom, String prenom, String adresse, String numero, String secursociale,
                String nomdepart, boolean responsable) {
            super(nom, prenom, adresse, numero, secursociale, nomdepart);
            this.responsable = responsable;
        }

        @Override
        public void afficher(){
            super.afficher();
            System.out.println("Responsable module: " +
                (responsable ? "Oui" : "Non"));
        }
    }