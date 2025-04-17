import javax.swing.JLabel;

public final class clickCounterLabel extends JLabel{
    private int clickcounter = 0;
    public String clicktext;

    public clickCounterLabel(){
        clicktext = this.setclickText(clickcounter);
        setText(clicktext);
    }

    public int getclick(){
        return clickcounter;
    }

    public int setclick(){
        clickcounter++;
        System.out.println("Inner Class counter: "+clickcounter);
        return clickcounter;
    }

    public String setclickText(int i){
        return "Click Counter: "+String.valueOf(i);
    }

    public String getclickText(){
        return this.clicktext;
    }
}
