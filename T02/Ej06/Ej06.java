package Ej06;

import javax.swing.*;
import java.awt.*;

public class Ej06 extends JFrame {
    private JSlider slider;
    private JPanel panelBotones;
    private JRadioButton rBtnLvl1;
    private JRadioButton rBtnLvl2;
    private JRadioButton rBtnLvl3;
    private ButtonGroup grupoLvls;

    public Ej06(int screenWidth){
        innitComponents(screenWidth);

    }

    private void innitComponents(int screenWidth){
        slider = new JSlider();
        panelBotones = new JPanel(new FlowLayout());
        rBtnLvl1 = new JRadioButton("Level1");
        rBtnLvl2 = new JRadioButton("Level2");
        rBtnLvl3 = new JRadioButton("Level3");
        grupoLvls = new ButtonGroup();
        grupoLvls.add(rBtnLvl1);
        grupoLvls.add(rBtnLvl2);
        grupoLvls.add(rBtnLvl3);
        panelBotones.add(rBtnLvl1);
        panelBotones.add(rBtnLvl2);
        panelBotones.add(rBtnLvl3);
        add(slider);
        add(panelBotones, BorderLayout.SOUTH);
        setSize(screenWidth,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        slider.addChangeListener(e -> {
            if (rBtnLvl1.isSelected()){
                if (!slider.getValueIsAdjusting()){
                    if (slider.getValue() == 5){
                        UIManager.put("OptionPane.messageForeground", Color.red);
                        JOptionPane.showMessageDialog(this,  slider.getValue() + " ¡Enhorabuena, acertaste!");
                    } else if (slider.getValue() >= 4 && slider.getValue() <= 6) {
                        UIManager.put("OptionPane.messageForeground", Color.orange);
                        JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                    } else {
                        UIManager.put("OptionPane.messageForeground", Color.green);
                        JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                    }
                }
            } else if (rBtnLvl2.isSelected()) {

            } else {
                if (!slider.getValueIsAdjusting()){
                    if (slider.getValue() == 50){
                        UIManager.put("OptionPane.messageForeground", Color.red);
                        JOptionPane.showMessageDialog(this,  slider.getValue() + " ¡Enhorabuena, acertaste!");
                    } else if (slider.getValue() >= 40 && slider.getValue() <= 60) {
                        UIManager.put("OptionPane.messageForeground", Color.orange);
                        JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                    } else {
                        UIManager.put("OptionPane.messageForeground", Color.green);
                        JOptionPane.showMessageDialog(this, slider.getValue() + " Ha estado cerca, prueba otra vez");
                    }
                }
            }

        });

        rBtnLvl1.addActionListener(a -> {
            slider.setMaximum(10);
            slider.setMinimum(0);
            slider.setValue(10/2);
            slider.setBounds((screenWidth/2)-48,0,96, 32);
        });
    }


    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        EventQueue.invokeLater(() -> new Ej06(dimension.width/2).setVisible(true));
    }
}
