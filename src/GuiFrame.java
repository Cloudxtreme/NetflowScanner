import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mawen on 14-4-26.
 */
public class GuiFrame {
    private JPanel mainframe;
    private JButton total;
    private JButton NetExt;
    private JButton disclass;
    private JButton graph;
    private JPanel totalpanel;
    private JPanel disclasspanel;
    private JPanel graphpanel;
    private JPanel extpanel;
    private JPanel panelcontainer;

    public ChartPanel BarChart(){
        CategoryDataset dataset = getDataSet();
        JFreeChart chart = ChartFactory.createBarChart3D(
                "水果", // 图表标题
                "水果种类", // 目录轴的显示标签
                "数量", // 数值轴的显示标签
                dataset, // 数据集
                PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                true,           // 是否显示图例(对于简单的柱状图必须是false)
                false,          // 是否生成工具
                false           // 是否生成URL链接
        );
        return new ChartPanel(chart,true);
    }
    public GuiFrame() {

            total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) panelcontainer.getLayout();

                cardLayout.show(panelcontainer,"totalpanel");
                //To change body of implemented methods use File | Settings | File Templates.
            }
        });
        disclass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
                CardLayout cardLayout = (CardLayout) panelcontainer.getLayout();
                cardLayout.show(panelcontainer, "disclasspanel");

            }
        });
        graph.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
                CardLayout cardLayout = (CardLayout) panelcontainer.getLayout();
                cardLayout.show(panelcontainer,"graphpanel");
            }
        });
        NetExt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of implemented methods use File | Settings | File Templates.
                CardLayout cardLayout = (CardLayout) panelcontainer.getLayout();
                cardLayout.show(panelcontainer, "extpanel");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiFrame");
        frame.setContentPane(new GuiFrame().mainframe);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private static CategoryDataset getDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100, "北京", "苹果");
            dataset.addValue(100, "上海", "苹果");
            dataset.addValue(100, "广州", "苹果");
            dataset.addValue(200, "北京", "梨子");
            dataset.addValue(200, "上海", "梨子");
            dataset.addValue(200, "广州", "梨子");
            dataset.addValue(300, "北京", "葡萄");
            dataset.addValue(300, "上海", "葡萄");
            dataset.addValue(300, "广州", "葡萄");
            dataset.addValue(400, "北京", "香蕉");
            dataset.addValue(400, "上海", "香蕉");
            dataset.addValue(400, "广州", "香蕉");
            dataset.addValue(500, "北京", "荔枝");
            dataset.addValue(500, "上海", "荔枝");
            dataset.addValue(500, "广州", "荔枝");
            return dataset;
        }
}
