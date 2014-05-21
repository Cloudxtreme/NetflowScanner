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
    private ExceptionPane exceptionPane;
    private DatePane datePane;
    private GraphPane graphPane;

    public TabPane() {
        super(JTabbedPane.NORTH);
        datePane = new DatePane();
        graphPane = new GraphPane();
        exceptionPane = new ExceptionPane();
        this.add("总流量", datePane);
        this.add("统计图", graphPane);
        this.add("异常日志",exceptionPane);
        this.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            }
        });
    }
}