import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {

        //page layout set
        setBounds(0, 0, 1300, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);



        //image set
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("score.png"));
        Image i2 = i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, -150, 880, 640); //Quiz image ko set kiya
        add(image);


        JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Minds");
        heading.setBounds(60, 400, 800, 30);
        heading.setFont(new Font("Bold", Font.CENTER_BASELINE, 25));
        heading.setForeground(Color.black);
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(150, 480, 800, 30);
        lblscore.setFont(new Font("Bold", Font.CENTER_BASELINE, 25));
        lblscore.setForeground(Color.black);
        add(lblscore);

        JButton submit= new JButton("Play Again");
        submit.setBounds(260,550,100,30);
        submit.setBackground(new Color(30,144,220));
        submit.setForeground(Color.white);
        submit.addActionListener(this); //performed ke liye
        add(submit);


        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {

        setVisible(false);
        new Login();

    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
