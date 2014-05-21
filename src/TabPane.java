/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-18
 * Time: 下午2:07
 * To change this template use File | Settings | File Templates.
 */

import com.orsoncharts.graphics3d.swing.DisplayPanel3D;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabPane extends JTabbedPane {
    private static final long serialVersionUID = 1L;
    private DisPane disPane;
    private ExceptionPane exceptionPane;
    private TotalPane totalPane;
    private GraphPane graphPane;

    public TabPane() {
        super(JTabbedPane.NORTH);
        totalPane = new TotalPane();
        disPane = new DisPane();
        graphPane = new GraphPane();
        exceptionPane = new ExceptionPane();
        this.add("总流量", totalPane);
        this.add("分类统计",disPane);
        this.add("统计图", graphPane);
        this.add("异常日志",exceptionPane);
        this.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            }
        });
    }
}