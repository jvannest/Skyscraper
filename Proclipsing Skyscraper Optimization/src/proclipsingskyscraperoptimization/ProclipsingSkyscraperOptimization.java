/*
 *  
 * 
*/

package proclipsingskyscraperoptimization;

import processing.core.PApplet;
import proclipsingskyscraperoptimization.Skyscraper;
import peasy.*;


public class ProclipsingSkyscraperOptimization extends PApplet {
	
	PeasyCam cam;
	
	Skyscraper mySkyscraper;
	int numLevels = 15;
	
	int feet = 12;

	public void setup() {
		size(1200,900, P3D);
		//PFont font = loadFont("FFScala-32.vlw");
		//textFont(font, 14);
		
		cam = new PeasyCam(this, 200*feet);
		cam.setMinimumDistance(2*feet);
		cam.setMaximumDistance(2000*feet);
		  
		mySkyscraper = new Skyscraper(numLevels, this);
	}

	public void draw() {
		background(250);
		prePeasy();
		mySkyscraper.draw();
	}
	
	void prePeasy(){
		translate(0, 0, -2500);
	}
}
