/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author Xpresi
 */
public class main extends MIDlet{

    Display dpl=Display.getDisplay(this);
    mainmenu mm=new mainmenu(this);
    
    public void startApp() {
        
        dpl.setCurrent(mm);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
        this.notifyDestroyed();
    }
    
    public void playgame(){
        gameplay gp;
        gp=new gameplay(this);
        dpl.setCurrent(gp);
        gp.StartGame();
    }
    
    public void playmenu(){
        dpl.setCurrent(mm); 
    }
    public void playabout(){
        about ab=new about(this);
        dpl.setCurrent(ab);
    }
}
