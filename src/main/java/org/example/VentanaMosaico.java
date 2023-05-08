package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class VentanaMosaico extends JFrame {

    public VentanaMosaico() {

        JPanel panelDatos = new JPanel();
        JPanel panelBienvenido = new JPanel();

        panelBienvenido.setLayout(new BoxLayout(panelBienvenido, BoxLayout.Y_AXIS));
        JPanel panelBotones = new JPanel();

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnConsultar = new JButton("Consultar");
        JButton btnSalirAp = new JButton("Salir");

        panelBotones.add(btnNuevo);
        panelBotones.add(btnConsultar);
        panelBotones.add(btnSalirAp);

        panelBotones.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel lbPanelDatos = new JLabel("En este panel introduciríamos los datos");
        panelDatos.add(lbPanelDatos);

        JTextArea texAreaBienvenida = new JTextArea("En este panel le damos la bienvenida a la aplicación que, realmente, no hace nada más que aparentar que hace algo");
        texAreaBienvenida.setLineWrap(true);

        Component cajaVacia = Box.createRigidArea(new Dimension(20, 20));
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelBienvenido.add(texAreaBienvenida);
        panelBienvenido.add(cajaVacia);
        panelBienvenido.add(btnCerrar);

        btnCerrar.setHorizontalAlignment(SwingConstants.CENTER);

        btnCerrar.addActionListener((ae) -> {
            remove(panelBienvenido);
            repaint();
        });

        btnNuevo.addActionListener((ae) -> {
            //removeAll();
            add(panelDatos, BorderLayout.NORTH);
            repaint();
        });


        add(panelBienvenido);
        add(panelBotones, BorderLayout.SOUTH);
        setSize(400, 200);
        setVisible(true);

    }
}
