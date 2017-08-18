/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author ups_9
 */
public class Grafica {
    // grafica
    private JFreeChart grafica;
    // coleccion de series
    private XYSeriesCollection series;
    private String nombre,tituloEjeX,tituloEjeY;

    public Grafica(String nombre,String ty,String tx) {
     this.grafica = null;
     this.series = new XYSeriesCollection();
     this.nombre = nombre;
     this.tituloEjeX = tx;
     this.tituloEjeY = ty;
    
    }
    
    public void agregarSerie (double[] tiempo, String nombre){
       // instanciamos la serie
        XYSeries serie = new XYSeries(nombre);
      int nMuestras=1000;
        // recorrer los datos para agregarlos a la serie
     for(int x=0;x<tiempo.length;x++){
        serie.add(nMuestras, tiempo[x]);
        nMuestras=nMuestras+1000;
     }
     // agregamos al serie a la coleccion de series
       
     this.series.addSeries(serie);
       
    }
    
    public void verGrafica(){
    
        this.grafica = ChartFactory.createScatterPlot(nombre, tituloEjeX, tituloEjeY, series);
      
        // utilizar un panel especial dentro de jfreechart
        ChartFrame panel = new ChartFrame("grafica",grafica);
        panel.pack();
        panel.setVisible(true);
        
        
    }
    	
}
