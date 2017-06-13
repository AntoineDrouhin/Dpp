package canvas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class TortueImpl extends JComponent implements Tortue {
    
    public final int STARTPOS_X = 0;
    public final int STARTPOS_Y = 0;
    public final int START_ANGLE = 0;
    
    
    private int currentPosX;
    private int currentPosY;
    private int currentAngle;
    
    private List<Instruction> l;
    
    public TortueImpl() {
        this.currentPosX = STARTPOS_X;
        this.currentPosY = STARTPOS_Y;
        this.currentAngle = START_ANGLE;
        
        l = new ArrayList<>();
    }
    
    @Override
    public void avancer(int dist) {
        l.add(new Instruction('a', dist));
    }

    @Override
    public void tourner(int angle) {
        l.add(new Instruction('t', angle));
    }

    private int calculPosX(int dist, int angle) {
        //Rotation du vecteur
        int vectX = dist * (int)Math.cos(angle/180.0 * Math.PI);
        //Faire un vecteur
        return this.currentPosX + vectX;
    }
    
    private int calculPosY(int dist, int angle) {
        int vectY = dist * (int)Math.sin(angle/180.0 * Math.PI);
        return this.currentPosY + vectY;
    }
    
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    // draw entire component white
    g.setColor(Color.white);
    g.fillRect(0, 0, getWidth(), getHeight());

    g.setColor(Color.black);
    
    this.currentPosX = STARTPOS_X;
    this.currentPosY = STARTPOS_Y;
    this.currentAngle = START_ANGLE;
    
    for(Instruction i : l) {
        switch(i.type){
            case 'a': 
                int nextX = calculPosX(i.value, this.currentAngle),
                    nextY = calculPosY(i.value, this.currentAngle);
                g.drawLine(this.currentPosX, this.currentPosY,nextX,nextY);
                currentPosX = nextX;
                currentPosY = nextY;
                break;
            case 't': 
                currentAngle = (currentAngle + i.value) % 360;
        }
    }
     
  }
    
    
  public static void main(String args[]) {
        JFrame mainFrame = new JFrame("Graphics demo");
        mainFrame.getContentPane().add(new TortueImpl());
        mainFrame.pack();
        mainFrame.setSize(500, 500);
        mainFrame.setVisible(true);
    
  }

  public class Instruction {
        public char type;
        public int value;
        
        public Instruction(char t, int v) {
            this.type = t;
            this.value = v;
        }
    }
  public class Position {
      public int x;
      public int y;
      
      public Position(int x, int y){
          this.x = x;
          this.y = y;
      }
  }
}