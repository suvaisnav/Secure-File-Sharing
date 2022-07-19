
package ospro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * 
 * button 3-Select File
 * button 4-Select Image
 * button 5-Encrypt Image
 * button 6-Save into new image file
 * button 7-Encrypt
 * button 8-Decrypt
 * 
 */
public class encode implements ActionListener{
    
    JFrame frame=new JFrame();
    JLabel jlabelImage,jlabelimage2;
    JButton button3,button4,button5,button6,button7,button8;
    JTextArea text1,text2;
    JScrollPane pane1,pane2,pane3,pane4;
    JTextField j1;
    BufferedImage sourceimage,embeddedimage;
    JButton button9,button10,button11,button12;
    
    encode(){
        
        j1=new JTextField();
        j1.setFont(new Font("arial",Font.BOLD,20));
        j1.setBounds(1000, 50, 150, 50);
        
        
        button7=new JButton();
        button7.setText("Encrypt");
        button7.setFocusable(false);
        button7.setBounds(1180, 50, 100, 50);
        
        
        button8=new JButton();
        button8.setText("Decrypt");
        button8.setFocusable(false);
        button8.setBounds(1300,50,100,50);
        
        button11 =new JButton();
        button11.setText("File Data");
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
        button5.setText("Encrypt Image");
         button5.setFocusable(false);
         button5.setBounds(450, 50, 150, 50);
        button6.setText("Save Into New File");
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
        pane4.setBounds(750, 500, 600, 300);
        pane4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        button9=new JButton();
        button10=new JButton();
        
        button9.setText("Normal Image");
        button9.setFocusable(false);
        button9.setBounds(300, 460, 150, 35);
        
        button10.setText("Steganographed Image");
        button10.setFocusable(false);
        button10.setBounds(900, 460, 250, 35);
          
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(j1);
        frame.add(pane1);
        frame.add(pane2);
        frame.add(pane3);
        frame.add(pane4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button3){
           
   //  System.out.println("Button 1 is clicked");
     
           FileReader reader=null;
           try {
               JFileChooser chooser=new JFileChooser();
               chooser.showOpenDialog(null);
            File f=chooser.getSelectedFile();
               String filename=f.getAbsolutePath();
               reader = new FileReader(filename);
               BufferedReader br=new BufferedReader(reader);
               try {
                   text1.read(br,null);
           //        text2.read(br,null);
                 //  System.out.println(text1);
               } catch (IOException ex) {
                  Logger.getLogger(encode.class.getName()).log(Level.SEVERE, null, ex);
               }
               try {
                  br.close();
              } catch (IOException ex) {
                   Logger.getLogger(encode.class.getName()).log(Level.SEVERE, null, ex);
               }
               text1.requestFocus();
         //      text2.requestFocus();
        } catch (FileNotFoundException ex) {
               Logger.getLogger(encode.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
              try {
                   reader.close();
               } catch (IOException ex) {
                   Logger.getLogger(encode.class.getName()).log(Level.SEVERE, null, ex);
             }           }
         
                 
     }
       
       else if(e.getSource()==button4){
          
            JFileChooser chooser=new JFileChooser();
            FileNameExtensionFilter fnef=new FileNameExtensionFilter("png","jpeg"); 
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
            Image image=i1.getImage();
            
            jlabelImage.setIcon(new ImageIcon(image));
            
          //  jlabelimage2.setIcon(new ImageIcon(image));
       }
       
       else if(e.getSource()==button7){
           String key=j1.getText();
           String message=text1.getText();
         //  System.out.println(message);
        //   System.out.println(key.length());
         //encryption
         String cipher="";
         int j=0;
         for(int i=0;i<message.length();i++){
               if(j>key.length()-1){
                j=0;
             }
             int temp=message.charAt(i) ^ key.charAt(j);
             cipher=cipher+String.format("%02x", (byte)temp);
             j++;
           
         }
          text2.setText(cipher);
       }
       
       else if(e.getSource()==button8){
           
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
        
        text2.setText(decrypText);
       }
       
       
       else if(e.getSource()==button5){
           String mess=text2.getText();
     //      System.out.println(f);
        //    ImageIcon image=(ImageIcon) jlabelImage.getIcon();
      //      System.out.println(image);
      //      System.out.println(image.getIconWidth());
            embeddedimage=sourceimage.getSubimage(0,0,sourceimage.getWidth(),sourceimage.getHeight());
            embedmessage(embeddedimage,mess);
            jlabelimage2.setIcon(new ImageIcon(embeddedimage));
           
       }
       
       else if(e.getSource()==button6){
//                      if(embeddedimage == null) {
//                 JOptionPane.showMessageDialog(frame, "No message has been embedded!",
//                  "Nothing to save", JOptionPane.ERROR_MESSAGE);
//                return;
//              }
//          
//                    try {
//                         //JFileChooser f=new JFileChooser();
//                         ImageIO.write(embeddedimage, "PNG", new File("filename1.png"));
//                     } catch (IOException ex) {
//                         Logger.getLogger(encode.class.getName()).log(Level.SEVERE, null, ex);
//                     }
//           
           
           

            if(embeddedimage == null) {
       JOptionPane.showMessageDialog(frame, "No message has been embedded!", 
         "Nothing to save", JOptionPane.ERROR_MESSAGE);
       return;
      }
         File f = showFileDialog(false);
         String name = f.getName();
         String ext = name.substring(name.lastIndexOf(".")+1).toLowerCase();
     //    System.out.println(ext);
        if(!ext.equals("png") && !ext.equals("jpeg") &&   !ext.equals("dib")) {
          ext = "png";
          f = new java.io.File(f.getAbsolutePath()+".png");
          }
       try {
         if(f.exists()) f.delete();
        ImageIO.write(embeddedimage, ext.toUpperCase(), f);
         } catch(Exception ex) { ex.printStackTrace(); }
   }      
      
    }
    
    public static void main(String []args){
       encode encode=new encode();
    }

    private void embedmessage(BufferedImage img, String mess) {
       int messagelength=mess.length();
        int imagewidth=img.getWidth();
        int imageheight=img.getHeight();
        int imagesize=imagewidth*imageheight;
        if(messagelength*8+32>imagesize){
            JOptionPane.showMessageDialog(frame, "Message is too long for the chosen image","Message too long!", JOptionPane.ERROR_MESSAGE);
               return;
        }
        embedinteger(img,messagelength,0,0);
     //   System.out.println(imagesize);
     byte b[]=mess.getBytes();
 //    System.out.println(b);
 //for(int i=0;i<b.length;i++){
 //    System.out.println(b[i]);
 
     for(int i=0;i<b.length;i++){
         embedbyte(img,b[i],i*8+32,0);
     }
    }

    private File showFileDialog(boolean open) {
    //   return null;
       JFileChooser fc = new JFileChooser("Open an image");
         FileFilter ff = new FileFilter() {
             public boolean accept(java.io.File f) {
          String name = f.getName().toLowerCase();
          if(open)
             return f.isDirectory() || name.endsWith(".jpg") || name.endsWith(".jpeg") ||
                name.endsWith(".png") || name.endsWith(".gif") || name.endsWith(".tiff") ||
                name.endsWith(".bmp") || name.endsWith(".dib");
          return f.isDirectory() || name.endsWith(".png") ||    name.endsWith(".jpeg") ;
          }
       public String getDescription() {
          if(open)
             return "Image (*.jpg, *.jpeg, *.png, *.gif, *.tiff, *.bmp, *.dib)";
          return "Image (*.png, *.bmp)";
          }
         };
  
    fc.setAcceptAllFileFilterUsed(false);
    fc.addChoosableFileFilter(ff);
    File f=null;
   if(open && fc.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
      f = fc.getSelectedFile();
    else if(!open && fc.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION)
        f = fc.getSelectedFile();
    return f;
    }

    private void embedinteger(BufferedImage img, int n, int start, int storagebit) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      int x=img.getWidth(),y=img.getHeight();
        int startx=start/x,starty=start-startx*y,count=0;
         for(int i=startx; i<x && count<32; i++) {
       for(int j=starty; j<y && count<32; j++) {
          int rgb = img.getRGB(i, j);
          int bit = getBitValue(n, count);
          rgb = setBitValue(rgb, storagebit, bit);
          img.setRGB(i, j, rgb);
          count++;
          if(j==x-1) {
              starty = 0;
}
          }
       }
    }

    private void embedbyte(BufferedImage img, int n, int start, int storagebit) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      int x=img.getWidth(),y=img.getHeight();
        int startx=start/x,starty=start-startx*y,count=0;
         for(int i=startx; i<x && count<32; i++) {
         //    System.out.println(i+" "+count);
       for(int j=starty; j<y && count<32; j++) {
          int rgb = img.getRGB(i, j);
          int bit = getBitValue(n, count);
        
          int a=(rgb>>24) & 0xff; 
          int r = (rgb >> 16) & 0xff; 
         int g = (rgb >> 8) & 0xff;
           int b = (rgb >> 0) & 0xff;
          System.out.println("Normal  "+a+"  "+"   "+r+" "+g+" "+b+" bit: "+bit+" count: "+count);
              
           rgb = setBitValue(rgb, storagebit, bit);
        
           a=(rgb>>24)&0xff;
            r = (rgb >> 16) & 0xff; 
         g = (rgb >> 8) & 0xff;
            b = (rgb >> 0) & 0xff;
           System.out.println("stego  "+a+"   "+"   "+r+" "+g+" "+b+" bit: "+bit+" count: "+count);
          img.setRGB(i, j, rgb);
          count++;
          if(j==x-1) {
              starty = 0;
}
          }
       }
    }

    private int getBitValue(int n, int location) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int v = n & (int) Math.round(Math.pow(2, location));
    return v==0?0:1;
    }

    private int setBitValue(int n, int location, int bit) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    

