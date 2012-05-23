package proclipsingskyscraperoptimization;

import processing.core.PApplet;

public class Column {
	
	PApplet parent; // The parent PApplet that we will render ourselves onto

	Level base;  // Functionally, the level that the column is on
	Level top;   // Used to generate the column height
	
	ColumnGridLine ns;  // All columns occur at Grid line intersections
	ColumnGridLine ew;
	
	float w;  // column width, this is set by user choice of profile
	float d;  // column depth, this is set by user choice of profile
	float h;  // column height, this is a calculated value -- user never directly sets
	
	float crossSection;  //TODO replace with a sketch or profile
	
	Column ( Level l1, Level l2, ColumnGridLine n, ColumnGridLine e, PApplet p) {
        base = l1;
        top = l2;
        ns = n;
        ew = e;
        w = 12;  //TODO set column width by user input
        d = 12;  //TODO set column depth by user input
        h = top.elevation - base.elevation;
      }
	
	
	void drawColumn(){
    	drawColumnModel();
    	drawColumnData();
	}
	
    void drawColumnModel(){
    	//setColors();
    	parent.pushMatrix(); 
    	parent.translate( 0, 0, (base.elevation + h/2) ); // CRUD the grid line doesn't know where it is!
    	parent.box(w, d, h); //to be replaced with extruded sketch of profile  
    	parent.popMatrix(); 
    }
    
    void drawColumnData(){

    }
  
	
}