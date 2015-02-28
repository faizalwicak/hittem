
import java.io.IOException;
import java.util.Random;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.lcdui.game.TiledLayer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xpresi
 */
public class gameplay extends GameCanvas implements Runnable{

    main m;
    Sprite sp_player,sp_tembok_kiri[]=new Sprite[3],sp_tembok_kanan[]=new Sprite[3];
    GameDesign gd;
    TiledLayer background, as,as1;
    LayerManager lm;
    Graphics g= this.getGraphics();
    boolean play=false, pause=false;
    Thread th=new Thread(this);
    Random r=new Random();
    int gravitasi;
    int nilai=0;
    
    public gameplay(main m){
        super(false);
        this.m=m;
        this.setFullScreenMode(true);
        init();
    }
    private void init(){
        gd=new GameDesign();
        try {
            lm=new LayerManager();
            sp_player= gd.getPlayer();
            background= gd.getBgmenu();
            as=gd.getAs();
            as1=gd.getAs1();
            
            as1.setPosition(this.getWidth()-as1.getWidth(), 0);
            for(int i=0; i<3;i++){
                int x= getRandomNumber(this.getWidth()-60);
            int y= this.getHeight()+120*i;
                sp_tembok_kiri[i]= new Sprite(gd.getSp_tembok());
                sp_tembok_kanan[i]= new Sprite(gd.getSp_tembok());
                acak(i, x, y);
                lm.append(sp_tembok_kiri[i]);
                lm.append(sp_tembok_kanan[i]);
            }
            lm.append(sp_player); 
            lm.append(as1);
            sp_player.setPosition(this.getWidth()/2-sp_player.getWidth()/2, 20);
            gd.updateLayerManagerForPlay(lm);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void run() {
        while(play==true){
            content(g);
            this.flushGraphics();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }   
    }
    private void content(Graphics g){
        if(sp_player.getX()<=this.getWidth()/2-sp_player.getWidth()/2)gravitasi=-2;
        else gravitasi=2;
        lm.paint(g, 0, 0);
        sp_player.nextFrame();
        for(int i=0; i<3;i++){
            sp_tembok_kiri[i].move(0, -3);
            sp_tembok_kanan[i].move(0, -3);
            if(sp_tembok_kiri[i].getY()<0){
                int x= getRandomNumber(this.getWidth()-60);
                int y= sp_tembok_kiri[ulang(i)].getY()+120;
                acak(i, x, y);
                nilai+=1;
            }
        }
        input();
        kena();
        if(sp_player.getX()<this.getWidth()-sp_player.getWidth()&&sp_player.getX()>0)sp_player.move(gravitasi, 0);
        g.setColor(225, 0, 0);
        g.setFont(Font.getFont(Font.FACE_MONOSPACE, Font.STYLE_BOLD, Font.SIZE_MEDIUM));
        g.drawString("Nilai = "+nilai, 0, 0, Graphics.LEFT|Graphics.TOP);
    }
    public void StartGame(){
        th.start();
        play=true;
    }
    public int getRandomNumber(int maks){
        int a = r.nextInt()%maks;
        if(a<0)a*=-1;
        return a;
    }
    public void acak(int i, int x, int y){
            sp_tembok_kiri[i].setPosition(x-sp_tembok_kiri[i].getWidth(), y);
            sp_tembok_kiri[i].setFrame(0);
            sp_tembok_kanan[i].setPosition(x+60, y);
            sp_tembok_kanan[i].setFrame(0);
        
    }
    private int ulang(int i){
        int a = 0;
        if(i==0)a=2;
        else if(i==1)a=0;
        else if(i==2)a=1;
        return a;
    }
    protected void input(){
        int keyCode=this.getKeyStates();
        if(keyCode==32){//kanan
            if(sp_player.getX()<this.getWidth()-sp_player.getWidth()){
                sp_player.move(5, 0);
            }
        }
        if(keyCode==4){//kiri
            if(sp_player.getX()>0){
               sp_player.move(-5, 0);
            }
        }
        System.out.println(keyCode);
    }
    private void kena(){
        for(int i=0; i<3;i++){
            if(sp_player.collidesWith(sp_tembok_kiri[i], true)||sp_player.collidesWith(sp_tembok_kanan[i],true)){  
                m.playmenu();
                play=false;
            }
        }
    }
}