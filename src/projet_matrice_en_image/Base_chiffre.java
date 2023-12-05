/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_matrice_en_image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author babru
 */
public class Base_chiffre {
    public int traiter(int num) throws FileNotFoundException, IOException {
        File data =new File("C:\\Users\\utilisateur\\Desktop\\COURS\\Projet info\\Label\\train-labels.idx1-ubyte");
        FileInputStream fis =new FileInputStream(data);
        byte [] tab = new byte[4704008];
        int l;
        // récupération des 4 premiers nombres
        l=fis.read(tab);
        int magic;
        int n;
        int nrows;
        int ncolumns;
        int premiers [] = new int[16];      
        
        ArrayList<Integer> début=new ArrayList<>(); // début : ArrayList contenant magic, n, nrows, ncolumns
        
        //remplissage de début
        for(int j=0;j<16;j=j+4){
            début.add((((tab[j]&0xFF)<<24)+((tab[j+1]&0xFF)<<16)+((tab[j+2]&0xFF)<<8)+((tab[j+3]&0xFF))));
            //System.out.println(k);
            //System.out.println("-----------------------------");
        }
        
        magic=début.get(0);
        n=début.get(1);
        nrows=début.get(2);
        ncolumns=début.get(3);
        
        int  chiffre ;
        int offset=8;// pour savoir à combien on commence     
      
            chiffre =(int) (tab[num+8]&0xFF);
            //System.out.println(tab[i]&0xFF);
            System.out.println(chiffre);
            return chiffre;
            
            }
}
