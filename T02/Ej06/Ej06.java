package Ej06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.atomic.AtomicBoolean;

public class Ej06 extends JFrame {
    private JSlider slider;
    private JPanel panelBotones;
    private JRadioButton rBtnLvl1;
    private JRadioButton rBtnLvl2;
    private JRadioButton rBtnLvl3;
    private ButtonGroup grupoLvls;
    private JButton acercaDe;
    private JPanel panelPrincipal;
    private String mensajeAcercaDe = """
            Hecho por Aitor Rodriguez Gallardo
            Elementos utilizados:
                - JSlider para la diana
                - JPanel para contener los botones de nivel
                - 3 JRadioButton para seleccionar el nivel
                - ButtonGroup para agrupar los JRadioButton
                - JPanel para contener a la diana
                - JButton para el acerca de
                - ToolKit para conseguir el ancho de la pantalla""";

    public Ej06(int screenWidth) {
        innitComponents(screenWidth);

    }

    private void innitComponents(int screenWidth) {
        AtomicBoolean buttonListner = new AtomicBoolean(false);
        panelPrincipal = new JPanel(new FlowLayout());
        slider = new JSlider();
        panelBotones = new JPanel(new FlowLayout());
        rBtnLvl1 = new JRadioButton("Level1");
        rBtnLvl2 = new JRadioButton("Level2");
        rBtnLvl3 = new JRadioButton("Level3");
        grupoLvls = new ButtonGroup();
        acercaDe = new JButton("Acerca de");
        grupoLvls.add(rBtnLvl1);
        grupoLvls.add(rBtnLvl2);
        grupoLvls.add(rBtnLvl3);
        panelBotones.add(rBtnLvl1);
        panelBotones.add(rBtnLvl2);
        panelBotones.add(rBtnLvl3);
        rBtnLvl3.setSelected(true);
        panelPrincipal.add(slider);
        add(panelPrincipal);
        add(panelBotones, BorderLayout.SOUTH);
        add(acercaDe, BorderLayout.EAST);
        setSize(screenWidth, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        slider.addChangeListener(e -> {
            if (!buttonListner.get()) {
                if (rBtnLvl1.isSelected()) {
                    if (!slider.getValueIsAdjusting()) {
                        if (slider.getValue() == 5) {
                            UIManager.put("OptionPane.messageForeground", Color.red);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " ¡Enhorabuena, acertaste!");
                        } else if (slider.getValue() >= 4 && slider.getValue() <= 6) {
                            UIManager.put("OptionPane.messageForeground", Color.orange);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                        } else {
                            UIManager.put("OptionPane.messageForeground", Color.green);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                        }
                    }
                } else if (rBtnLvl2.isSelected()) {
                    if (!slider.getValueIsAdjusting()) {
                        if (slider.getValue() == 25) {
                            UIManager.put("OptionPane.messageForeground", Color.red);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " ¡Enhorabuena, acertaste!");
                        } else if (slider.getValue() >= 20 && slider.getValue() <= 30) {
                            UIManager.put("OptionPane.messageForeground", Color.orange);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                        } else {
                            UIManager.put("OptionPane.messageForeground", Color.green);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                        }
                    }
                } else {
                    if (!slider.getValueIsAdjusting()) {
                        if (slider.getValue() == 50) {
                            UIManager.put("OptionPane.messageForeground", Color.red);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " ¡Enhorabuena, acertaste!");
                        } else if (slider.getValue() >= 40 && slider.getValue() <= 60) {
                            UIManager.put("OptionPane.messageForeground", Color.orange);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                        } else {
                            UIManager.put("OptionPane.messageForeground", Color.green);
                            JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                        }
                    }
                }
                UIManager.put("OptionPane.messageForeground", Color.black);
            }


        });
        //Listener para cuando pulsa el boton Lv1
        rBtnLvl1.addActionListener(a -> {
            buttonListner.set(true);
            slider.setMaximum(10);
            slider.setMinimum(0);
            slider.setValue(10 / 2);
            slider.setBounds((screenWidth / 2) - 48, 0, screenWidth / 10, 32);
            buttonListner.set(false);
        });
        //Listener para cuando pulsa el boton Lv2
        rBtnLvl2.addActionListener(a -> {
            buttonListner.set(true);
            slider.setMaximum(50);
            slider.setMinimum(0);
            slider.setValue(50 / 2);
            slider.setBounds((screenWidth / 4) - 5, 0, 490, 32);
            buttonListner.set(false);
        });
        //Listener para cuando pulsa el boton Lv3
        rBtnLvl3.addActionListener(a -> {
            buttonListner.set(true);
            slider.setMaximum(100);
            slider.setMinimum(0);
            slider.setValue(100 / 2);
            slider.setBounds(0, 0, 850, 32);
            buttonListner.set(false);
        });
        //Listener para que el slider empieze con el posicionamiento correcto al iniciar la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                slider.setBounds(0, 0, 850, 32);
            }
        });

        acercaDe.addActionListener(a -> JOptionPane.showMessageDialog(this, mensajeAcercaDe));
    }


    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        EventQueue.invokeLater(() -> new Ej06(dimension.width / 2).setVisible(true));
    }
}
