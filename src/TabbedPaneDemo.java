/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-18
 * Time: 下午2:07
 * To change this template use File | Settings | File Templates.
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class TabbedPaneDemo extends JFrame {
    private static final long serialVersionUID = 1L;
    private String[] colorNames = { "red", "blue", "green", "black", "yellow"};
    private Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.BLACK,
            Color.YELLOW};
    private JTabbedPane tabs = new JTabbedPane(JTabbedPane.NORTH);
    private TotalPane totalPane;
    public TabbedPaneDemo(String title) {
        super(title);
        totalPane=new TotalPane();
        tabs.add(totalPane);
        tabs.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            }
        });
        Container contentPane = getContentPane();
        contentPane.add(tabs);

        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPaneDemo("NetFlow");
    }
}