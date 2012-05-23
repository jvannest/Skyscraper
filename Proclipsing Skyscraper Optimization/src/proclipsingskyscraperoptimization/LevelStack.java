package proclipsingskyscraperoptimization;

import proclipsingskyscraperoptimization.Level;
import processing.core.PApplet;
import java.util.*;

public class LevelStack {
	PApplet parent; // The parent PApplet that we will render ourselves onto
    ArrayList myLevels;
    int feet = 12;
    int typicalLevelHeight = (14*feet)+4;
    
    public LevelStack ( int numLevels, PApplet p ){
    	parent = p;
    	myLevels = new ArrayList();

    	for (int i=0; i<numLevels; i++){
    		myLevels.add( new Level(i*typicalLevelHeight, parent) );
    	}

    }

    public void drawStack(){
    	for (int i=0; i<myLevels.size(); i++){
    		Level lev = (Level) myLevels.get(i);
    		parent.println("Got Level " + i + " out of the arrayList... here comes draw()...");
    		lev.drawLevel(i);
    	}
    }
    
}

