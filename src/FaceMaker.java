import g4p_controls.*;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import processing.core.PApplet;

public class FaceMaker extends PApplet {
    Face f;
    GButton button1;
    GButton button2;
    GButton button3;
    GButton button4;
    float x,y;
    float size, mood;

    
    public void setup(){
        setSize(400,400);
        background(255);
        f = new Face(this,200,200);
        button1 = new GButton(this,22,20,80,30);
        button1.setText("Move Face");
        button2 = new GButton(this,119,20,80,30);
        button2.setText("Resize Face");
        button3 = new GButton(this,217,20,80,30);
        button3.setText("Change Color");
        button4 = new GButton(this,311,20,80,30);
        button4.setText("Set Mood");
    }
      public void handleButtonEvents(GButton button, GEvent event){
        if(button==button1){
            while(true){
            //ask for new x-y location
            x = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new x:"));
            y = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter new y:"));
                if(x<=400 && x>=0 && y<=400 && y>=0)break; //don't want it off the screen
            }
            //move to new x-y location
            f.erase();//erase face in current state
            f.move(x,y);
        }
        // get the user to enter a 1 or 2 and use it to set the mood
                else if(button==button4){
                  
                    while(true){
                
                mood = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter a 1 for a happy face or a 2 for a sad face"));
                if(mood ==1 || mood == 2)break;
            }
            f.setThemood(mood); 
                    
                    
                  
            
        }
                // change the color of the fase using a Jcolor chooser  
                else if(button==button3){
            Color changedColour = JColorChooser.showDialog(this, "Choose a new colour to change the face too", Color.RED);
            f.erase();
            f.setThecolour(changedColour);
        }
            else if(button==button2)
        //let the user change the size of the dface 
        {
            while(true){
            size = Float.parseFloat(JOptionPane.showInputDialog(this, "Enter a new size for the face thats greater than 0 and less than 500"));
            if(size>0 && size<=500)break; 
            }
            f.erase();
	    f.changeSize(size);            
	    f.draw();     
        }
      }
      //finally draw the new face 
       public void draw()
       {
        f.draw();
       }
}

      