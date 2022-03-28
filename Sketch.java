import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  //for loops that draw the grid in quadrant 1
    
    stroke(0, 0, 0);
    
    for(int i = 1; i <=10; i++){
      int lineX = i * width/20;
      line(lineX, 0, lineX, height/2);
    }
    
    for(int b = 1; b <= 10; b++){
      int lineY = b * height/20;
      line(0, lineY, width/2, lineY);
    }
    //for loops for circle in quadrant 2

    stroke(223, 0, 0);
    fill(40, 29, 240);
    for (int circleX = width/12; circleX <= (width/12) * 5; circleX += width/12) {
      for (int circleY = width/12; circleY <= (width/12) * 5; circleY += width/12) {
        ellipse(width/2 + circleX, circleY, width/12, width/12);
      }
     

      
    }
  // grayscale in quadrant 3
  for (int c = 0; c <= height/2; c++){
    stroke(c, c, c);
    strokeWeight(0.3f);
    int grayLine = c;
    line(grayLine, height/2, grayLine, height);
  }
  //flower drawing in quadrant 4
  stroke(0, 0, 0);
    int intCircleX = width - width/4;
    int intCircleY = height - height/4;
    
    pushMatrix();
    translate(intCircleX, intCircleY);
    for (int i = 0; i <=360; i += 45){
      rotate(radians(i));      
      ellipse(0,0 - width/15, height/20, height/5);
      
    }
    popMatrix();
    
    ellipse(intCircleX, intCircleY, 50, 50);

 
}
}

 
  // define other methods down here.
