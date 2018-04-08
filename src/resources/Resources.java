package resources;

import constants.Constants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class Resources {

    public static BufferedImage[] tile_texture;

    public static void importTileResources() {

        tile_texture = new BufferedImage[Constants.getInt("TextureCount", Constants.CORE_CONSTANTS)];

        for (int i = 0; i < tile_texture.length; i++) {
            tile_texture[i] = loadImage("/resources/material/" + i + ".jpg");
        }

    }

    private static BufferedImage loadImage(String res_path) {

        try {
            return ImageIO.read(Resources.class.getResource(res_path));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Resources are missing. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(100);
        }
        return null;
    }

}