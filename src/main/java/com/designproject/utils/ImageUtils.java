package com.designproject.utils;

import javax.swing.ImageIcon;
import java.awt.Image;

public class ImageUtils {

    public static ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage().getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

}
