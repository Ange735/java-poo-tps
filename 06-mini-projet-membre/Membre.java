import java.util.regex.Pattern;
public class Membre {
    
    private static long compteur = 0;
    private final long id;
    private String nom;
    private String prenom;
    private String email;

    public Membre(String nom, String prenom, String email){

        super();

        if(nom ==null || nom.isEmpty()){
            throw new IllegalArgumentException("le nom est obligatoire !");
        }

        if(prenom ==null || prenom.isEmpty()){
            throw new IllegalArgumentException("le prenom est obligatoire !");
        }

        if(email ==null || email.isEmpty()){
            throw new IllegalArgumentException("l'email est obligatoire !");
        }
        if(!validerEmail(email)){
            throw new IllegalArgumentException("l'email est invalide !");
        }

        compteur++;

        this.id=compteur;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;

    }

    private boolean validerEmail(String email) {
        if (email == null) return false;
        // Validation simple : doit contenir au moins un @ et un .
        return email.matches("^.+@.+\\..+$");
    }





}
