/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.carlos;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 *
 * @author carlos-pc
 */
public class Panel extends JPanel{
    //Ajustamos las constantes del tamaño del panel
    public static final int ANCHO_FRAME = 600;     
    public static final int ALTO_FRAME = 200;
    
    //Atributos del panel
    private JLabel labelURL, labelFichero;
    private JTextArea txtURL, txtFichero;
    private JButton buttonGenerar, buttonCerrar;
    
    public Panel(){
        //Establece el layout del panel
        //Forma de desponer los elementos internamente
        this.setLayout(new FlowLayout());
        //Establecemos color de fondo al panel
        this.setBackground(Color.gray);
        //Tamaño del panel
        this.setSize(ANCHO_FRAME, ALTO_FRAME);
    }
}
