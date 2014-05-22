import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-21
 * Time: 下午6:06
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionPane extends JPanel{
    JPanel firsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JLabel dateLabel = new JLabel("日期");
    JTextField Jdate = new JTextField(10);
    private String[] object = {"日期", "源IP"  ,  "异常类型"};
    private Object[][] result = {
            {"2014-02-05 09:13","192.168.1.1" , "DDos"} ,
            {"2014-02-05 15:00" , "192.168.2.2","DDos"} ,
    };
    private JTable ext;
    public ExceptionPane(){
        super();
        this.setLayout(new BorderLayout());
        ext = new JTable(result,object);
        firsPanel.add(dateLabel);
        firsPanel.add(Jdate);
        JScrollPane scrollPane = new JScrollPane(ext);
        this.add(firsPanel,BorderLayout.NORTH);
        this.add(scrollPane,BorderLayout.CENTER);

    }
}
