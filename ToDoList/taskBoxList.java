
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class taskBoxList extends JPanel{

    public taskBoxList(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));//BoxLayout.PAGE_AXIS
        setSize(300, 400);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(Box.createRigidArea(new Dimension(5,0)));
        addTaskBox();
        setVisible(true);
    }

    public final void addTaskBox(){
        super.add(new taskBox());
        
    }


}
