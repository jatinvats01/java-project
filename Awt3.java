
import java.awt.*;
import java.awt.event.*;

 class ButtonLayout extends Frame {

  private Button northButton, eastButton, westButton, southButton, centerButton;

  public ButtonLayout() {
    setTitle("Button Layout Example");

  
    northButton = new Button("North");
    eastButton = new Button("East");
    westButton = new Button("West");
    southButton = new Button("South");
    centerButton = new Button("Center");

    add(northButton, BorderLayout.NORTH);
    add(eastButton, BorderLayout.EAST);
    add(westButton, BorderLayout.WEST);
    add(southButton, BorderLayout.SOUTH);
    add(centerButton, BorderLayout.CENTER);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  
  public static void main(String[] args) {
    ButtonLayout bl = new ButtonLayout();

    bl.setSize(300, 200);
    bl.setVisible(true);
  }
}

