
import java.awt.*;
import javax.swing.*;

// create a rectangular panel that you can draw on.
class MyPanel extends JPanel {

  public static JFrame edit(MyPanel panel, int xy, String name){
    // create a basic JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame(name);
    frame.setSize(xy,xy);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // add panel to main frame
    frame.add(panel);
    frame.setVisible(true);
    return frame;
    }

  public void paint(Graphics g){
      for (int i = 0; i < App.values.length-1; i++){
        if (App.values[i] > 0) {
        for(int j = 1; j<=App.values[i];j++){
          if (j%3 == 1){
          Color color = new Color(i*2,i,i);
          g.setColor(color);
          g.fillRect(i,i,j,j);
          } else if (j%3 == 2){
            Color color = new Color(i,i*2,i);
          g.setColor(color);
          g.fillRect(i,i,j,j);
          } else {
          Color color = new Color(i,i,i*2);
          g.setColor(color);
          g.fillRect(i,i,j,j);
          }
        }
        }
      }
  }

}

//creates a 3d rectangular panel
class My3Rectangle extends JPanel {

  public static JFrame edit(My3Rectangle panel, int xy, String name){
    // create a basic JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame(name);
    frame.setSize(xy,xy);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // add panel to main frame
    frame.add(panel);
    frame.setVisible(true);
    return frame;
    }

    public void paint(Graphics g){
      for (int i = 0; i < App.values.length-1; i++){
        if (App.values[i] > 0) {
        for(int j = 1; j<=App.values[i];j++){
          if (j%3 == 1){
          Color color = new Color(i*2,i,i);
          g.setColor(color);
          g.fillRect(i,i,j,j);
          } else if (j%3 == 2){
            Color color = new Color(i,i*2,i);
          g.setColor(color);
          g.fillRect(i,i,j,j);
          } else {
          Color color = new Color(i,i,i*2);
          g.setColor(color);
          g.fillRect(i,i,j,j);
          }
        }
        }
      }
  }
}//end of class
