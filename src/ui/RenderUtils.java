package ui;

import constants.Constants;

import javax.swing.*;

public class RenderUtils {

    private static boolean do_repaint = false;       // whether a repaint should be triggered

    public static void init() {

        Timer rendering_daemon = new Timer(1000 / Constants.getInt
                ("RefreshRate", Constants.CORE_CONSTANTS), e -> {

            if (do_repaint) {
                SwingUtilities.invokeLater(Window::invokeRepaint);
                do_repaint = false;
            }
        });

        rendering_daemon.start();
    }

    /**
     * Tells the RendeirngService to repaint by setting doRepaint to true
     */
    public static void invokeRepaint() {
        do_repaint = true;
    }

}
