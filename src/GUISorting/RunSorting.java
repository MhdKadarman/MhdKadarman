package GUISorting;

import javax.swing.*;

public class RunSorting {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException ignored) {

        }

        ImageIcon imageIcon = new ImageIcon("res/Lambang Mtk.jpg");
        JFrame jFrame = new JFrame("Aplikasi Sorting Angka 'Mhd. Kadarman' ");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new TableSorting().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(800, 400);
        jFrame.setVisible(true);
    }

}

