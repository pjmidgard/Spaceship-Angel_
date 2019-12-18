package ie.tudublin;

import processing.core.PApplet;

public class boxs {

    PApplet ui;
  
	

    public boxs(PApplet ui) {

        this.ui = ui;
        
    }

    public void drawBoxs() {
        // sets the random value of the stars
        // uses the width and height of screen to do this
        

        ui.fill(255, 248, 128);
        ui.rect(0, 0, 200, 800);
        ui.rect(700, 800, 200, -800);
        ui.rect(0, 100, 800, -800);
        ui.rect(0, 700, 800, 100);

    }
}