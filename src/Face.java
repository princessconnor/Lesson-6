import java.awt.Color;
import processing.core.PApplet;

public class Face {
    private float xPosition, yPosition, radius;
    private Color color;
    
    private PApplet pen;
    
    public Face(PApplet p, float x, float y){
        xPosition = x;
        yPosition = y;
        radius = 100;
        color = Color.red;
        pen=p;
    }
public void draw()
{
    pen.stroke(0);
    pen.fill(color.getRed(), color.getGreen(), color.getBlue());
    
}


}
