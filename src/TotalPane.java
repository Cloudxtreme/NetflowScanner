import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-21
 * Time: 下午5:11
 * To change this template use File | Settings | File Templates.
 */
public class TotalPane extends JPanel {
    private JPanel container = new JPanel();
    static JLabel totaltitle = new JLabel("总数据包:");
    static JLabel tcptitle = new JLabel("TCP数据包:");
    static JLabel udptitle = new JLabel("UDP数据包:");
    private JLabel totalnum = new JLabel();
    private JLabel tcpnum = new JLabel();
    private JLabel udpnum = new JLabel();

    public TotalPane() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(new TitledBorder("总流量统计"));
        container.setLayout(new GridLayout(3, 2));
        container.add(totaltitle);
        totalnum.setText("43349");
        container.add(totalnum);
        container.add(tcptitle);
        tcpnum.setText("23248");
        container.add(tcpnum);
        container.add(udptitle);
        udpnum.setText("20884");
        container.add(udpnum);
        this.add(container);
    }
}
