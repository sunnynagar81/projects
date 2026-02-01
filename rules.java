import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {

    JButton back,start,aptitude;
    String name;
    //constructor
    rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        // heading(Welcome user to simple mind)
        JLabel heading = new JLabel(" Welcome " + name + " to Simple Mind");
        heading.setBounds(50,34,1000,50);
        heading.setFont(new Font("Italian",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);


        JLabel rulehead = new JLabel("RULES:");  // heading likhi "Simple Mind"
        rulehead.setBounds(45,65,60,70); // heading ko set kiya
        rulehead.setFont(new Font("Bold",Font.BOLD,15));  // font style
        rulehead.setForeground(Color.blue); // use setForeground for a particular color heading set.
        add(rulehead);   // add kiya frame ke upr


        //Rules
        JLabel Rules = new JLabel();
        Rules.setBounds(30,45,750,400);
        Rules.setFont(new Font("Tahoma",Font.PLAIN,20));
        Rules.setText(
                "<html>"+
                "1. Each quiz has a strict time limit. Once the time is up, the quiz will auto-submit.\n" + "<br><br>"+
                "\n" +
                "2. Copy-pasting from the internet or other participants is not allowed.\n" + "<br><br>"+
                "\n" +
                "3. Only one submission per question unless otherwise specified.\n" + "<br><br>"+
                "\n" +
                "4. Do not get nervous if your friend is answering more questions.\n" + "<br><br>"+
                "\n" +
                "5. No External Help,No collaboration." + "<br><br>"+
         "<html>"
        );
        add(Rules);
        //Button (Rules)
        start = new JButton("For Java MCQs");
        start.setBounds(100,400,150,30);
        start.setBackground(new Color(30,144,220));
        start.setForeground(Color.white);
        start.addActionListener(this); //performed ke liye
        add(start);

        aptitude = new JButton("For Aptitude MCQs");
        aptitude.setBounds(300,400,150,30);
        aptitude.setBackground(new Color(30,144,220));
        aptitude.setForeground(Color.white);
        aptitude.addActionListener(this); //performed ke liye
        add(aptitude);

        //Button (Back)
        back = new JButton(" Back");
        back.setBounds(220,480,100,30);
        back.setBackground(new Color(30,144,220));
        back.setForeground(Color.white);
        back.addActionListener(this); //performed ke liye
        add(back);


        setSize(1300,700);
        setLocation(0,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ee){
        if( ee.getSource() == start){
            setVisible(false);
            new Quiz(name);


        }
        else if (ee.getSource() == aptitude){
            setVisible(false);
            new aptitude(name);
        }
        else {
            setVisible(false);
            new Login();

        }
    }
    public static void main(String[] args){
        new rules("user"); //<.... objeect


        }
    }
