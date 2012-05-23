package proclipsingskyscraperoptimization;

import java.util.ArrayList;

import processing.core.PApplet;

public class Floor {

	
	PApplet parent; // The parent PApplet that we will render ourselves onto
	Level level;
	
	int thickness = 12;
	String material = "cement";
	
	//ArrayList profilePoints;           <-- Implement when we can draw floor profiles
	//Point[] profile = new Point[4]

    
    Floor ( Level l, PApplet p){
      level = l;
      parent = p;
      
      //TODO impliment drawing profiles for a floor
      //profilePoints = new ArrayList();  <-- Implement when we can draw floor profiles
      
      /*for (int i=0; i<6; i++){
    	  profilePoints.add( ADD POINTS HERE );  <-- Implement when we can draw floor profiles
  		}
	*/
    }
	
    void drawFloor(){
    	setColors();
    	parent.pushMatrix(); 
    	parent.translate(0,0,level.elevation); 
    	parent.rectMode(PApplet.CENTER);
    	parent.rect(0, 0, level.levelWidth, level.levelWidth); //to be replaced with extruded sketch of floor  
    	parent.popMatrix(); 
    }
    
    void setColors(){
    	parent.stroke(155);  // Floors are outlined
    	parent.fill(155,155); // levels are transparent grey
    }
    
}


