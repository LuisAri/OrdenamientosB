/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;
import burbuja.Burbuja;
import burbuja.BurbujaMejorada;
/**
 *
 * @author ups_9
 */
public class MainB {
    public static void main(String[] args){
       int n=0;
    double[] datos;
    double[] tiempo1 = null;
    double []tiempo2 = null;
    double [] datos2;
    Burbuja b1 = new Burbuja();
     BurbujaMejorada b2 = new BurbujaMejorada();
   Grafica g1 = new Grafica("Gráfica", "tiempo", "nMuestras");
   
   
    
    datos = herramientas.Datos.generarDatosAleatorios(20000, 100);
        datos2=datos.clone();
         b1.ordenar(datos);
         System.out.println();
            b2.ordenar(datos2);
         System.out.println();
            g1.agregarSerie(new double[]{0.016,0.032,0.046,0.109,0.125,
                0.188,0.25,0.375,0.453,0.5,0.61,0.75,0.875,1.0,1.203,1.328,1.502,1.703,1.906,2.25},"Burbuja");
            
            
            g1.agregarSerie(new double[]{0.015,0.016,0.032,0.047,
                0.078,0.093,0.203,0.250,0.282,0.312,0.39,0.469,0.563,0.656,0.797,0.875,0.985,1.141,1.281,1.422},"BurbujaOptimizada");
            
        g1.verGrafica();
    
    }
}
