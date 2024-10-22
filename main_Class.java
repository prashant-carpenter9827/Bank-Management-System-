package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7,b8;

    String pin;

    main_Class(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1400,750);
        add(l3);

        JLabel l4 = new JLabel("Please Select Your Transaction");
        l4.setBounds(380, 160, 400,30);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System", Font.BOLD, 25));
        l3.add(l4);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(367, 245, 150, 30);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("System", Font.BOLD, 12));
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWAL");
        b2.setBounds(620, 245, 150, 30);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("System", Font.BOLD, 12));
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(367, 287, 150, 30);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("System", Font.BOLD, 12));
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(620, 287, 150, 30);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("System", Font.BOLD, 12));
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBounds(367, 329, 150, 30);
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("System", Font.BOLD, 12));
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(620, 329, 150, 30);
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("System", Font.BOLD, 12));
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setBounds(620, 371,150, 30);
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("System", Font.BOLD, 12));
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1400,750);
        setLocation(0,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource()==b7){
            System.exit(0);
        }else if(e.getSource()==b2){
            new Withdrawl(pin);
            setVisible(false);
        }else if(e.getSource()==b6){
            new BalanceEnquriy(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        }else if(e.getSource()==b5){
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }
    }
    public static void main(String[] args) {
        new main_Class("");
    }
}
