package ie.tudublin;

import processing.core.PApplet;

public class stars {

    PApplet ui;
    float len, lon;

    public stars(PApplet ui, float len, float lon) {

        this.ui = ui;
        this.len = len;
        this.lon = lon;
    }

    public void drawStars() {
        // sets the random value of the stars
        // uses the width and height of screen to do this
        float len = ui.random(200, ui.width = 400);
        float lon = ui.random(200, ui.height = 400);
        ui.fill(255, 3);
        ui.rect(0, 0, ui.width, ui.height);
        ui.fill(255, 14, 17);
        ui.ellipse(len, lon, 5, 5);
        ui.fill(255, 255, 0);
        ui.fill(255, 122, 123);
        ui.ellipse(len, lon, 10, 10);
        ui.fill(255, 255, 255);
        ui.fill(255, 255, 0);
        ui.ellipse(len, lon, 7, 5);

        ui.fill(len, lon, len);
        ui.ellipse(310, lon, 5, 5);
        ui.ellipse(320, lon, 5, 5);
        ui.ellipse(330, lon, 5, 5);
        ui.ellipse(330, lon, 5, 5);
        ui.ellipse(340, lon, 5, 5);
        ui.ellipse(350, lon, 5, 5);
        ui.ellipse(360, lon, 5, 5);
        ui.ellipse(370, lon, 5, 5);
        ui.ellipse(380, lon, 5, 5);
        ui.ellipse(390, lon, 5, 5);
        ui.ellipse(400, lon, 5, 5);
        ui.ellipse(410, lon, 5, 5);
        ui.ellipse(420, lon, 5, 5);
        ui.ellipse(430, lon, 5, 5);
        ui.ellipse(440, lon, 5, 5);
        ui.ellipse(450, lon, 5, 5);
        ui.ellipse(460, lon, 5, 5);
        ui.ellipse(470, lon, 5, 5);

        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(350, lon, 5, 5);
        ui.ellipse(360, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(380, lon, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(len, 510, 5, 5);
        ui.ellipse(480, lon, 5, 5);

        ui.ellipse(250, lon, 5, 5);
        ui.ellipse(260, lon, 5, 5);
        ui.ellipse(len, 430, 5, 5);
        ui.ellipse(len, 440, 5, 5);
        ui.ellipse(len, 450, 5, 5);
        ui.ellipse(len, 460, 5, 5);
        ui.ellipse(len, 470, 5, 5);
        ui.ellipse(len, 480, 5, 5);
        ui.ellipse(len, 490, 5, 5);
        ui.ellipse(len, 400, 5, 5);
        ui.ellipse(len, 410, 5, 5);
        ui.ellipse(len, 420, 5, 5);
        ui.ellipse(len, 430, 5, 5);
        ui.ellipse(len, 440, 5, 5);
        ui.ellipse(len, 450, 5, 5);
        ui.ellipse(len, 460, 5, 5);
        ui.ellipse(400, lon, 5, 5);
        ui.ellipse(len, 480, 5, 5);
        ui.ellipse(lon, 490, 5, 5);
        ui.ellipse(len, 500, 5, 5);
        ui.ellipse(lon, 410, 5, 5);
        ui.ellipse(450, len, 5, 5);
        ui.ellipse(lon, len, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);

        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);
        ui.ellipse(len, lon, 5, 5);

        

    }
}