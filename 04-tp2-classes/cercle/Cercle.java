public class Cercle {

    private double x = 0;
    private double y = 0;
    private double rayon;
    private double diametre;
    private double surface;

    public Cercle(double rayon) {
        setRayon(rayon);
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
        this.diametre = 2 * rayon;
        this.surface = Math.PI * rayon * rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public double getDiametre() {
        return diametre;
    }

    public double getSurface() {
        return surface;
    }

    public void deplacerCentre(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void afficherCentre() {
        System.out.println("Centre du cercle: (" + x + ", " + y + ")");
    }

    public void afficherInfos() {
        System.out.println("Rayon: " + rayon + " | Diametre: " + diametre + " | Surface: " + surface);
        afficherCentre();
    }
}