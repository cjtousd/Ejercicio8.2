/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VENTANAPRINCIPAL extends JFrame implements 
ActionListener {
    private Container contenedor;
// Botones para seleccionar una figura geométrica determinada
private JButton cilindro, esfera, piramide;

public VENTANAPRINCIPAL() {
        inicio();
        setTitle("Figuras"); 
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23);
        esfera.addActionListener(this);
        piramide = new JButton();
        piramide.setText("Piramide");
        piramide.setBounds(225, 50, 100, 23);
        piramide.addActionListener(this);
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
   }
    
    public void actionPerformed(ActionEvent evento) {
        
        if (evento.getSource() == esfera) { 
        VENTANAESFERA esfera = new VENTANAESFERA(); 
        esfera.setVisible(true); 
        }
        if (evento.getSource() == cilindro) { 
        VENTACILINDRO cilindro = new VENTACILINDRO();
        cilindro.setVisible(true);
        }
        if (evento.getSource() == piramide) { 
        VENTANAPIRAMIDE piramide = new VENTANAPIRAMIDE(); 
        piramide.setVisible(true);
        }
    }
}
