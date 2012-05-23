package proclipsingskyscraperoptimization;

import proclipsingskyscraperoptimization.LevelStack;
import processing.core.PApplet;


public class Skyscraper {

    float x;
    float y;
    float radius;
    
    int feet = 12;
    
    int skyscraperWidth = 100*feet;
    int skyscraperDepth = 125*feet;
    
    PApplet parent; // The parent PApplet that we will render ourselves onto
    
    LevelStack myLevelStack;
    ColumnGrid myColumnGrid;
    Floor[] myFloors;
    
    public Skyscraper ( int numLevels, PApplet p){
    	parent = p;
    	myLevelStack = new LevelStack(numLevels, parent); 
    	myColumnGrid = new ColumnGrid(skyscraperWidth, skyscraperDepth, parent); 
    	
    	//initFloors(numLevels);
    }
  
    public void draw(){
    	myLevelStack.drawStack();
    	myColumnGrid.drawGrid();
    	//drawFloors();
    	//myStairs.draw();
    }
    
    public void initFloors( int numLevels, PApplet p ){
    	myFloors = new Floor[numLevels];
    	parent = p;
    	for(int i=0; i<numLevels; i++){
    		myFloors[i] = new Floor( (Level) myLevelStack.myLevels.get(i), parent);
    	}
    }
    
    public void drawFloors(){
    	for(int i=0; i<myFloors.length; i++){
    		
    	}
    }
}
