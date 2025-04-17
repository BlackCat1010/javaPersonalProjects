import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class cookieclickerGUI extends JFrame{
    private final Dimension preferredDimension = new Dimension(300,600);

    public Dimension getpreferredDimension(){
        return this.preferredDimension;
    }

    public cookieclickerGUI(){
        super("Cookie Cutter"); 

        setPreferredSize(preferredDimension);
        setSize(preferredDimension);
        setLocationRelativeTo(null);
        setLayout(null);

        addcookieclickerComponents();

    }

    private void addcookieclickerComponents(){
        //clickCounter clickCounter = new clickCounter();
        CookiePanel cookieimg = new CookiePanel(this);
        super.add(cookieimg);

        clickCounterLabel clickCounterLabel = new clickCounterLabel();
        clickCounterLabel.setBounds(0,500,200,100);
        clickCounterLabel.setFont(new Font("Serif", Font.BOLD, 20));
        super.add(clickCounterLabel);

        cookieimg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(e.getActionCommand());
                System.out.println("Click detected");
                clickCounterLabel.setclick();
                System.out.println("Clicks now: "+ clickCounterLabel.getclickText());
                clickCounterLabel.setText(clickCounterLabel.setclickText(clickCounterLabel.getclick()));
            }
        }
    );



    }

}