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
        String resultadoFinal = "";
        return resultadoFinal;
    }
    
    
    
}
