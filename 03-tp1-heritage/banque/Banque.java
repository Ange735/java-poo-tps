public class Banque {

    public static void main(String[] args) {

        Client client1 = new Client("Oujdi", "Ali", 30, 1000);
        Client client2 = new Client("FASSI", "Lina", 27, 2000);
        Client client3 = new Client("OUAZANI", "Karim", 35, 3000);

        client1.getCompte().deposer(1000);

        client2.getCompte().retirer(1500);

        System.out.println("---- Infos clients ----");
        client1.afficher();
        System.out.println();
        client2.afficher();
        System.out.println();
        client3.afficher();
    }
}