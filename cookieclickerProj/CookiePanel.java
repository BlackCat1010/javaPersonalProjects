import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CookiePanel extends JButton{
    private Image cookieImage;
    private String cookieimgfilepathStr = ".\\src\\chocolate-chip-cookie.jpg";

    public CookiePanel(cookieclickerGUI cookieclickerGUI){
        this.setSize(cookieclickerGUI.getpreferredDimension().width,cookieclickerGUI.getpreferredDimension().height/3*2);
        this.setBackground(Color.GRAY);
        
        //Reading local stored img file
        try{
            File cookieImagefile = new File(cookieimgfilepathStr);
            cookieImage = ImageIO.read(cookieImagefile);
            }
            catch(IOException e){
                System.out.println("Stacktrace: "+e);
            }
    }
    //To override paintComponent in CookiePanel to paint cookie and let Swing's paintcomponent also run
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (cookieImage!=null){
            System.out.println("Printing");
            g.drawImage(cookieImage,0,0,null);
        }else{
            System.out.println("Image is null");
        }
    }


    

}
