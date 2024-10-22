package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    String pin;

    TextField textField;

    JButton b1, b2 ;

    Withdrawl(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1400,750);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(410, 150, 700, 35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLESE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(440, 180, 400, 35);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(410,230,320,30);
        textField.setFont(new Font("System", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("System", Font.BOLD, 16));
        b1.setBounds(615, 325, 150, 35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("System", Font.BOLD, 16));
        b2.setBounds(615, 370, 150, 35);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1400,750);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Withdraw");
                }else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from bankone where pin = '"+pin+"'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bankone values ('" + pin + "','" + date + "','withdraw','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successful");
                    setVisible(false);
                    new main_Class(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if (e.getSource()==b2) {
            setVisible(false);
            new main_Class(pin);
        }
    }
    public static void main(String[] args) {
        new Withdrawl("");
    }
}