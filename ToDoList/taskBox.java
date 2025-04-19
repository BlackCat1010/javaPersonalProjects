import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class taskBox extends JPanel{
    JPanel TaskBox;
    JButton taskDelButton;
    JTextArea taskText;

    public taskBox(){
    setLayout(new FlowLayout());
    setSize(300, 100);
    setBorder(BorderFactory.createLineBorder(Color.BLACK));
    setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

    //Set Components inside TaskBox
    taskText = new JTextArea("<Placeholder>");
    taskDelButton = new JButton("X");

    add(taskText);
    add(taskDelButton);

    taskDelButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            try {
                Container parent = taskBox.this.getParent(); //Important lesson that underthehood, any runtime-relationship is established, so .getParent() can be used to obtain and navigate upwards in hierachy
                //System.out.println("Parent: "+parent);
                parent.remove(taskBox.this);
                parent.revalidate();
                parent.repaint();
            } catch (Exception err) {
                err.printStackTrace();
            }  
        }
    }
);
    }
}
