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
        float len = ui.random(0, ui.width = 1000);
        float lon = ui.random(0, ui.height = 1000);
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
        ui.noStroke();

        ui.fill(255, 228, 128);
        ui.rect(0, 0, 200, 800);
        ui.rect(700, 800, 200, -800);
        ui.rect(0, 100, 800, -800);
        ui.rect(0, 700, 800, 100);
    }
}