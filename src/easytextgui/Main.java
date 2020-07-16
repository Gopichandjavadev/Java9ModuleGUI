package easytextgui;

import easytextcli.PrintDoc;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;

public class Main {

    public static void main(String[] args) {
        
        PrintDoc doc = new PrintDoc();
        doc.print();
        
        Axis<Object> xAxis = null;
        Axis<Object> yAxis = null;
        
        @SuppressWarnings("unchecked")
        LineChart linechart = new LineChart(xAxis, yAxis); 
    }

}
