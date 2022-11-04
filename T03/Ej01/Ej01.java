package Ej01;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Ej01 extends JFrame {

    private JPanel panel;
    private JButton onOFf, play, record, previous, pause, next, goBack, stop, goFront;

    public Ej01 () {
        innitComponents();
    }


    private void innitComponents(){
        panel = new JPanel(new GridLayout(3,3));
        onOFf = new JButton(new ImageIcon("T03/Ej01/img/powerButton.png"));
        play = new JButton(new ImageIcon("T03/Ej01/img/PlayButton.png"));
        record = new JButton(new ImageIcon("T03/Ej01/img/RecordButton.png"));
        previous = new JButton(new ImageIcon("T03/Ej01/img/PreviousButton.png"));
        pause = new JButton(new ImageIcon("T03/Ej01/img/PauseButton.png"));
        next = new JButton(new ImageIcon("T03/Ej01/img/NextButton.png"));
        goBack = new JButton(new ImageIcon("T03/Ej01/img/GobackButton.png"));
        stop = new JButton(new ImageIcon("T03/Ej01/img/StopButton.png"));
        goFront = new JButton(new ImageIcon("T03/Ej01/img/GoForthButton.png"));

        onOFf.setBorder(new EmptyBorder(1,1,1,1));
        onOFf.setBackground(new Color(236, 236,236));
        play.setBorder(new EmptyBorder(1,1,1,1));
        play.setBackground(new Color(236, 236,236));
        record.setBorder(new EmptyBorder(1,1,1,1));
        record.setBackground(new Color(236, 236,236));
        previous.setBorder(new EmptyBorder(1,1,1,1));
        previous.setBackground(new Color(236, 236,236));
        pause.setBorder(new EmptyBorder(1,1,1,1));
        pause.setBackground(new Color(236, 236,236));
        next.setBorder(new EmptyBorder(1,1,1,1));
        next.setBackground(new Color(236, 236,236));
        goBack.setBorder(new EmptyBorder(1,1,1,1));
        goBack.setBackground(new Color(236, 236,236));
        stop.setBorder(new EmptyBorder(1,1,1,1));
        stop.setBackground(new Color(236, 236,236));
        goFront.setBorder(new EmptyBorder(1,1,1,1));
        goFront.setBackground(new Color(236, 236,236));

        panel.add(onOFf);
        panel.add(play);
        panel.add(record);
        panel.add(previous);
        panel.add(pause);
        panel.add(next);
        panel.add(goBack);
        panel.add(stop);
        panel.add(goFront);

        add(panel);
        setSize(new Dimension(675, 615));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);


    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Ej01().setVisible(true));
    }
}
