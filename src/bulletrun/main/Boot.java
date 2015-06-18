/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bulletrun.main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;


public class Boot {

   public Boot(){
   
       Display.setTitle("Bullet Runner");
       try {
           Display.setDisplayMode(new DisplayMode(680, 400));
           Display.create();
           
       } catch (LWJGLException ex) {
       }
       
       glMatrixMode(GL_PROJECTION);
       glLoadIdentity();
       glOrtho(0,680, 400, 0, 1, -1);
       glMatrixMode(GL_MODELVIEW);
       
       while(!Display.isCloseRequested()){
       
           Display.update();
           Display.sync(60);
       
       }
       
       Display.destroy();
   
   }
    public static void main(String[] args) {
        new Boot();
    }
    
}
