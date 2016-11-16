import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GroupFrame2 extends JFrame{
	int w = 690;
	int h = 480;
	int radOrange = 80;
	int radBluesm = (int)radOrange/2;
	int radBluelg = (int)3*radOrange/2;
	
	GroupFrame2() {
		setSize(w, h);
		setVisible(true);
	}

	public void paint (Graphics g) {
		super.paint(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval( w/4 + radOrange/2, h/2-radOrange/2, radOrange, radOrange );
		g.fillOval( 3*w/4,h/2-radOrange/2, radOrange, radOrange );
		
		g.setColor(Color.BLUE);
		
		//small blue circles
		g.fillOval( 3*w/4-radBluesm/2 + radOrange/2, h/2-radBluesm/2 + radOrange/2 + 22, radBluesm, radBluesm );
		g.fillOval( 3*w/4-radBluesm/2 + radOrange/2, h/2-radBluesm/2 - radOrange/2 - 22, radBluesm, radBluesm );
		g.fillOval( 3*w/4-radBluesm/2 + radOrange + 22, h/2-radBluesm/2, radBluesm, radBluesm );
		g.fillOval( 3*w/4-radBluesm/2 -22, h/2-radBluesm/2, radBluesm, radBluesm );
		g.fillOval( 3*w/4-radBluesm/2 + radOrange/4 - 24 , h/2-radBluesm/2 - radOrange/4 - 24, radBluesm, radBluesm );
		g.fillOval( 3*w/4-radBluesm/2 + radOrange/4 - 24 , h/2-radBluesm/2 + radOrange/4 + 24, radBluesm, radBluesm );
		g.fillOval( 3*w/4-radBluesm/2 + 3*radOrange/4 + 24 , h/2-radBluesm/2 + radOrange/4 + 24, radBluesm, radBluesm );
		g.fillOval( 3*w/4-radBluesm/2 + 3*radOrange/4 + 24 , h/2-radBluesm/2 - radOrange/4 - 24, radBluesm, radBluesm );
		
		//large blue circles
		g.fillOval( w/4  + 3*radOrange/2 - radBluelg/2 + 90, h/2-radBluelg/2, radBluelg, radBluelg );
		g.fillOval( w/4 + radOrange/2 - radBluelg/2 - 90, h/2-radBluelg/2, radBluelg, radBluelg );
		g.fillOval( w/4 + radOrange/2 - radBluelg/6 - radBluelg/2 - 5, h/2-radBluelg/2 + radOrange/2 + 70, radBluelg, radBluelg );
		g.fillOval( w/4 + radOrange/2 - radBluelg/6 + radBluelg/2 + 5, h/2-radBluelg/2 + radOrange/2 + 70, radBluelg, radBluelg );
		g.fillOval( w/4 + radOrange/2 - radBluelg/6 - radBluelg/2 - 5, h/2-radBluelg/2 - radOrange/2 - 70, radBluelg, radBluelg );
		g.fillOval( w/4 + radOrange/2 - radBluelg/6 + radBluelg/2 + 5, h/2-radBluelg/2 - radOrange/2 - 70, radBluelg, radBluelg );
	}
}


class driver {
	public static void main (String[]args) {
		GroupFrame2 a = new GroupFrame2();
	}
}