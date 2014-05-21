import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-21
 * Time: 下午5:38
 * To change this template use File | Settings | File Templates.
 */
public class GraphPane extends JPanel {
    JPanel firsPanel = new JPanel();
    JPanel secPanel = new JPanel();
    private String[] type = {"柱状图" , "饼图" , "折线图"};
    JComboBox typeBox = new JComboBox(type);

    public GraphPane() {
        this.setLayout(new BorderLayout());
        firsPanel.setBorder(new TitledBorder("选项"));
        firsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        firsPanel.add(typeBox);
        this.add(firsPanel, BorderLayout.NORTH);
        this.add(secPanel, BorderLayout.CENTER);
    }
}
