package proyectofinal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;


public class Backgrounds extends JPanel {
    private Image imagen;

    // Constructor que permite elegir la imagen de fondo
    public Backgrounds(String imagePath) {
        setImage(imagePath);
    }

    // Método para cambiar la imagen de fondo en tiempo de ejecución
    public void setImage(String imagePath) {
        if (imagePath != null) {
            imagen = new ImageIcon(getClass().getResource(imagePath)).getImage();
        } else {
            imagen = null;
        }
        repaint(); // Forzar el repintado del panel con la nueva imagen
    }

    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g); // Llamar al método de la superclase para limpiar el fondo correctamente
        
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

