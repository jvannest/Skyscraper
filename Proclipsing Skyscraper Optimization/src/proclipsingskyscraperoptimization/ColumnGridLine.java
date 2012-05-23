package proclipsingskyscraperoptimization;

import processing.core.PApplet;

public class ColumnGridLine {
	
	PApplet parent; // The parent PApplet that we will render ourselves onto
	int dist;
	
	int feet = 12;
	int length = 100*feet;
	
	int margin = 25*feet;
	int gridTextSize = 50;
	String name;
	
	ColumnGridLine( int num, PApplet p){
		parent = p;
		dist = num;
		name = ( Integer.toString(num) );
    }

	void drawGridLine(int w, int d){
		parent.stroke(150);
		//parent.translate( -(w/2), 0, 0 );
		parent.line(dist, (-length/2)-margin, dist, (length/2)+margin );
    	parent.fill(50, 50, 50, 155);
    	parent.textSize(gridTextSize);
    	parent.text(name,(length/2)+margin,0);
	}
}
