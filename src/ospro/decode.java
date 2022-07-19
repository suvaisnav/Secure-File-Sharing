
 
package ospro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileWriter;

 
public class decode implements ActionListener {
    JFrame frame=new JFrame();
    JLabel jlabelImage,jlabelimage2;
    JButton button3,button4,button5,button6,button7,button8;
    JTextArea text1,text2;
    JScrollPane pane1,pane2,pane3,pane4;
    JTextField j1;
    BufferedImage sourceimage,embeddedimage;
    JButton button9,button10,button11,button12;
    BufferedImage image;
    
    public decode(){
        
        j1=new JTextField();
        j1.setFont(new Font("arial",Font.BOLD,20));
        j1.setBounds(1000, 50, 150, 50);
        
        
        button7=new JButton();
        button7.setText("Decrypt");
        button7.setFocusable(false);
        button7.setBounds(1180, 50, 100, 50);
        
        
//        button8=new JButton();
//        button8.setText("Decrypt");
//        button8.setFocusable(false);
//        button8.setBounds(1300,50,100,50);
        
        button11 =new JButton();
        button11.setText("Decrypted File Data");
        button11.setFocusable(false);
        button11.setBounds(300, 110, 150, 35);
        
        button12 =new JButton();
        button12.setText("Encrypted File Data");
        button12.setFocusable(false);
        button12.setBounds(900, 110, 150, 35);
        
        jlabelImage=new JLabel();
        jlabelImage.setBounds(50,400,600,400);
        jlabelImage.setBackground(Color.red);
        
        jlabelimage2=new JLabel();
        jlabelimage2.setBounds(50, 650, 600, 400);
        
         button3=new JButton();
          button4=new JButton();
           button5=new JButton();
            button6=new JButton();
          
        button3.setText("Select File");
        button3.setFocusable(false);
        button3.setBounds(50, 50, 150, 50);
        button4.setText("Select Image");
         button4.setFocusable(false);
         button4.setBounds(250, 50, 150, 50);
        button5.setText("Decrypt Image");
         button5.setFocusable(false);
         button5.setBounds(450, 50, 150, 50);
        button6.setText("Save Data Into New File");
        button6.setBounds(650, 50, 150, 50);
         button6.setFocusable(false);
  //      label.setBounds(0,0,100,50);
   //     frame.add(label);
   
        text1=new JTextArea();
        text2=new JTextArea();
        text1.setFont(new Font("arial",Font.BOLD,20));
        text2.setFont(new Font("arial",Font.BOLD,20));
        text1.setBounds(50,150, 600, 300);
  //      text1.setText("Raghavendra");
        text1.setEditable(false);
        text1.setForeground(Color.red);
        text1.setBackground(Color.white);
        
        
        text1.setLineWrap(true);
        text1.setWrapStyleWord(true);
        text1.setBorder(BorderFactory.createBevelBorder(1));
        
        
        
        
        pane1=new JScrollPane(text1);
        pane1.setBounds(50,150,600,300);
        pane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
      
    //    text2.setText("Raghavendra");
        text2.setForeground(Color.red);
        text2.setBackground(Color.white);
        text2.setEditable(false);
        text2.setLineWrap(true);
        text2.setWrapStyleWord(true);
        text2.setBorder(BorderFactory.createBevelBorder(1));
             
        pane2=new JScrollPane(text2);
        pane2.setBounds(50,150,600,300);
        pane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pane2.setBounds(750,150,600,300);
        
        pane3=new JScrollPane(jlabelImage);
        pane3.setBounds(50,500,600,300);
        pane3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pane3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        pane4=new JScrollPane(jlabelimage2);
        pane4.setBounds(50, 500, 1200, 300);
        pane4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        button9=new JButton();
        button10=new JButton();
        
        button9.setText("Decrypted Image");
        button9.setFocusable(false);
        button9.setBounds(300, 460, 150, 35);
        
        button10.setText("Steganographed Image");
        button10.setFocusable(false);
        button10.setBounds(500, 460, 250, 35);
          
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
   //     button8.addActionListener(this);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
    //    frame.add(button8);
     //   frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(j1);
        frame.add(pane1);
        frame.add(pane2);
     //   frame.add(pane3);
        frame.add(pane4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String []args){
        decode n1=new decode();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button4){
           JFileChooser chooser=new JFileChooser();
            FileNameExtensionFilter fnef=new FileNameExtensionFilter("png","jpg","jpeg"); 
            chooser.addChoosableFileFilter(fnef);
            chooser.showOpenDialog(null);
            
            File selectedimage=chooser.getSelectedFile();
           try {
               sourceimage=ImageIO.read(selectedimage);
           } catch (IOException ex) {
               Logger.getLogger(encode.class.getName()).log(Level.SEVERE, null, ex);
           }
            String selectedpath=selectedimage.getAbsolutePath();
            ImageIcon i1=new ImageIcon(selectedpath);
            
            
            Image image2=i1.getImage();
            jlabelimage2.setIcon(new ImageIcon(image2));
       }
       
       else if(e.getSource()==button7){
           //  System.out.println("button is clicked");
           
            String key=j1.getText();
           String cipher=text2.getText();
           
              String hexToDeci = "";
        for (int i = 0; i < cipher.length()-1; i+=2) {
            // splitting hex into a pair of two
            String output = cipher.substring(i, (i+2));
            int decimal = Integer.parseInt(output, 16);
            hexToDeci += (char)decimal;
        }

        // decryption
        String decrypText = "";
        int keyItr = 0;
        for (int i = 0; i < hexToDeci.length(); i++) {
            // XOR Operation
            int temp = hexToDeci.charAt(i) ^ key.charAt(keyItr);

            decrypText += (char)temp;
            keyItr++;
            if(keyItr >= key.length()){
                // once all of key's letters are used, repeat the key
                keyItr = 0;
            }

        }
        
        text1.setText(decrypText);
       }
       else if(e.getSource()==button5){
         //  System.out.println("button is clicked");
         int len = extractInteger(sourceimage, 0, 0);
          byte b[] = new byte[len];
         for(int i=0; i<len; i++)
          b[i] = extractByte( sourceimage, i*8+32, 0);
          text2.setText(new String(b));
          
          
       }
       else if(e.getSource()==button6){
          // System.out.println("button is pe");
           File output=new File("C://Users//HP//Desktop//2-2//output.txt");
          try{
          FileWriter filewriter=new FileWriter("C://Users//HP//Desktop//2-2//output.txt");
          String out=text1.getText();
          filewriter.write(out);
          filewriter.close();
          System.out.println(text1.getText());
          }catch(IOException e1){
              System.out.println(e1);
          }
       }
    }

    private int extractInteger(BufferedImage img, int start, int storageBit) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
    int length = 0;
    for(int i=startX; i<maxX && count<32; i++) {
       for(int j=startY; j<maxY && count<32; j++) {
          int rgb = img.getRGB(i, j), bit = getBitValue(rgb, storageBit);
          length = setBitValue(length, count, bit);
          count++;
               if(j==maxX-1) {
              startY = 0;
}
          }
       }
    return length;
    }

    private byte extractByte(BufferedImage img, int start, int storageBit) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int maxX = img.getWidth(), maxY = img.getHeight(), 
       startX = start/maxY, startY = start - startX*maxY, count=0;
    byte b = 0;
    for(int i=startX; i<maxX && count<8; i++) {
       for(int j=startY; j<maxY && count<8; j++) {
          int rgb = img.getRGB(i, j), bit = getBitValue(rgb, storageBit);
          b = (byte)setBitValue(b, count, bit);
          count++;
          if(j==maxX-1) {
              startY = 0;
}
          }
       }
    return b;
    }

    private int getBitValue(int n, int location) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int v = n & (int) Math.round(Math.pow(2, location));
    return v==0?0:1;
    }

    private int setBitValue(int n, int location, int bit) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   int toggle = (int) Math.pow(2, location),
            bv = getBitValue(n, location);
    if(bv == bit)
       return n;
    if(bv == 0 && bit == 1)
       n |= toggle;
    else if(bv == 1 && bit == 0)
       n ^= toggle;
    return n;
    }
}
