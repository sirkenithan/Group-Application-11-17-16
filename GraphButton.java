
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GraphButton extends JFrame implements ActionListener
{

    public static JButton North;
    public static JButton East;
    public static JButton South;
    public static JButton West;
    public static JButton Center;

    GraphButton()
    {
        super("CRAZY BUTTONS");

        North = new JButton("N");
        East = new JButton("E");
        South = new JButton("S");
        West = new JButton("W");
        Center = new JButton("Press <-> <-> Me !");

        add(North, BorderLayout.NORTH);
        add(East, BorderLayout.EAST);
        add(South, BorderLayout.SOUTH);
        add(West, BorderLayout.WEST);
        add(Center);

        Center.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent buttonObject)
    {
        North.setText("N");
        East.setText("E");
        South.setText("S");
        West.setText("W");
        randomButton();


    }

    public static void randomButton()
    {
        Random rand = new Random();
        int num = rand.nextInt(4);

        switch (num)
        {
            case 0:
                North.setText("NORTH");
                North.setBorderPainted(false);
                North.setOpaque(true);
                randomColor(North);
                break;
            case 1:
                East.setText("EAST");
                East.setBorderPainted(false);
                East.setOpaque(true);
                randomColor(East);
                break;
            case 2:
                South.setText("SOUTH");
                South.setBorderPainted(false);
                South.setOpaque(true);
                randomColor(South);
                break;
            case 3:
                West.setText("WEST");
                West.setBorderPainted(false);
                West.setOpaque(true);
                randomColor(West);
                break;
        }
    }

    public static JButton randomColor(JButton randButton)
    {
        randButton.setForeground(Color.black);
        Random rand = new Random();
        int num = rand.nextInt(5);

        switch (num)
        {
            case 0:
                Center.setText("LOVE");
                randButton.setForeground(Color.white);
                randButton.setBackground(Color.blue);
                break;
            case 1:
                Center.setText("HUMANITY");
                randButton.setForeground(Color.yellow);
                randButton.setBackground(Color.black);
                break;
            case 2:
                Center.setText("HONESTY");
                randButton.setForeground(Color.black);
                randButton.setBackground(Color.green);
                break;
            case 3:
                Center.setText("INTEGRITY");
                randButton.setForeground(Color.red);
                randButton.setBackground(Color.yellow);
                break;
            case 4:
                Center.setText("KINDNESS");
                randButton.setForeground(Color.blue);
                randButton.setBackground(Color.orange);
        }

        return randButton;
    }

    public static void main(String[] args)
    {
        GraphButton myButton = new GraphButton();
        myButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
