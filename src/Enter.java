import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-21
 * Time: 下午5:40
 * To change this template use File | Settings | File Templates.
 */
public class Enter extends JFrame {
    private TabPane tabs;
    public Enter(String title) throws HeadlessException {
        super(title);
        tabs = new TabPane();
        Container contentPane = getContentPane();
        contentPane.add(tabs);

        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Enter("NetFlow");
    }
}
