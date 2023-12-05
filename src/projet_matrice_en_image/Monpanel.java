/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_matrice_en_image;

import java.awt.Graphics;
import java.awt.Panel;

/**
 *
 * @author babru
 */
public class Monpanel extends Panel {
    private Image image_a_modifier;
    public void paint(Graphics g) {
        //To change body of generated methods, choose Tools | Templates.
        if (image_a_modifier != null) {
                g.drawImage(image_a_modifier.getImage(),0,0,200,200,null);
                /* 
                On utilise ici la fonction drawImage préenrégistré dans Graphics
                pour peindre l'image sur le panel du Jframe
                */ 
        }
    }
    public void setImage(Image image_a_modifier) {
        this.image_a_modifier = image_a_modifier;
    }
}
