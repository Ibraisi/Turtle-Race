package ovn8;
import java.util.Scanner;

import se.lth.cs.p.ovn.turtle.Turtle;
import se.lth.cs.window.SimpleWindow;

public class TurtleRace {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		
		System.out.print("Race distances:  ");
		int dis = scan.nextInt();
		SimpleWindow w = new SimpleWindow(1000,1000, "lol");
		RaceTrack track = new RaceTrack(100,100+dis);
		Turtle t1 = new Turtle(w,350,track.yFnish);
		Turtle t2= new Turtle(w,450,track.yFnish);
		
		track.draw(w);
		
		RacingEvent g = new RacingEvent(track,t1,t2);
		w.waitForMouseClick();
		g.race();
	}
	
	}

