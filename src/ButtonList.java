import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-21
 * Time: 下午5:56
 * To change this template use File | Settings | File Templates.
 */
public class ButtonList extends JPanel {
    static JButton reset = new JButton("重置");
    static JButton output = new JButton("导出");
    static JButton help = new JButton("帮助");

    public ButtonList() {
        super();
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(reset);
        this.add(output);
        this.add(help);
    }
}
