package ovn8;

import java.util.Random;

import se.lth.cs.p.ovn.turtle.Turtle;
import se.lth.cs.window.SimpleWindow;

public class RacingEvent {
	private Random rand = new Random();
	private RaceTrack track;
	private Turtle  t1,t2;
	

	RacingEvent(RaceTrack track, Turtle  t1, Turtle t2){
	
		this.track = track;
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public void race() {
		t1.penDown();
		t2.penDown();

		SimpleWindow w = null;
		while(t1.getY() != track.yStart && t2.getY() != track.yStart) {
			t1.forward(rand.nextInt(2));t2.forward(rand.nextInt(2));
			w.delay(10);
		}		
	}

}
