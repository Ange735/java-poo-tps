public class Personne {

        private String nom;
        private String prenom;
        private String adresse;
        private String numero;

        public Personne() {
            this.nom = "";
            this.prenom = "";
            this.adresse = "";
            this.numero = "";
        }

        public Personne(String nom, String prenom, String adresse, String numero) {
            this.nom = nom;
            this.prenom = prenom;
            this.adresse = adresse;
            this.numero = numero;
        }

        public void afficher() {
            System.out.println("Nom: " + nom + "| Prenom: " + prenom + "| Adresse: " + adresse + "| Numero: " + numero);
        }
    }