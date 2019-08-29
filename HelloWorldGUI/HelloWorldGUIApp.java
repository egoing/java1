import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
public class HelloWorldGUIApp{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(800, 300));
                JLabel label = new JLabel("Hello World!!", SwingConstants.RIGHT);
                frame.getContentPane().add(label);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}