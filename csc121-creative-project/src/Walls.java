import processing.core.PApplet;
import java.util.*;

class Wall {
    float x;
    float openingY;
    float wallWidth;
    float wallHeight;
    float speed;

    public Wall(float x, float openingY, float wallWidth, float wallHeight, float speed) {
        this.x = x;
        this.openingY = openingY;
        this.wallWidth = wallWidth;
        this.wallHeight = wallHeight;
        this.speed = speed;
    }

    /*
     * Draws the walls
     */
    public void draw(PApplet p) {
        p.fill(20, 143, 119); 																// Set the color of the walls
        p.noStroke();
        p.rect(x, 0, wallWidth, openingY, 15); 												// Upper wall
        p.rect(x, 600, wallWidth, p.height - openingY - wallHeight, 10); 					// Lower wall
    }

    /*
     * Moves the walls
     */
    public void move() {
        x -= speed;
    }

    /*
     * Checks if walls are off screen
     */
    public boolean isOffScreen() {
        return x + wallWidth <= 0;								// If x + wallWidth is less than 0, returns true
    }
}