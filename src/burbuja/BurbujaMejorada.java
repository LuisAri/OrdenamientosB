/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author ups_9
 */
public class BurbujaMejorada {
    private int intercambios,comparaciones;
    private double tiempoTotal;
    private double tiempoInicial,tiempoFinal;

    public BurbujaMejorada() {
        this.intercambios = 0;
        this.comparaciones = 0;
        this.tiempoTotal = 0;
        this.tiempoInicial = 0;
        this.tiempoFinal = 0;
    }
    
    public void ordenar(double []arreglo){
    this.tiempoInicial = System.currentTimeMillis();
          for(int i = 0; i < arreglo.length - 1; i++)
            {
            for(int j = 0; j < arreglo.length - i-1; j++)
                 {
                   this.comparaciones++;
                           
                if (arreglo[j] > arreglo[j + 1])
                {
                    double tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                    this.intercambios++;
                }
            }
        }
    this.tiempoFinal = System.currentTimeMillis();
    this.tiempoTotal = (this.tiempoFinal - this.tiempoInicial)/1000;
    }

    

    public int getNumIntercambios() {
        return intercambios;
    }

    public int getNumVerificaciones() {
        return comparaciones;
    }

    public double getTiempoTotal() {
        return tiempoTotal;
    }
    
    
}
