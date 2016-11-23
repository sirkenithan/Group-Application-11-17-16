import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GroupFrame1 extends JFrame implements ActionListener {

   JPanel superPane = new JPanel(new FlowLayout());
   
   GroupFrame1() {
      setSize(200,80);
      this.init();
      setVisible(true);
      this.add (superPane, BorderLayout.CENTER);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public void paint(Graphics g){
      super.paint(g);
   }
   
   public void init() {
      JRadioButton radio1 = new JRadioButton("1");
      JRadioButton radio2 = new JRadioButton("2");
      JRadioButton radio3 = new JRadioButton("3");
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(radio1);
      bg.add(radio2);
      bg.add(radio3);
      superPane.add(radio1);
      superPane.add(radio2);
      superPane.add(radio3);
      radio1.setMnemonic(KeyEvent.VK_1);
      radio1.setMnemonic(KeyEvent.VK_2);
      radio1.setMnemonic(KeyEvent.VK_3);
      radio1.addActionListener(this);
      radio2.addActionListener(this);
      radio3.addActionListener(this);
      
      
   }
   
   
   public void actionPerformed(ActionEvent e) {
         switch(Integer.parseInt(e.getActionCommand())){
            case 1:
                    new GroupFrame2();
                  break;
            case 2:
                    new GraphButtons();
                  break;
            case 3:
                    new GroupFrame4();
                  break;
         }
   }
   

   
   public static void main(String[] args) {
      GroupFrame1 myFrame = new GroupFrame1();
   }

}
