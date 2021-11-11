package ovn8;

import se.lth.cs.p.ovn.turtle.Turtle;
import se.lth.cs.window.SimpleWindow;

public class RaceTrack {
	public int yStart, yFnish;
		
	public RaceTrack(int yStart, int yFnish) {
		this.yStart = yStart;
		this.yFnish = yFnish;
	}
	
	
	public void draw(SimpleWindow w) {
		Turtle t = new Turtle(w,250,yStart);
		t.penDown();
		t.right(90);
		t.forward(300);
		t.jumpTo(250, yFnish );
		t.forward(300);	
	}

}