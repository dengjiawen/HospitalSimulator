package ui;

import constants.Constants;

import javax.swing.JPanel;

public class Canvas extends JPanel {

    public Canvas() {

        super();

        setBounds(0, 0, Constants.getInt
                ("WindowWidth", Constants.UI_CONSTANTS) * 3, Constants.getInt
                ("WindowHeight", Constants.UI_CONSTANTS) * 3);
    }

}
