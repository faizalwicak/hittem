/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.*;
import java.io.IOException;

/**
 * @author Xpresi
 */
public class GameDesign {
    
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private TiledLayer bgmenu;
    private Image menu;
    private Sprite sprite_menu;
    public int activeDelay = 200;
    public int[] active = {0, 1};
    private Image platform_tiles;
    private TiledLayer as1;
    private Image tembok;
    private TiledLayer bg_tembok;
    private Sprite sp_tembok;
    public int sp_tembokseq002Delay = 200;
    public int[] sp_tembokseq002 = {0};
    private Image gbtembok;
    private Image pemain;
    private TiledLayer as;
    private Image topview_tiles;
    private Sprite player;
    public int playerseq001Delay = 300;
    public int[] playerseq001 = {0, 1, 2, 3};
//</editor-fold>//GEN-END:|fields|0|
    
//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

    public Image getMenu() throws java.io.IOException {//GEN-BEGIN:|1-getter|0|1-preInit
        if (menu == null) {//GEN-END:|1-getter|0|1-preInit
            // write pre-init user code here
            menu = Image.createImage("/images/menu.png");//GEN-BEGIN:|1-getter|1|1-postInit
        }//GEN-END:|1-getter|1|1-postInit
        // write post-init user code here
        return this.menu;//GEN-BEGIN:|1-getter|2|
    }//GEN-END:|1-getter|2|

    public Sprite getSprite_menu() throws java.io.IOException {//GEN-BEGIN:|2-getter|0|2-preInit
        if (sprite_menu == null) {//GEN-END:|2-getter|0|2-preInit
            // write pre-init user code here
            sprite_menu = new Sprite(getMenu(), 88, 28);//GEN-BEGIN:|2-getter|1|2-postInit
            sprite_menu.setFrameSequence(active);//GEN-END:|2-getter|1|2-postInit
            // write post-init user code here
        }//GEN-BEGIN:|2-getter|2|
        return sprite_menu;
    }//GEN-END:|2-getter|2|

    public Image getPlatform_tiles() throws java.io.IOException {//GEN-BEGIN:|4-getter|0|4-preInit
        if (platform_tiles == null) {//GEN-END:|4-getter|0|4-preInit
            // write pre-init user code here
            platform_tiles = Image.createImage("/topview_tiles.png");//GEN-BEGIN:|4-getter|1|4-postInit
        }//GEN-END:|4-getter|1|4-postInit
        // write post-init user code here
        return this.platform_tiles;//GEN-BEGIN:|4-getter|2|
    }//GEN-END:|4-getter|2|







    public void updateLayerManagerForScene_menu(LayerManager lm) throws java.io.IOException {//GEN-LINE:|20-updateLayerManager|0|20-preUpdate
        // write pre-update user code here
        getBgmenu().setPosition(0, 0);//GEN-BEGIN:|20-updateLayerManager|1|20-postUpdate
        getBgmenu().setVisible(true);
        lm.append(getBgmenu());//GEN-END:|20-updateLayerManager|1|20-postUpdate
        // write post-update user code here
    }//GEN-LINE:|20-updateLayerManager|2|

    public Image getPemain() throws java.io.IOException {//GEN-BEGIN:|25-getter|0|25-preInit
        if (pemain == null) {//GEN-END:|25-getter|0|25-preInit
            // write pre-init user code here
            pemain = Image.createImage("/images/pemain.png");//GEN-BEGIN:|25-getter|1|25-postInit
        }//GEN-END:|25-getter|1|25-postInit
        // write post-init user code here
        return this.pemain;//GEN-BEGIN:|25-getter|2|
    }//GEN-END:|25-getter|2|

    public Sprite getPlayer() throws java.io.IOException {//GEN-BEGIN:|26-getter|0|26-preInit
        if (player == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            player = new Sprite(getPemain(), 40, 40);//GEN-BEGIN:|26-getter|1|26-postInit
            player.setFrameSequence(playerseq001);//GEN-END:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return player;
    }//GEN-END:|26-getter|2|



    public Image getTembok() throws java.io.IOException {//GEN-BEGIN:|49-getter|0|49-preInit
        if (tembok == null) {//GEN-END:|49-getter|0|49-preInit
            // write pre-init user code here
            tembok = Image.createImage("/images/tembok.png");//GEN-BEGIN:|49-getter|1|49-postInit
        }//GEN-END:|49-getter|1|49-postInit
        // write post-init user code here
        return this.tembok;//GEN-BEGIN:|49-getter|2|
    }//GEN-END:|49-getter|2|

    public Image getGbtembok() throws java.io.IOException {//GEN-BEGIN:|52-getter|0|52-preInit
        if (gbtembok == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            gbtembok = Image.createImage("/images/gbtembok.png");//GEN-BEGIN:|52-getter|1|52-postInit
        }//GEN-END:|52-getter|1|52-postInit
        // write post-init user code here
        return this.gbtembok;//GEN-BEGIN:|52-getter|2|
    }//GEN-END:|52-getter|2|

    public Sprite getSp_tembok() throws java.io.IOException {//GEN-BEGIN:|53-getter|0|53-preInit
        if (sp_tembok == null) {//GEN-END:|53-getter|0|53-preInit
            // write pre-init user code here
            sp_tembok = new Sprite(getGbtembok(), 110, 30);//GEN-BEGIN:|53-getter|1|53-postInit
            sp_tembok.setFrameSequence(sp_tembokseq002);//GEN-END:|53-getter|1|53-postInit
            // write post-init user code here
        }//GEN-BEGIN:|53-getter|2|
        return sp_tembok;
    }//GEN-END:|53-getter|2|

    public TiledLayer getBg_tembok() throws java.io.IOException {//GEN-BEGIN:|55-getter|0|55-preInit
        if (bg_tembok == null) {//GEN-END:|55-getter|0|55-preInit
            // write pre-init user code here
            bg_tembok = new TiledLayer(1, 1, getGbtembok(), 110, 30);//GEN-BEGIN:|55-getter|1|55-midInit
            int[][] tiles = {
                {1}
            };//GEN-END:|55-getter|1|55-midInit
            // write mid-init user code here
            for (int row = 0; row < 1; row++) {//GEN-BEGIN:|55-getter|2|55-postInit
                for (int col = 0; col < 1; col++) {
                    bg_tembok.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|55-getter|2|55-postInit
        // write post-init user code here
        return bg_tembok;//GEN-BEGIN:|55-getter|3|
    }//GEN-END:|55-getter|3|

    public Image getTopview_tiles() throws java.io.IOException {//GEN-BEGIN:|57-getter|0|57-preInit
        if (topview_tiles == null) {//GEN-END:|57-getter|0|57-preInit
            // write pre-init user code here
            topview_tiles = Image.createImage("/topview_tiles.png");//GEN-BEGIN:|57-getter|1|57-postInit
        }//GEN-END:|57-getter|1|57-postInit
        // write post-init user code here
        return this.topview_tiles;//GEN-BEGIN:|57-getter|2|
    }//GEN-END:|57-getter|2|

    public TiledLayer getAs() throws java.io.IOException {//GEN-BEGIN:|58-getter|0|58-preInit
        if (as == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            as = new TiledLayer(2, 20, getTopview_tiles(), 16, 16);//GEN-BEGIN:|58-getter|1|58-midInit
            int[][] tiles = {
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7},
                {16, 7}
            };//GEN-END:|58-getter|1|58-midInit
            // write mid-init user code here
            for (int row = 0; row < 20; row++) {//GEN-BEGIN:|58-getter|2|58-postInit
                for (int col = 0; col < 2; col++) {
                    as.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|58-getter|2|58-postInit
        // write post-init user code here
        return as;//GEN-BEGIN:|58-getter|3|
    }//GEN-END:|58-getter|3|

    public TiledLayer getBgmenu() throws java.io.IOException {//GEN-BEGIN:|69-getter|0|69-preInit
        if (bgmenu == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            bgmenu = new TiledLayer(21, 20, getTopview_tiles(), 16, 16);//GEN-BEGIN:|69-getter|1|69-midInit
            int[][] tiles = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            };//GEN-END:|69-getter|1|69-midInit
            // write mid-init user code here
            for (int row = 0; row < 20; row++) {//GEN-BEGIN:|69-getter|2|69-postInit
                for (int col = 0; col < 21; col++) {
                    bgmenu.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|69-getter|2|69-postInit
        // write post-init user code here
        return bgmenu;//GEN-BEGIN:|69-getter|3|
    }//GEN-END:|69-getter|3|

    public void updateLayerManagerForPlay(LayerManager lm) throws java.io.IOException {//GEN-LINE:|76-updateLayerManager|0|76-preUpdate
        // write pre-update user code here
        getAs().setPosition(0, 0);//GEN-BEGIN:|76-updateLayerManager|1|76-postUpdate
        getAs().setVisible(true);
        lm.append(getAs());
        getBgmenu().setPosition(0, 0);
        getBgmenu().setVisible(true);
        lm.append(getBgmenu());//GEN-END:|76-updateLayerManager|1|76-postUpdate
        // write post-update user code here
    }//GEN-LINE:|76-updateLayerManager|2|

    public TiledLayer getAs1() throws java.io.IOException {//GEN-BEGIN:|97-getter|0|97-preInit
        if (as1 == null) {//GEN-END:|97-getter|0|97-preInit
            // write pre-init user code here
            as1 = new TiledLayer(2, 20, getTopview_tiles(), 16, 16);//GEN-BEGIN:|97-getter|1|97-midInit
            int[][] tiles = {
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16},
                {5, 16}
            };//GEN-END:|97-getter|1|97-midInit
            // write mid-init user code here
            for (int row = 0; row < 20; row++) {//GEN-BEGIN:|97-getter|2|97-postInit
                for (int col = 0; col < 2; col++) {
                    as1.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|97-getter|2|97-postInit
        // write post-init user code here
        return as1;//GEN-BEGIN:|97-getter|3|
    }//GEN-END:|97-getter|3|
    
}
