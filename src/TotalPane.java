import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-21
 * Time: 下午5:11
 * To change this template use File | Settings | File Templates.
 */
public class TotalPane extends JPanel{
    static JLabel totaltitle = new JLabel("总数据包");
    static JLabel tcptitle = new JLabel("TCP数据包");
    static JLabel udptitle = new JLabel("UDP数据包");
    private JLabel totalnum = new JLabel();
    private JLabel tcpnum = new JLabel();
    private JLabel udpnum = new JLabel();
    public TotalPane(){
        this.setLayout(new FlowLayout());
        this.add(totaltitle);
        this.add(tcptitle);
        this.add(udptitle);
    }
}
