package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4,r5,r6;

    JButton next;

    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;

    JTextField text1,text2,text3,text5,text6,text7,text8;

    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 = (ran.nextLong()% 9000L)+1000L;
    String first = " " + Math.abs(first4);


    signup() {

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        label1 = new JLabel("APPLICTION FORM NO. " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Releway",Font.BOLD,38));
        add(label1);

        label2 = new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Releway",Font.BOLD,22));
        add(label2);

        label3 = new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Releway",Font.BOLD,22));
        add(label3);

        label4 = new JLabel("Name :");
        label4.setBounds(100,190,100,30);
        label4.setFont(new Font("Releway",Font.BOLD,20));
        add(label4);

        text1 = new JTextField();
        text1.setBounds(300,190,400,30);
        text1.setFont(new Font("Releway",Font.BOLD,14));
        add(text1);

        label5 = new JLabel("Father's Name :");
        label5.setBounds(100,240,300,30);
        label5.setFont(new Font("Releway",Font.BOLD,20));
        add(label5);

        text2 = new JTextField();
        text2.setBounds(300,240,400,30);
        text2.setFont(new Font("Releway",Font.BOLD,14));
        add(text2);

        label6= new JLabel("Date Of Birth :");
        label6.setBounds(100,290,200,30);
        label6.setFont(new Font("Releway",Font.BOLD,20));
        add(label6);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,290,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        label7= new JLabel("Gender :");
        label7.setBounds(100,340,200,30);
        label7.setFont(new Font("Releway",Font.BOLD,20));
        add(label7);

        r1= new JRadioButton("Male");
        r1.setFont(new Font("Releway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,340,60,30);
        add(r1);

        r2= new JRadioButton("Female");
        r2.setFont(new Font("Releway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,340,90,30);
        add(r2);

        r6= new JRadioButton("Other");
        r6.setFont(new Font("Releway",Font.BOLD,14));
        r6.setBackground(new Color(222,255,228));
        r6.setBounds(600,340,90,30);
        add(r6);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r6);

        label8= new JLabel("Email address :");
        label8.setBounds(100,390,200,30);
        label8.setFont(new Font("Releway",Font.BOLD,20));
        add(label8);

        text3 = new JTextField();
        text3.setBounds(300,390,400,30);
        text3.setFont(new Font("Releway",Font.BOLD,14));
        add(text3);

        label9= new JLabel("Marital Status :");
        label9.setBounds(100,440,200,30);
        label9.setFont(new Font("Releway",Font.BOLD,20));
        add(label9);

        r3= new JRadioButton("Married");
        r3.setFont(new Font("Releway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,440,90,30);
        add(r3);

        r4= new JRadioButton("Unmarried");
        r4.setFont(new Font("Releway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,440,120,30);
        add(r4);

        r5= new JRadioButton("Other");
        r5.setFont(new Font("Releway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(600,440,120,30);
        add(r5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);

        label10= new JLabel("Address :");
        label10.setBounds(100,490,200,30);
        label10.setFont(new Font("Releway",Font.BOLD,20));
        add(label10);

        text5 = new JTextField();
        text5.setBounds(300,490,400,30);
        text5.setFont(new Font("Releway",Font.BOLD,14));
        add(text5);

        label11= new JLabel("City :");
        label11.setBounds(100,540,200,30);
        label11.setFont(new Font("Releway",Font.BOLD,20));
        add(label11);

        text6 = new JTextField();
        text6.setBounds(300,540,400,30);
        text6.setFont(new Font("Releway",Font.BOLD,14));
        add(text6);

        label12= new JLabel("PIN Code :");
        label12.setBounds(100,590,200,30);
        label12.setFont(new Font("Releway",Font.BOLD,20));
        add(label12);

        text7 = new JTextField();
        text7.setBounds(300,590,400,30);
        text7.setFont(new Font("Releway",Font.BOLD,14));
        add(text7);

        label13= new JLabel("State :");
        label13.setBounds(100,640,200,30);
        label13.setFont(new Font("Releway",Font.BOLD,20));
        add(label13);

        text8 = new JTextField();
        text8.setBounds(300,640,400,30);
        text8.setFont(new Font("Releway",Font.BOLD,14));
        add(text8);

        next = new JButton("Next");
        next.setFont(new Font("Releway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,670,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(800, 750);
        setLocation(360,-10);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = text1.getText();
        String fatherName = text2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor()).getText();

        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }

        String email = text3.getText();

        String marital = null;
        if(r3.isSelected()){
            marital = "married";
        }else if(r4.isSelected()){
            marital = "Unmarried";
        }else if(r5.isSelected()){
            marital = "Other";
        }

        String address = text5.getText();
        String city = text6.getText();
        String pincode = text7.getText();
        String state = text8.getText();

        try {
            if (text2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill alll the fields");
            }else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fatherName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new signup();
    }

}
