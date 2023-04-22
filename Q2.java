import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Q2 extends Applet implements ItemListener {
    Choice Choice;
    
    public void init() {
        
        Choice = new Choice();
        Choice.add("red");
        Choice.add("green");
        Choice.add("blue");
        Choice.add("orange");
        Choice.add("black");
        Choice.add("yellow");
        add(new Label("Choose a color:"));
        add(Choice);
        
        
        Choice.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent e) {
        
        String Name = Choice.getSelectedItem();
        switch (Name) {
            case "red":
                setBackground(Color.RED);
                break;
            case "green":
                setBackground(Color.GREEN);
                break;
            case "blue":
                setBackground(Color.BLUE);
                break;
            case "black":
                setBackground(Color.BLACK);
                break;
            case "orange":
                setBackground(Color.ORANGE);
                break;
            case "yellow":
                setBackground(Color.YELLOW);
                break;    
            default:
                setBackground(Color.WHITE);
        }
    }
}