/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.carlos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author carlos-pc
 */
public class VentanaResultado extends JFrame{
    private JLabel resultado;
    
    //Constructor
    public VentanaResultado(String fichero){
        //Título de la ventana
        this.setTitle(fichero);
        //No se redimensiona la imagen
        this.setResizable(false);
        //Dimensiones permite guardar información de la pantalla
        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
        //Establecemos posición y tamaño de la ventana
        this.setBounds(tamanio.width/2 - QR.ANCHO_QR/2, tamanio.height/2  - QR.ALTO_QR/2, QR.ANCHO_QR, QR.ALTO_QR);
        resultado = new JLabel();
        //Objeto imageIcon para cargar imágenes en el JLabel
        ImageIcon imagen = new ImageIcon(fichero);
        resultado.setIcon(imagen);
        //Añade el JLabel a la ventana
        this.add(resultado);
        //Ventana ajusta el tamaño al tamaño de lo que contenga
        this.pack();
        //Ventana a mostrar
        this.setVisible(true);
    }
}
