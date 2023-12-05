/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_matrice_en_image;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


/**
 *
 * @author babru
 */
public class Image {
    int [] tab = new int [784];
    BufferedImage image = new BufferedImage(28,28,BufferedImage.TYPE_INT_RGB);
    Graphics2D g;
    
    public Image(int [] tab) {
        this.tab = tab;
    }
    
    /* On va créer l'image en définissant la couleur de chaques pixels */
    public void modifier() {
        for(int i = 0; i<= 27;i++) {
            for(int j = 0; j<= 27;j++) {
                
                /* Le gris est crée a partir du bleu, du rouge et du vert
                en meme quantité */

                int r = tab[28*j+i]; // red component 0...255
                int gr = tab[28*j+i]; // green component 0...255
                int b = tab[28*j+i];// blue component 0...255
                int col =   (r << 16) | (gr << 8)| b; // décalage dans les bytes pour définir la couleur 
            image.setRGB(i,j,col); // setRGB est défni dans la class Java BufferedImage
        
        }
       }
        
    }

    public BufferedImage getImage() {
        return image;
    }
   
    
}
