package proclipsingskyscraperoptimization;

import java.util.ArrayList;

import processing.core.PApplet;

public class ColumnGrid {
	
	PApplet parent; // The parent PApplet that we will render ourselves onto
    ArrayList myNSLines;
    ArrayList myEWLines;
    
    int feet = 12;
    int typicalGridDist = (30*feet);
    
    int gridWidth;
    int gridDepth;
    
    public ColumnGrid ( int w, int d, PApplet p ){
    	parent = p;
        gridWidth = w;
        gridDepth = d;
    	myNSLines = new ArrayList();
    	myEWLines = new ArrayList();

    	for (int i=0; i<(int)(gridDepth/typicalGridDist); i++){
    		myNSLines.add( new ColumnGridLine(i*typicalGridDist, parent) );
    	}
    	
    	for (int i=0; i<(int)(gridWidth/typicalGridDist); i++){
    		myEWLines.add( new ColumnGridLine(i*typicalGridDist, parent) );
    	}

    }
    
    public void drawGrid(){
    	for (int i=0; i<myNSLines.size(); i++){
    		ColumnGridLine g = (ColumnGridLine) myNSLines.get(i);
    		g.drawGridLine(gridWidth, gridDepth);
    	}
    	parent.pushMatrix();
    	parent.rotateZ(PApplet.PI/2);
    	for (int i=0; i<myEWLines.size(); i++){
    		ColumnGridLine g = (ColumnGridLine) myEWLines.get(i);
    		g.drawGridLine(gridWidth, gridDepth);
    	}
    	parent.popMatrix();
    }

}
