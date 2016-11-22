import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GroupFrame4 extends JFrame implements ActionListener {

   JPanel mainPanel = new JPanel(new BorderLayout());
   JPanel list = new JPanel(new FlowLayout());
   
   JButton mainButton = new JButton("Test our product!");
   
   JLabel expensive = new JLabel("Too expensive");
   JLabel flimsy = new JLabel("Too flimsy");
   JLabel bulky = new JLabel("Too bulky");
   JLabel feminine = new JLabel("Too feminine");
   JLabel masculine = new JLabel("Too masculine");
   
   int timesPressed = 0;
   
   GroupFrame4() {
      setSize(690,480);
      setVisible(true);
      
      list.setPreferredSize(new Dimension(100,490));
      
      mainPanel.add(mainButton,BorderLayout.CENTER);
      mainPanel.add(list,BorderLayout.EAST);
      add(mainPanel);
      mainButton.addActionListener(this);
   }
   
   

   public void paint(Graphics g){
      super.paint(g);
   }
   
   
   public void actionPerformed(ActionEvent e) {
         timesPressed++;
         if(timesPressed == 1) {list.add(expensive);}
         else if(timesPressed == 2) {list.add(flimsy);}
         else if(timesPressed == 3) {list.add(bulky);}
         else if(timesPressed == 4) {list.add(feminine);}
         else if(timesPressed == 5) {list.add(masculine);}
         revalidate();
         repaint();
   }
   

   
   public static void main(String[] args) {
      GroupFrame4 myFrame = new GroupFrame4();
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }

}