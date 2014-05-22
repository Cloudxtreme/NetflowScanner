import javafx.scene.chart.BarChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

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
    private JComboBox typeBox = new JComboBox(type);
    ChartPanel chartPanel;
    JFreeChart chart;
    private CategoryDataset dataset;

    public GraphPane() {
        this.setLayout(new BorderLayout());
        firsPanel.setBorder(new TitledBorder("选项"));
        firsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        firsPanel.add(typeBox);
        getcontent();
        chartPanel = new ChartPanel(chart,true);
        secPanel.add(chartPanel);
        this.add(firsPanel, BorderLayout.NORTH);
        this.add(secPanel, BorderLayout.CENTER);
    }
    private void getcontent(){
        CategoryDataset dataset = getDataSet();
        chart = ChartFactory.createBarChart3D(  "统计图", // 图表标题
                "端口", // 目录轴的显示标签
                "包数量", // 数值轴的显示标签
                dataset, // 数据集
                PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                true,           // 是否显示图例(对于简单的柱状图必须是false)
                false,          // 是否生成工具
                false           // 是否生成URL链接
        );
        CategoryPlot plot=chart.getCategoryPlot();//获取图表区域对象
        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
        domainAxis.setLabelFont(new Font("黑体",Font.BOLD,14));         //水平底部标题
        domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,12));  //垂直标题
        ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
        rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));
        chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
        chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体
    }
    private CategoryDataset getDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(2221, "14-2-4", "80");
        dataset.addValue(3245, "14-2-5", "81");
        dataset.addValue(5342, "14-2-6", "34");
        dataset.addValue(7653, "14-2-7", "56");
        return dataset;
    }
}
