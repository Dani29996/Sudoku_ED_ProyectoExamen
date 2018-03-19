/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class Sudoku 
{
    
   //Variables privadas de la clase
    private ArrayList<ArrayList<Integer>> sudoku;//En este array de array se guardaran los números del sudoku

    /**
     * Constructor por defecto
     */
    public Sudoku() 
    {
        sudoku = new ArrayList<>();//Inicializamos el array
    }
     /**
      * Este metodo inicializa el sudoku
      */
    public void inizializar() 
    {
        //creamos nueve filas 
        for (int i = 0; i < 9; i++) 
        {
            ArrayList<Integer> fila = new ArrayList<>();//Creamos un array para guardar las filas
            sudoku.add(fila);//añadimos las filas al array de sudoku
            

        }
    }
    /**
     * Formatea el sudoku a la hora de mostrarlo por pantalla
     * @return 
     */
    @Override
    public String toString ()
    {
        String resultadoFinal = "||----||----||----||\n";
        
        return resultadoFinal;
    }
    /**
     * Modifica el elemento
     * @param fila fila del sudoku
     * @param columna columna del sudoku
     * @param elemento elemenoto del sudoku
     */
    public void modificarElemento(int fila, int columna, int elemento)
    {
        sudoku.get(fila).set(columna, elemento);
        if((fila>=0 && fila <=9) && (columna >= 0 && columna <=9 ))
        {
            
            
        }  
    }
    /**
     * Este metodo vacia un elemento del sudoku
     * @param fila del sudoku
     * @param columna del sudoku
     */
    public void vaciarElemento(int fila, int columna) 
    {
        sudoku.get(fila).set(columna, 0);
    }
    /**
     * Este metodo comprueba las filas del sudoku
     * @param fila del sudoku
     * @param elemento del sudoku
     * @return devuele el resultado de la comprobacion
     */
    private boolean comprobarFila(int fila, int elemento)
    {
        boolean resultado = true;
        for (int i = 0; i < sudoku.get(fila).size(); i++)
        {
            if (sudoku.get(fila).get(i) == elemento) 
            {
                resultado = false;
            }
        }
        return resultado;
    }
    /**
     * Este metodo comprueba las columnas
     * @param columna  columna del sudoku
     * @param elemento elemento del sudoku
     * @return Devuelve el resultado de la comprobación
     */
    private boolean comprobarColumna(int columna, int elemento) 
    {
        boolean resultado = true;
        for (int i = 0; i < sudoku.get(0).size(); i++)
        {
            if (sudoku.get(i).get(columna) == elemento) 
            {
                resultado = false;
            }
        }
        return resultado;
    }

    
    
    
}
