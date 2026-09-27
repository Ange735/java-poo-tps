public class Employe extends Personne {
        private String secursociale;
        private String nomdepart;

        public Employe() {
            super();
            this.secursociale = "";
            this.nomdepart = "";
        }

        public Employe(String nom, String prenom, String adresse, String numero, String secursociale,
                String nomdepart) {
            super(nom, prenom, adresse, numero);
            this.secursociale = secursociale;
            this.nomdepart = nomdepart;
        }

        @Override
        public void afficher() {
            super.afficher();
            System.out.println("Securité sociale: " + secursociale +
                    " | Departement: " + nomdepart);
        }
    }