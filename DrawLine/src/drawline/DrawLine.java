package drawline;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;


public class DrawLine {
    
    static int approximation(double n){
        if ((double)(n-(int)n)>0.5)
            return (int)(n)+1;
        else
            return (int)(n);
    }
    
    static void Draw_line(int x1, int y1, int x2, int y2, int[][] matrix){
        if (!(x1==x2)){
            double x,y,m,q;
            m = (double)(y2-y1)/(x2-x1);
            q = (double)(y1-m*x1);
            if (x1<=x2)
                for (x=x1;x<=x2;x++){
                    y=m*x+q;
                    matrix[approximation(y)][approximation(x)]=255;
                }
            else
                for (x=x2;x<=x1;x++){
                    y=m*x+q;
                    matrix[approximation(y)][approximation(x)] = 255;
                }
        }else{
            if (y1<=y2)
                for (int y=(int)y1;y<=(int)y2;y++)
                    matrix[y][(int)x1] = 255;
            else
                for (int y=(int)y2;y<=(int)y1;y++)
                    matrix[y][(int)x1] = 255;
        }
        int NC = matrix[0].length;
        int NR = matrix.length;
        BufferedImage img = new BufferedImage(NC,NR,BufferedImage.TYPE_INT_RGB);
        for (int i=0;i<NR;i++)
            for (int j=0;j<NC;j++){
                NC = matrix[i].length;
                int colore = new Color(matrix[i][j],matrix[i][j],matrix[i][j]).getRGB();
                img.setRGB(j, i, colore);
        }
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(img)));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x1, y1, x2, y2;
        int NR, NC;
        do{
            System.out.print("Larghezza schermo:  ");
            NC = input.nextInt();
        }while(NC<=0);
        do{
            System.out.print("Altezza schermo:  ");
            NR = input.nextInt();
        }while(NR<=0);
        do{
            System.out.print("Coordinata x di partenza:  ");
            x1 = input.nextInt();
        }while(x1<0 || x1>=NC);
        do{
            System.out.print("Coordinata y di partenza:  ");
            y1 = input.nextInt();
        }while(y1<0 || y1>=NR);
        do{
            System.out.print("Coordinata x di arrivo:  ");
            x2 = input.nextInt();
        }while(x2<0 || x2>=NC);
        do{
            System.out.print("Coordinata y di arrivo:  ");
            y2 = input.nextInt();
        }while(y2<0 || y2>=NR);
        int [][] m = new int [NR][NC];
        Draw_line(x1,y1,x2,y2,m);
    }
    
}
