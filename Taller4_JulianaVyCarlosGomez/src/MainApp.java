import processing.core.PApplet;

public class MainApp extends PApplet {
	Logica log;
   public void setup(){
	   size(1200,700);
	   log= new Logica(this);
	   imageMode(CENTER);
   }
   
   public void draw(){
	   background(255);
	   log.pintar(mouseX,mouseY);
   }
   
   
   public void mousePressed(){
	   log.press(mouseX, mouseY);
   }
   
   public void mouseReleased(){
	   log.releassed();
   }
   
public void mouseDragged(){
	log.dragged(mouseX, mouseY);
}
	
	
	
	
	
	
	
}
