package chesspattern;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChessPattern {

    
    public static void main(String[] args) {
        int NR, NC;
        NR = 512;
        NC = 1024;
        int [][] m = new int [NR][NC];
        int i, j;
        for(i=0;i<NR;i++)
            for(j=0;j<NC;j++)
                if((i/32+j/32)%2==0)
                    m[i][j]=200;
                else
                    m[i][j] = 70;
            
        BufferedImage img = new BufferedImage(NC,NR,BufferedImage.TYPE_INT_RGB);
        for(i=0;i<NR;i++)
           for(j=0;j<NC;j++)
                {
                    int colore = new Color(m[i][j],m[i][j],m[i][j]).getRGB();
                    img.setRGB(j,i,colore);
                }
            JFrame frame = new JFrame();
            frame.getContentPane().setLayout(new FlowLayout());
            frame.getContentPane().add(new JLabel(new ImageIcon(img)));
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
        
    
    

