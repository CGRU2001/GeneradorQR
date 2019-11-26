/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.carlos;

import javax.swing.JFrame;
/**
 *
 * @author carlos-pc
 */

//Clase que hereda de JFrame
//Automáticamente la clase VentanaPrincipal tiene todos
//Los atributos y métodos de JFrame
public class VentanaPrincipal extends JFrame{
    
    //Tamaño de la ventana . Constantes
    public static final int ANCHO_FRAME = 600;     
    public static final int ALTO_FRAME = 200;
    
    public VentanaPrincipal(){
        crearVentana();
    }
    private void crearVentana(){
        
        //Posición y tamaño de la ventana
        
        this.setBounds(400, 250, ANCHO_FRAME, ALTO_FRAME);
        
        //Títutlo de la ventana
        
        this.setTitle("Generador de códigos QR");
        //Venatana redimensionable...
        this.setResizable(false);
        //Cerrar programa al pulsar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Hacemos visible la ventana
        this.setVisible(true);
    }
}
