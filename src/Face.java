import java.awt.Color;
import processing.core.PApplet;

public class Face {
    private float xPosition, yPosition, radius;
    private Color color;
    
    private PApplet pen;
    
    public Face(PApplet p, float x, float y)
    {
        xPosition = x;
        yPosition = y;
        radius = 100;
        color = Color.red;
        pen=p;
        int mood = 0;
    }
public void draw()
{
    pen.stroke(0);
    pen.fill(color.getRed(), color.getGreen(), color.getBlue());
    drawCircle (xPosition,yPosition,radius,radius);//head
    //yellow eyes
    pen.fill(255,255,0);
      drawCircle(xPosition-radius/5, yPosition-radius/5, radius/4, radius/4);
        drawCircle(xPosition+radius/5, yPosition-radius/5, radius/4, radius/4);
        int mood = 0;
        if(mood == 1)
        {
            //mouth - line across and 2 lines pointing up
            drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition+.20*radius, yPosition+.3*radius);
            drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition-.25*radius, yPosition+.2*radius);
            drawLine(xPosition+.2*radius, yPosition+.3*radius, xPosition+.25*radius, yPosition+.2*radius);
        }
        else if (mood == 2)
        {
            drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition+.20*radius, yPosition+.3*radius);
            drawLine(xPosition-.2*radius, yPosition+.3*radius, xPosition-.25*radius, yPosition+.4*radius);
            drawLine(xPosition+.2*radius, yPosition+.3*radius, xPosition+.25*radius, yPosition+.4*radius);
        }
 //private helper methods
    private void drawCircle(float x, float y, float wid, float ht){
        pen.ellipse(x,y,wid,ht);
    }
    
    private void drawLine(double x1, double y1, double x2, double y2){
        pen.line((float)x1,(float)y1,(float)x2,(float)y2);
    }
    
    public void erase()
    {
        pen.fill(255);
        pen.noStroke();
        pen.ellipse(xPosition, yPosition, radius+5, radius+5);
    }
    public void move(float x, float y)
    {
        xPosition = x;yPosition=y;
    }
    public void changeSize(float changedSize)
    {
        radius = changedSize;
    }
    public void setThemood (float changedMood)
    {
        float mood = changedMood;
    }
    public void setThecolour(changedColour)
    {
        color = changedColour;
    }
}
