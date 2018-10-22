package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chart = new ChartPanel(createChart(createDataset()));
        chart.setPreferredSize(new Dimension(500,400));
        return chart;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart"
                ,"Dominios email","Nº de emails",dataSet, 
                PlotOrientation.VERTICAL,false,false,rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(12, "", "hotmail.com");
        dataSet.addValue(15, "", "gmail.com");
        dataSet.addValue(10, "", "yahoo.com");
        dataSet.addValue(1, "", "ulpgc.es");
        return dataSet;
    }
    
}
