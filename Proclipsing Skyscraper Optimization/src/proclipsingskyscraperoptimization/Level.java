package proclipsingskyscraperoptimization;

import processing.core.PApplet;


public class Level {
    
	PApplet parent; // The parent PApplet that we will render ourselves onto
	float elevation;
	
	int feet = 12;
	int levelWidth = 100*feet;
	int textMargin = 2*feet;
	int levelTextSize = 40;
    
    Level ( int e, PApplet p){
      this.elevation = e;
      parent = p;
    }
    
    void drawLevel(int i){
    	drawLevelGraphic(i);
    	drawLevelData(i);
    }
    
    void drawLevelGraphic(int i){
    	parent.pushMatrix(); 
    	parent.translate(0,0,elevation); 
    	parent.noStroke();  // levels are not outlined
    	parent.fill(250-i*10,0,0,5); // levels are transparent red
    	parent.rectMode(PApplet.CENTER);
    	parent.rect(0, 0, levelWidth, levelWidth); //  
    	parent.popMatrix(); 
    }
    
    void drawLevelData(int i){
    	drawLevelName(i);
    	drawLevelHeight(i);
    }
    
    void drawLevelName(int i){
    	parent.pushMatrix(); 
    	parent.translate(levelWidth/2+textMargin , levelWidth/2, elevation); 
    	parent.fill(50, 50, 50, 55);
    	parent.textSize(40);
    	parent.text("LEVEL " + i, 0, 0);
    	parent.popMatrix(); 
    }
    
    void drawLevelHeight(int i){
    	parent.pushMatrix(); 
    	parent.translate(levelWidth/2+textMargin , levelWidth/2+levelTextSize, elevation); 
    	parent.fill(50, 50, 50, 95);
    	parent.textSize(levelTextSize);
    	parent.text( (int)(elevation/feet) + " ' - " + (int)(elevation%feet) + " ''", 0, 0);
    	parent.popMatrix(); 
    }

}
