package org.example;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JPanel panel1;
    private JPanel panel2;

    public VentanaPrincipal(){

        JMenuBar menu =  new JMenuBar();

        JMenu mnUtili = new JMenu("Utilidades");
        JMenuItem mnItAcerca = new JMenuItem("Acerca de...");
        mnUtili.add(mnItAcerca);
        mnItAcerca.addActionListener((ae)->JOptionPane.showInternalMessageDialog(panel1,"Por ecasado"));  //Eliminar el Internal y jugar con tamaños
        menu.add(mnUtili);

        setJMenuBar(menu);
        setLocationRelativeTo(null);  // Hace que el JFrame aparezca centrado en la pantalla

        panel1 = new JPanel();
        panel2 = new JPanel();

        JButton boton1 = new JButton("Pasar al panel 2");
        JButton boton2 = new JButton("Pasar al panel 1");

        JLabel lbl1 = new JLabel("Estás en el panel 1");
        JLabel lbl2 = new JLabel("Estás en el panel 2");

        panel1.add(lbl1);
        panel1.add(boton1);

        panel2.add(lbl2);
        panel2.add(boton2);

        boton1.addActionListener((ae)->{setContentPane(panel2);
            pack();
            repaint();});
        boton2.addActionListener((ae)->{this.setContentPane(panel1);
        pack();
        repaint();});

        setContentPane(panel1);
        setMinimumSize(new Dimension(400,200));
        pack();
        setVisible(true);

    }

}
