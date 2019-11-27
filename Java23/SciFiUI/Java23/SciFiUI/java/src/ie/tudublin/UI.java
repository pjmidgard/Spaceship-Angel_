package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import ddf.minim.AudioInput;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;


public class UI extends PApplet {

    ArrayList<Product> products = new ArrayList<Product>();

    MovingCircle mc;
    stars star;

    boolean[] keys = new boolean[1024];

    public void keyPressed() {
        keys[keyCode] = true;
    }

    public void keyReleased() {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c) {
        return keys[c] || keys[Character.toUpperCase(c)];
    }

    public void settings() {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        // fullScreen(P3D);
		
		minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO, FRAME_SIZE, SAMPLE_RATE, BITS_PER_SAMPLE);
        fft = new FFT(FRAME_SIZE, SAMPLE_RATE);
        
    }

    public void setup() {

        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        star = new stars(this, 0, 0);

      
    }

    Radar radar;

    void loadProducts() {
        Table table = loadTable("fly.csv", "header");
        for (TableRow tr : table.rows()) {
            Product p = new Product(tr);
            products.add(p);
        }
    }

    public void mouseClicked() {
        int which = -1;

        // The best way!!
        if ((mouseX > border && mouseX < border + buttonWidth)) {
            if ((mouseY - border) % (buttonHeight + gap) < buttonHeight) {
                which = (int) ((mouseY - border) / (buttonHeight + gap));
            }
        }

        // This also works
        /*
         * if (mouseX > border && mouseX < border + buttonWidth) { for(int i = 0 ; i <
         * products.size() ; i ++) { float y = border + (i * (buttonHeight + gap)); if
         * (mouseY > y && mouseY < y + buttonHeight) { which = i; break; } } }
         */
        if (which != -1) {
            System.out.println(products.get(which));
        }
    }

    float border = 20;
    float buttonWidth = 200;
    float buttonHeight = 50;
    float gap = 20;
	
	AudioInput ai;
    FFT fft;
    Minim minim;
    public static final int FRAME_SIZE = 1024;
    public static final int SAMPLE_RATE = 44100;
    public static final int BITS_PER_SAMPLE = 16;

    void drawProductButtons() {

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            float y = border + (i * (buttonHeight + gap));
            float x = border;
            fill(255, 255, 0);
            stroke(0);
            rect(x, y, buttonWidth, buttonHeight);
            textAlign(CENTER, CENTER);
            fill(0);
            text(p.getName(), x + buttonWidth * 0.5f, y + buttonHeight * 0.5f);
        }
    }

    
    public void draw() {
        background(0);

        mc.update();
        mc.render();

        radar.update();
        radar.render();

        star.drawStars();

        loadProducts();

        mouseClicked();

        drawProductButtons();

        if (checkKey('m')) {
          stroke(255);
        float middle = height / 2;
        for (int i = 0; i < ai.bufferSize(); i++) {
            stroke(map(i, 0, ai.bufferSize(), 0, 255), 255, 255);
            line(i, middle, i, middle + ai.left.get(i) * middle);
        }

        fft.forward(ai.left);

        for (int i = 0; i < fft.specSize(); i++) {
            stroke(map(i, 0, ai.bufferSize(), 0, 255), 255, 255);
            line(i, 0, i, fft.getBand(i) * 20);
				}
        }

        if (checkKey('x')) {
            System.exit(0);
        }
    }

}
