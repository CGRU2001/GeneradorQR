/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.carlos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
    private JTextField txtURL, txtFichero;
    private JButton buttonGenerar, buttonCerrar;
    
    public Panel(){
        //Establece el layout del panel
        //Forma de desponer los elementos internamente
        this.setLayout(new FlowLayout());
        //Establecemos color de fondo al panel
        this.setBackground(Color.gray);
        //Tamaño del panel
        this.setSize(ANCHO_FRAME, ALTO_FRAME);
        inicializarComponentes();
    }
    private void inicializarComponentes(){
        //Añade la etiqueta para introducir la URL
        this.labelURL = new JLabel("Introduce la URL o el texto:");
        this.add(labelURL);
        
        //Añade el campo de texto para poner la URL del vídeo
        this.txtURL = new JTextField(25);
        this.add(txtURL);
        
        //Añade la etiqueta para indicar el nombre del fichero
        labelFichero = new JLabel("Indica el nombre del fichero: ");
        this.add(labelFichero);
        
        //Añade el campo de texto para poner el fichero
        this.txtFichero = new JTextField(25);
        this.add(txtFichero);
        
        //Generamos los botones
        
        //Generamos el botón "Generar"
        
        buttonGenerar = new JButton("Generar QR");
        this.add(buttonGenerar);
        //Le damos comportamiento al botón general
        buttonGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //Si algún campo está vacío, se cumple esta condición
                if(txtURL.getText().isEmpty() || txtFichero.getText().isEmpty()){
                    if(txtURL.getText().isEmpty() && !(txtFichero.getText().isEmpty())){
                        JOptionPane.showMessageDialog(null, "Has dejado el campo 'URL o texto' vacío");
                    }else if(txtFichero.getText().isEmpty() && !(txtURL.getText().isEmpty() )){
                        JOptionPane.showMessageDialog(null, "Has dejado el campo 'fichero' vacío");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Has dejado todos los campos vacíos");
                    }
                    
                }
                else{
                    //Código que genera el QR
                    QR.escribirQR(txtURL.getText(), txtFichero.getText(), "png");
                }
            }
        });
        
        //Creamos el botón "Cerrar"
        
        buttonCerrar = new JButton("Cerrar");
        this.add(buttonCerrar);
        //Le damos comportamiento al botón cerrar
        //Usamos una clase interna anónima
        //Interna al método ActionListener
        //Anónima porque no tiene identificador
        buttonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
    }
}
