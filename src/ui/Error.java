package ui;

import javax.swing.*;
import java.util.concurrent.Executors;

public class Error {

    public static void main (String[] args) {

        Executors.newSingleThreadExecutor().submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
            JOptionPane.showMessageDialog(null, "An error had occured. Press OK to see the error message.", "Error", JOptionPane.ERROR_MESSAGE);
            try {
                Thread.sleep(200);
            } catch (Exception e) {}
            JOptionPane.showMessageDialog(null, "An error occured while bringing up $class.ErrorPane.\n" +
                    "Error message cannot be displayed.", "Error", JOptionPane.ERROR_MESSAGE);
        });

        JOptionPane.showMessageDialog(null,"Loading application. Please wait.", "Loading", JOptionPane.INFORMATION_MESSAGE);

    }

}
