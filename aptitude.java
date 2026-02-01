import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aptitude extends JFrame implements ActionListener  {

    //                           10 for 10 ques & 5 for (1 ques & 4 options)
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];// user answer ke liye
    JLabel qno,question;// globally declared
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoption;
    JButton Submit,next,lifeline;


    public static int timer = 20;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;
    aptitude(String name){//<....COnstructor
        this.name = name;
        //image set
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("aptitude.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,-30,1300,350); //Quiz image ko set kiya
        add(image);


        qno = new JLabel();
        qno.setBounds(60,350,50,30);
        qno.setFont( new Font("Tahoma",Font.PLAIN,20));
        add(qno);

        question  = new JLabel();
        question.setBounds(85,350,800,30);
        question.setFont( new Font("Tahoma",Font.PLAIN,20));
        add(question);

        questions[0][0] = "A train 150 m long crosses a pole in 15 seconds. What is the speed of the train?";
        questions[0][1] = "8 m/s";
        questions[0][2] = "10 m/s";
        questions[0][3] = "12 m/s";
        questions[0][4] = "15 m/s";

        questions[1][0] = "If 12 men can complete a work in 6 days, how many men are required to complete it in 4 days?";
        questions[1][1] = "8";
        questions[1][2] = "12";
        questions[1][3] = "18";
        questions[1][4] = "24";


        questions[2][0] = "The average of 5 numbers is 20. If one number is removed, the average becomes 16. Find the removed number";
        questions[2][1] = "36";
        questions[2][2] = "40";
        questions[2][3] = "44";
        questions[2][4] = "48";

        questions[3][0] = "Find the next number in the series: 2, 6, 12, 20, 30, ?";
        questions[3][1] = "36";
        questions[3][2] = "40";
        questions[3][3] = "42";
        questions[3][4] = "44";

        questions[4][0] = "If A is the brother of B, and B is the daughter of C, then how is A related to C?";
        questions[4][1] = "Son";
        questions[4][2] = "Brother";
        questions[4][3] = "Father";
        questions[4][4] = "Uncle";

        questions[5][0] = "Choose the correct synonym for BENEVOLENT:";
        questions[5][1] = "Cruel";
        questions[5][2] = "Kind";
        questions[5][3] = "Greedy";
        questions[5][4] = "Harsh";

        questions[6][0] = "Choose the correctly spelled word:";
        questions[6][1] = "Accomodation";
        questions[6][2] = "Accommodation";
        questions[6][3] = "Acommodation";
        questions[6][4] = "Accommadation";

        questions[7][0] = "If a shirt is marked at ₹800 and sold at a discount of 10%, what is the selling price?";
        questions[7][1] = "₹700";
        questions[7][2] = "₹720";
        questions[7][3] = "₹740";
        questions[7][4] = "₹750";

        questions[8][0] = "A train 200 m long crosses a pole in 20 seconds. What is the speed of the train?";
        questions[8][1] = "30 km/h";
        questions[8][2] = "36 km/h";
        questions[8][3] = "40 km/h";
        questions[8][4] = "45 km/h";

        questions[9][0] = "If a dice is rolled once, what is the probability of getting a number greater than 4?";
        questions[9][1] = "1/6";
        questions[9][2] = "2/6 ";
        questions[9][3] = "3/6";
        questions[9][4] = "4/6";

        answers[0][1] = "10 m/s";
        answers[1][1] = "18";
        answers[2][1] = "36";
        answers[3][1] = "42";
        answers[4][1] = "Son";
        answers[5][1] = "Kind";
        answers[6][1] = "accommodation";
        answers[7][1] = "₹720";
        answers[8][1] = "36 km/h";
        answers[9][1] = "2/6 ";

        opt1 = new JRadioButton();
        opt1.setBounds(60,400,300,30);
        opt1.setFont( new Font("Bold",Font.PLAIN,18));
        opt1.setBackground(Color.WHITE);
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(60,430,500,30);
        opt2.setFont( new Font("Bold",Font.PLAIN,18));
        opt2.setBackground(Color.WHITE);
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(60,460,300,30);
        opt3.setFont( new Font("Bold",Font.PLAIN,18));
        opt3.setBackground(Color.WHITE);
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(60,490,300,30);
        opt4.setFont( new Font("Bold",Font.PLAIN,18));
        opt4.setBackground(Color.WHITE);
        add(opt4);

        // for select only one option
        groupoption = new ButtonGroup();
        groupoption.add(opt1);
        groupoption.add(opt2);
        groupoption.add(opt3);
        groupoption.add(opt4);


        next = new JButton("Next");
        next.setBounds(700,440,150,30);
        next.setBackground((new Color(30,144,255)));
        next.setFont(new Font("Tahoma",Font.PLAIN,18));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(700,490,150,30);
        lifeline.setBackground((new Color(30,144,255)));
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,18));
        lifeline.setForeground(Color.white);
        lifeline.addActionListener(this);
        add(lifeline);

        Submit = new JButton("Submit");
        Submit.setBounds(700,540,150,30);
        Submit.setBackground((new Color(30,144,255)));
        Submit.setFont(new Font("Tahoma",Font.PLAIN,18));
        Submit.setForeground(Color.white);
        Submit.addActionListener(this);
        Submit.setEnabled(false);
        add(Submit);


        //page layout set
        setBounds(0,0,1300,700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);

        start(count);  //function create kiya

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ee){
        if(ee.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given =1;
            if(groupoption.getSelection() == null) {
                useranswers[count][0] = "";
            }
            else {
                useranswers[count][0] = groupoption.getSelection().getActionCommand();
            }
            if (count==8){
                next.setEnabled(false);
                Submit.setEnabled(true);
            }

            count++;
            start(count);

        }else if(ee.getSource() == lifeline){
            if(count == 2 || count == 4 || count== 6 || count== 8 || count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);

        } else if (ee.getSource() == Submit){
            ans_given = 1;
            if(groupoption.getSelection() == null) {
                useranswers[count][0] = "";
            }
            else {
                useranswers[count][0] = groupoption.getSelection().getActionCommand();
            }

            for (int i=0;i<useranswers.length;i++){
                if (useranswers[i][0].equals(answers[i][1])){
                    score+=10;
                }else {
                    score+=0;
                }
            }
            setVisible(false);
            new Score(name,score);

        }



    }

    public void paint(Graphics g){ //Timer ke liye graphics ka use kiya(paint method bnya or yh apne aap call hota h).
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; //20
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,22));

        if(timer>0){
            g.drawString(time,850,400);
        }
        else {
            g.drawString("Times up!!",840,400);

        }

        timer--;//19

        try {
            Thread.sleep(1000); // 1 second rokne ke liye thread method ka use kiya
            repaint(); //repaint call kiya value decrease krne ke liye
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1){  // when person given the answer.
            ans_given =0;
            timer = 20;
        } else if (timer<0) {  // when person not given the answer then forward to next ques.
            timer = 20;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8){ // next button ko last question pr disabled krne ke liye.
                next.setEnabled(false);
                Submit.setEnabled(true);//and submit button ko enabled krne ke liye.
            }
            if (count==9){//submit button automatically
                if(groupoption.getSelection() == null) {
                    useranswers[count][0] = "";
                }
                else {
                    useranswers[count][0] = groupoption.getSelection().getActionCommand();
                }

                for (int i=0;i<useranswers.length;i++){
                    if (useranswers[i][0].equals(answers[i][1])){
                        score+=10;
                    }else {
                        score+=0;
                    }
                }
                setVisible(false);
                new Score(name,score);

            }else { //next button
                if(groupoption.getSelection() == null) {
                    useranswers[count][0] = "";
                }
                else {
                    useranswers[count][0] = groupoption.getSelection().getActionCommand();
                }
            }
            if(groupoption.getSelection() == null) {
                useranswers[count][0] = "";
            }
            else {
                useranswers[count][0] = groupoption.getSelection().getActionCommand();
            }
            count++; //0 //1//2//3......10
            start(count);

        }


    }
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");//they stored only int value so we changed it into string.
        question.setText(questions[count][0]);
        opt1.setText((questions[count][1]));
        opt1.setActionCommand(questions[count][1]);
        opt2.setText((questions[count][2]));
        opt2.setActionCommand(questions[count][2]);
        opt3.setText((questions[count][3]));
        opt3.setActionCommand(questions[count][3]);
        opt4.setText((questions[count][4]));
        opt4.setActionCommand(questions[count][4]);

        groupoption.clearSelection();
    }

    public static void main(String[] args){
        new aptitude("User"); //<....Object
    }
}
