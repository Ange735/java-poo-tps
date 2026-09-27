public class Etudiant extends Personne{
        private String CNE;
        private String filiere;

        public Etudiant() {
            super();
            this.CNE = "";
            this.filiere = "";
        }

        public Etudiant(String nom, String prenom, String adresse, String numero, String cNE, String filiere) {
            super(nom, prenom, adresse, numero);
            this.CNE = cNE;
            this.filiere = filiere;
        }
        
        @Override
        public void afficher(){
            super.afficher();
            System.out.println("CNE : "+CNE+"| Filière : "+filiere);
        }
    }