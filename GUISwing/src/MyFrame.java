import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {
    
    MyFrame(){
        this.setTitle("JFrame title goes here"); // Set the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the frame is closed
        this.setResizable(false); // Prevent the frame from being resized
        this.setSize(420, 420); // Set the size of the frame in pixels, x, y
        this.setVisible(true); // Make the frame visible

        ImageIcon image = new ImageIcon("src/Icon.png"); // Create an ImageIcon
        this.setIconImage(image.getImage()); // Change icon of the fram
        this.getContentPane().setBackground(new Color(123, 50, 250)); // Change the background color of the frame
    }
}
