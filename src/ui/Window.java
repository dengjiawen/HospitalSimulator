package ui;

import constants.Constants;

import javax.swing.JFrame;

public class Window extends JFrame {

    private static Window current_window_reference;

    private Canvas canvas;

    public Window() {
        super();

        setSize(Constants.getInt
                ("WindowWidth", Constants.UI_CONSTANTS), Constants.getInt
                ("WindowHeight", Constants.UI_CONSTANTS));
        setUndecorated(true);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

        canvas = new Canvas();
        current_window_reference = this;

        add(canvas);
    }

    static void invokeRepaint() {
        current_window_reference.revalidate();
        current_window_reference.repaint();
    }

}
