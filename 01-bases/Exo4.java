public class Exo4 {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(0.5f, 0.5f, 2.0f);
        System.out.println(c1);
        System.out.println("Surface = " + c1.surface());
    }
}

class Cercle {
    private float x;
    private float y;
    private float r;

    public Cercle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        if (r < 0) {
            throw new IllegalArgumentException("Le rayon doit être positif");
        }
        this.r = r;
    }

    public Cercle() {
    }

    public float getX() { return x; }
    public void setX(float x) { this.x = x; }

    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    public float getR() { return r; }
    public void setR(float r) { this.r = r; }

    public float surface() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
