import javax.swing.JFrame;
import javax.swing.JButton;

public class Ensam extends JFrame{

    JButton btnValider = new JButton();

    public Ensam(){
        this.setBounds(50, 50, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Ensam");

        btnValider.setText("Valider");
        btnValider.setBounds(100, 100, 150, 50);
        this.add(btnValider);
    }
}
