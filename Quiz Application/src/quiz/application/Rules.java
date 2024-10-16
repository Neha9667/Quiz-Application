
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton back, start;
    String name;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+ name +" to Hunky Brains");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Band ITC", Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
         JLabel rules=new JLabel();
        rules.setBounds(20,80,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,18));
       rules.setText(
               "<html>"+
                       "1. You are trained to be a programmer and not a story teller, answer point to point"+"<br><br>"+
                       "2. You may have lot of options in life but here all the questions are compulsory"+"<br><br>"+
                       "2. Only a fool asks and a wise answers(Be wise, not otherwise)"+"<br><br>"+
                       "4. Brace Yourself, this paper is not for the faint hearted"+"<br><br>"+
                       "5. May you know more than what John Snow Knows, Good Luck"+"<br><br>"+
                   "<html>"     
       );
        add(rules);
        
        
        back=new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
          start=new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        

        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        } else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Rules("User");
    }
    
}
