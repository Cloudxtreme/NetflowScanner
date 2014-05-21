/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-18
 * Time: 下午2:07
 * To change this template use File | Settings | File Templates.
 */

import javax.swing.*;
import javax.swing.event.*;

public class TabPane extends JTabbedPane {
    private static final long serialVersionUID = 1L;
    private TotalPane totalPane;
    private GraphPane graphPane;

    public TabPane() {
        super(JTabbedPane.NORTH);
        totalPane = new TotalPane();
        graphPane = new GraphPane();
        this.add("总流量", totalPane);
        this.add("统计图", graphPane);
        this.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            }
        });
    }
}