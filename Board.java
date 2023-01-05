import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        // Draw the board
        g.setColor(Color.BLACK);
        g.fillRect(25, 25, 650, 650);
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 600, 600);

        // Draw the home quadrants
        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 150);
        g.setColor(Color.YELLOW);
        g.fillRect(500, 50, 150, 150);
        g.setColor(Color.GREEN);
        g.fillRect(50, 500, 150, 150);
        g.setColor(Color.BLUE);
        g.fillRect(500, 500, 150, 150);

        // Draw the playing area
        g.setColor(Color.BLACK);
        g.fillRect(200, 50, 300, 600);
        g.fillRect(50, 200, 600, 300);

        // Draw the tiles
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.RED);
                }
                g.fillRect(200 + 48 * i, 50 + 48 * j, 48, 48);
            }
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 750, 750);
        window.getContentPane().add(new Board());
        window.setVisible(true);
    }
}
