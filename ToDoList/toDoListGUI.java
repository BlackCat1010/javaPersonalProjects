
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class toDoListGUI extends JFrame{
    private final Dimension defaultToDoListDimension = new Dimension(500,500);


    public toDoListGUI(){
        super("toDoList");
        setSize(defaultToDoListDimension);
        setPreferredSize(defaultToDoListDimension);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Adding Title
        JLabel title = new JLabel("TO-DO-LIST",SwingConstants.CENTER);
        title.setFont(new Font(getName(),Font.BOLD, 20));
        add(title);

        //Adding TaskBoxList
        taskBoxList TaskBoxListInstance =  new taskBoxList();
        add(TaskBoxListInstance);
        
        
        //Adding Add Task button which triggers add Task
        JButton addTaskButton = new JButton("ADD TASK");
        addTaskButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    TaskBoxListInstance.addTaskBox();
                    TaskBoxListInstance.revalidate();
                    TaskBoxListInstance.repaint();
                    System.out.println("Adding TaskBox");
                } catch (Exception err) {
                    err.printStackTrace();
                }
                
            }
        });
        add(addTaskButton);
        pack();
        

    }

}
