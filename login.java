import java.awt.event.ActionListener;
import java.util.*;


public class Login  extends JFrame implements ActionListener {

    //globally define kiya
    JButton rules,back;
    JTextField tfname,tfsection,tfroll;

    //Constructor
    Login() {

        getContentPane().setBackground(Color.white);
        setLayout(null); //apna layout bnaya image ko set krne ke liye


        // image class bnayi jo hoty a jframe ke andr...>
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,600); //Quiz image ko set kiya
        add(image);

        JLabel heading = new JLabel("Simple Mind");  // heading likhi "Simple Mind"
        heading.setBounds(700,30,800,70); // heading ko set kiya
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,50));  // font style
        heading.setForeground(Color.orange); // use setForeground for a particular color heading set.
        add(heading);   // add kiya frame ke upr


        JLabel name = new JLabel("Enter your name");  // heading likhi "Simple Mind"
        name.setBounds(650,80,600,70); // heading ko set kiya
        name.setFont(new Font("Bodoni MT",Font.BOLD,25));  // font style
        name.setForeground(Color.black); // use setForeground for a particular color heading set.
        add(name);   // add kiya frame ke upr

        //Blank (for enter name)
        tfname = new JTextField();
        tfname.setBounds(650,140,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        JLabel section = new JLabel("Enter your section");  // heading likhi "Simple Mind"
        section.setBounds(650,170,600,70); // heading ko set kiya
        section.setFont(new Font("Bodoni MT",Font.BOLD,25));  // font style
        section.setForeground(Color.black); // use setForeground for a particular color heading set.
        add(section);

        //Blank (for enter name)
        tfsection = new JTextField();
        tfsection.setBounds(650,230,300,25);
        tfsection.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfsection);


        //Button (Rules)
        rules = new JButton("Enter");
        rules.setBounds(650,350,80,20);
        rules.setBackground(new Color(30,144,220));
        rules.setForeground(Color.white);
        rules.addActionListener(this); //performed ke liye
        add(rules);

        //Button (Back)
        back = new JButton(" Back");
        back.setBounds(870,350,80,20);
        back.setBackground(new Color(30,144,220));
        back.setForeground(Color.white);
        back.addActionListener(this); //performed ke liye
        add(back);


        setSize(1300,700);
        setLocation(0,0);
        setVisible(true); //frame bydefault hidden hota that's why use "true".

    }

    // back & rules button performed...>
    public void actionPerformed(ActionEvent ae){
        if( ae.getSource() == rules){
            String name = tfname.getText(); // user jo text me enter krega usko pass krne ke liye.
            setVisible(false);
            new rules(name);


        }else if (ae.getSource() == back){
            setVisible(false);

        }

    }

    public static void main(String[] args ){
       Login l = new Login();//object bnaya
    }
}
