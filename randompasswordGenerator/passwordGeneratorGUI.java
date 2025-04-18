
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class passwordGeneratorGUI extends JFrame{
    private final int buttonwidth=130;
    private final int buttonheight =40;

    public passwordGeneratorGUI() {
        super();
        //JFrame.setDefaultLookAndFeelDecorated(true);
        setTitle("password Generator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setBounds(500,500,300,300);
        setLayout(null);

        

        JLabel header = new JLabel("Password Generator");
        header.setBounds(0,0,getWidth(),15);
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 15));
        add(header);

        JTextArea PasswordOutputField = new JTextArea();
        PasswordOutputField.setBounds(0,header.getHeight(),getWidth(),30);
        PasswordOutputField.setBorder(new LineBorder(Color.BLACK, 2));
        
        add(PasswordOutputField);
        addButtons(PasswordOutputField);
        

    }

    public void addButtons(JTextArea PasswordOutputField) {
        int startingx = 10;
        int startingy = getHeight()/3;
        
        JToggleButton UppercaseToggle = new JToggleButton("Uppercase");
        System.out.println(UppercaseToggle.isSelected());
        UppercaseToggle.setBounds(startingx,startingy,buttonwidth,buttonheight);
        add(UppercaseToggle);

        JToggleButton LowercaseToggle = new JToggleButton("Lowercase");
        LowercaseToggle.setBounds(startingx+buttonwidth, startingy, buttonwidth,buttonheight);
        add(LowercaseToggle);

        JToggleButton SymbolsToggle = new JToggleButton("Symbols");
        SymbolsToggle.setBounds(startingx, startingy+buttonheight, buttonwidth,buttonheight);
        add(SymbolsToggle);

        JToggleButton NumbersToggle = new JToggleButton("Numbers");
        NumbersToggle.setBounds(startingx+buttonwidth, startingy+buttonheight, buttonwidth,buttonheight);
        add(NumbersToggle);

        //throw new UnsupportedOperationException("Not supported yet.");
        JButton GeneratePasswordButton = new JButton("Generate");
        GeneratePasswordButton.setBounds(startingx+buttonwidth/2,startingy+buttonheight+buttonheight,buttonwidth,buttonheight);


        add(GeneratePasswordButton);

        GeneratePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String newpwtext;
                if (UppercaseToggle.isSelected()==false && LowercaseToggle.isSelected()==false && SymbolsToggle.isSelected()==false && NumbersToggle.isSelected()==false){
                    PasswordOutputField.setText("");
                    System.out.println("User entered no conditions");
                    return;
                }
                randomTextGenerator newpw = new randomTextGenerator(12,UppercaseToggle.isSelected(),LowercaseToggle.isSelected(),SymbolsToggle.isSelected(),NumbersToggle.isSelected());
                newpwtext = newpw.getnewpassword();
                PasswordOutputField.setText(newpwtext);

            }

        });


    }

}
