public class Departement{
        private String NomDep;
        private Professeur prof;

        public Departement() {
            this.NomDep = "";
            this.prof = new Professeur();
        }

        public Departement(String nomDep,Professeur prof) {
            this.NomDep = nomDep;
            this.prof = prof;
        }

        public void afficher() {
            System.out.println("Departement: " + NomDep);
            System.out.println("Chef de departement:");
            prof.afficher();
        }
        
    }