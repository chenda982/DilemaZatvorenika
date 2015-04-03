/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dilemazatvorenikanew;
//import javax.swing.* 
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Cheda
 */
public class Grafik {
    
    public void napraviGrafik(double[] rez1, double[] rez2, int i, String igrac1, String igrac2 )
    {
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int m =0 ; m<i; m++)
        {
            int iter = m+1; 
            dataset.setValue(new Double(rez1[m]), igrac1, iter+".");
        }
        for (int m =0 ; m<i; m++)
        {
            int iter = m+1; 
            dataset.setValue(new Double(rez2[m]), igrac2, iter+".");
        }
        JFreeChart chart = ChartFactory.createLineChart("Dilema Zatvorenika","Iteracije", "Rezultat", dataset, PlotOrientation.VERTICAL, true, true, true);
        chart.setBackgroundPaint(Color.GRAY);
        chart.getTitle().setPaint(Color.BLACK);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Prezentacija", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }
}
