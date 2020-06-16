package mousetracer;

import java.awt.MouseInfo;
import javax.swing.*;

public class MouseTracer {

    static JFrame f = new JFrame("Mouse Tracer");
    static JLabel label = new JLabel();
    
    public static void trace_mouse(){
        while(true){
            int x = f.getX();
            int y = f.getY();
            int h = f.getHeight();
            int w = f.getWidth();
            int pos_x = (int) MouseInfo.getPointerInfo().getLocation().getX();
            int pos_y = (int) MouseInfo.getPointerInfo().getLocation().getY();
            if ((pos_x>=x && pos_x<=x+w) && (pos_y>=y && pos_y<=y+h)){
                pos_x -= x;
                pos_y -= y;
                label.setText("X: "+pos_x+" Y: "+pos_y);
            }   
        }
    }

    public static void main(String[] args) {
        f.setBounds(10,10,500,500);
        f.setLayout(null);
        f.setVisible(true);
        label.setBounds(0,0,200,200);
        f.add(label);
        f.setDefaultCloseOperation(3);
        
        trace_mouse();
        
    }
    
}
