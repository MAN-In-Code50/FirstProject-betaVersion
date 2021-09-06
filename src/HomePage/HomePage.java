package HomePage;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.setSize(1080,720);
        homePage.setVisible(true);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(21,45,53));
        homePage.add(jPanel);

    }
}
