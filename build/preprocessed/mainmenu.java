
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.lcdui.game.TiledLayer;

public class mainmenu extends GameCanvas implements Runnable{

    Graphics g=this.getGraphics();
    main m;
    TiledLayer bgmenu;
    GameDesign gd;
    Sprite sprite_menu[];
    LayerManager lm;
    int num_menu=0;
    String textmenu[]={"Play","About","Exit"};
    
    public mainmenu(main m){
        super(false);
        this.m=m;
        this.setFullScreenMode(true);
        gd=new GameDesign();
        sprite_menu=new Sprite[textmenu.length];
        try {
            lm=new LayerManager();
            bgmenu=gd.getBgmenu();   
            for(int i=0; i<textmenu.length;i++){
                sprite_menu[i]=new Sprite(gd.getSprite_menu());
                lm.append(sprite_menu[i]);
                sprite_menu[i].setPosition((this.getWidth()/2)-44, (30+(60*i)));
            }
            gd.updateLayerManagerForScene_menu(lm);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        new Thread(this).start();
    }
    
    public void run() {
        while(true){
            content(g);
            this.flushGraphics();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void content(Graphics g) {
        lm.paint(g, 0, 0);
        for(int i=0;i<textmenu.length;i++){
            if(num_menu==i){
                    sprite_menu[i].setFrame(0);
                }else{
                    sprite_menu[i].setFrame(1);
                }
            g.drawString(textmenu[i], (sprite_menu[i].getX()+(sprite_menu[i].getWidth()/2))-textmenu[i].length()*2, 35+60*i, 0);
        }
    }
    
    protected void keyPressed(int keyCode){
        if(keyCode==-1||keyCode==50){
            if(num_menu>0){
                num_menu--;
            }
            else{
                num_menu=textmenu.length-1;
            }
        }
        if(keyCode==-2||keyCode==56){
            if(num_menu<textmenu.length-1){
                num_menu++;
            }
            else{
                num_menu=0;
            }
        }
        if(keyCode==-5||keyCode==53){
            switch(num_menu){
                case 0:
                    m.playgame();
                    break;
                case 1:
                    m.playabout();
                    break;
                //case 2:
                    //break;
                case 2:
                    m.destroyApp(true);
                    break;
            }
        }
        System.out.println(keyCode);
    }
}