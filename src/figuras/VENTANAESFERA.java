/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VENTANAESFERA  extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel radio, volumen, superficie;
    private JTextField campoRadio; 
    private JButton calcular;
    
    public VENTANAESFERA(){
        inicio();
        setTitle("Esfera"); // Establece el título de la ventana
        setSize(280, 200); // Establece el tamaño de la ventana
        setLocationRelativeTo(null);
        /* La ventana se posiciona en el
centro de la pantalla */
        setResizable(false);

        
    } 

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        radio = new JLabel();
        radio.setText("Radio(cms):");
        radio.setBounds(20, 20, 135, 23);
        campoRadio = new JTextField();
        campoRadio.setBounds(100, 20, 135, 23);
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 50, 135, 23);
        calcular.addActionListener(this);
        volumen = new JLabel();
        volumen.setText("Volumen(cm3):");
        volumen.setBounds(20, 90, 135, 23);
        superficie = new JLabel();
        superficie.setText("Superficie(cm2):");
        superficie.setBounds(20, 120, 135, 23);
        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
    
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) { 
        boolean error = false;
        try {
            double radio = Double.parseDouble(campoRadio.
                        getText());
                ESFERA esfera = new ESFERA(radio);
                volumen.setText("Volumen(cm3): " + 
                        String.format("%.2f", esfera.calcularVolumen()));
                superficie.setText("Superficie(cm2): " + 
                        String.format("%.2f", esfera.calcularSuperficie()));
            } catch (Exception e) {
                error = true; // Si ocurre una excepción
            } finally {
                if (error) {
                   JOptionPane.showMessageDialog(null,
                            "Campo nulo o error en formato de número",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}    
