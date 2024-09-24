import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings() {
        size(800, 600);
    }


    public void setup() {
        background(200, 200, 200); // Light gray color
    }


    public void draw() {
        fill(230, 230, 250); // Set color to lavender
        stroke(255, 165, 0); // Set outline color to black
        strokeWeight(10); // Set outline thickness to 3 pixels
        ellipse(800, 100, 100, 100); // (x, y, width, height)
        noStroke(); // No outline for rectangles
        fill(255, 0, 0); // Set color to red
        rect(50, 50, 200, 150); // Draw rectangle
        fill(30, 4, 50); // Set color to blue
        rect(500, 300, 200, 150); // Draw rectangle

        stroke(0); // Set line color to black
    strokeWeight(2); // Set line thickness
    line(0, 0, 800, 600); // Draw line
    }


    


}
