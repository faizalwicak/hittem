
import javax.microedition.lcdui.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xpresi
 */
public class about extends Canvas implements CommandListener{

    main m;
    Command back;
    
    public about(main m){
        this.m=m;
        this.setFullScreenMode(true);
        back=new Command("Back", Command.OK, 1);
        this.addCommand(back);
        this.setCommandListener(this);
    }
    
    protected void paint(Graphics g) {
        g.setColor(0, 0, 0);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(255, 0, 0);
        g.setFont(Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_BOLD, Font.SIZE_LARGE));
        g.drawString("Creat By", 10, 10, 0);
        g.drawString("FW-Indonesia.blogspot.com", 10, 30, 0);
    }

    public void commandAction(Command c, Displayable d) {
        if(c==back)m.playmenu();
    }
    
}
