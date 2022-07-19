
package ospro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class home1 implements ActionListener{
    public static JButton button1,button2;
    public static JFrame frame;
    public static void main(String []args){
        
        
         frame=new JFrame();
        frame.setTitle("Steganography");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        frame.setLayout(null);
      
        ImageIcon icon1=new ImageIcon("C://Users//HP//Desktop//assignments//2-1/a.jpeg"); 
        ImageIcon icon2=new ImageIcon("C://Users//HP//Desktop//assignments//2-1/a.jpeg"); 
        
        button1=new JButton();
        button1.setBounds(200, 100, 250, 50);
        button1.setText("Encode");
        button1.setFocusable(false);
 //       button1.setIcon(icon1);
        button1.addActionListener(new home1());
        button1.setFont(new Font("Comic Sans",Font.BOLD,25));
        button1.setForeground(Color.cyan);
        button1.setBackground(Color.lightGray);
        button1.setBorder(BorderFactory.createEtchedBorder());
        
        button2=new JButton();
        button2.setBounds(200, 200, 250, 50);
        button2.setText("Decode");
        button2.setFocusable(false);
        button2.setFont(new Font("Comic Sans",Font.BOLD,25));
   //     button2.setIcon(icon2);
     button2.setForeground(Color.cyan);
        button2.setBackground(Color.lightGray);
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.addActionListener(new home1());
        
        frame.add(button1);
        frame.add(button2);
          frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            frame.dispose();
           System.out.println("Encode button is cliclked");
           encode mywindow=new encode();
        }
        
        else  if(e.getSource()==button2){
            frame.dispose();
           System.out.println("Decode button is cliclked");
           decode window2=new decode();
        }
        
       
    }
}
