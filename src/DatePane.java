import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: garfield
 * Date: 14-5-21
 * Time: 下午5:11
 * To change this template use File | Settings | File Templates.
 */
public class DatePane extends JPanel {
    private TotalPanel total = new TotalPanel();
    private SearchPanel search = new SearchPanel();

    public DatePane() {
        this.setLayout(new BorderLayout());
        this.add(total, BorderLayout.NORTH);
        this.add(search, BorderLayout.CENTER);
    }

    private class TotalPanel extends JPanel {

        private JLabel totaltitle = new JLabel("总数据包:");
        private JLabel tcptitle = new JLabel("TCP数据包:");
        private JLabel udptitle = new JLabel("UDP数据包:");
        private JLabel totalnum = new JLabel();
        private JLabel tcpnum = new JLabel();
        private JLabel udpnum = new JLabel();

        TotalPanel() {
            this.setLayout(new GridLayout(3, 2));
            this.setBorder(new TitledBorder("总流量"));
            getContent();
            this.add(totaltitle);
            this.add(totalnum);
            this.add(tcptitle);
            this.add(tcpnum);
            this.add(udptitle);
            this.add(udpnum);
        }

        private void getContent() {
            totalnum.setText("48892");
            tcpnum.setText("22009");
            udpnum.setText("25002");
        }
    }

    private class SearchPanel extends JPanel {
        private JPanel container = new JPanel();
        private JPanel firs_container = new JPanel();
        private JPanel sec_container = new JPanel();
        private String[] type = {"全部" , "TCP" , "UDP"};
        private JLabel portLabel = new JLabel("端口号");
        private JTextField port = new JTextField(5);
        private JComboBox typechoice = new JComboBox(type);
        private JLabel des_startLabel = new JLabel("目的IP段:");
        private JTextField des_start = new JTextField(10);
        private JLabel des_endLabel = new JLabel("~");
        private JTextField des_end = new JTextField(10);
        private JLabel src_startLabel = new JLabel("源IP段:");
        private JTextField src_start = new JTextField(10);
        private JLabel src_endLabel = new JLabel("~");
        private JTextField src_end = new JTextField(10);
        private JButton searchButton = new JButton("go");
        private Object[][] result = {
                {"192.168.1.1" , new Integer(80) , "192.168.2.2" , new Integer(5556) ,new String("TCP"), new Integer(5886)} ,
                {"192.168.1.3" , new Integer(80), "192.168.2.4"  , new Integer(8888) , new String("UDP"),new Integer(25553)} ,
        };
        private String[] object = {"目的IP" , "目的端口", "源IP"  , "源端口" , "类型","包数量"};

        SearchPanel() {
            this.setLayout(new BorderLayout());
            this.setBorder(new TitledBorder("分类检索"));
            firs_container.setLayout(new FlowLayout(FlowLayout.LEFT));
            firs_container.add(src_startLabel);
            firs_container.add(src_start);
            firs_container.add(src_endLabel);
            firs_container.add(src_end);
            firs_container.add(des_startLabel);
            firs_container.add(des_start);
            firs_container.add(des_endLabel);
            firs_container.add(des_end);
            sec_container.setLayout(new FlowLayout(FlowLayout.LEFT));
            sec_container.add(typechoice);
            sec_container.add(portLabel);
            sec_container.add(port);
            sec_container.add(searchButton);
            container.setLayout(new GridLayout(2, 1));
            container.add(firs_container);
            container.add(sec_container);
            this.add(container, BorderLayout.NORTH);
            JTable table = new JTable(result, object);
            JScrollPane scrollPane = new JScrollPane(table);
            this.add(scrollPane, BorderLayout.CENTER);
        }
    }
}
