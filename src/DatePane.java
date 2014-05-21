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
        JPanel container = new JPanel();
        private String[] type = {"全部" , "TCP" , "UDP"};
        JComboBox typechoice = new JComboBox(type);
        JLabel startLabel = new JLabel("起始IP：");
        JTextField start = new JTextField(15);
        JLabel endLabel = new JLabel("结束IP：");
        JTextField end = new JTextField(15);
        JButton search = new JButton("go!");
        JList resultlist;
        Vector<String> result = new Vector<String>();
        SearchPanel() {
            this.setLayout(new BorderLayout());
            this.setBorder(new TitledBorder("分类检索"));
            container.setLayout(new FlowLayout(FlowLayout.LEFT));
            container.add(typechoice);
            container.add(startLabel);
            container.add(start);
            container.add(endLabel);
            container.add(end);
            container.add(search);
            this.add(container, BorderLayout.NORTH);

       for(int i=0;i<100;i++){
                result.add("hi");
            }

            resultlist = new JList(result);
            this.add(resultlist,BorderLayout.CENTER);
            this.add(new JScrollPane(this.resultlist));


        }
    }
}
