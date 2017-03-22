package com.example.moises_solis.asteroides;

import java.util.Vector;

/**
 * Created by Moises_Solis on 22/03/2017.
 */

public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones {
    private Vector<String> puntuaciones;

    public AlmacenPuntuacionesArray(){
        puntuaciones= new Vector<String>();
        puntuaciones.add("1200 Pedro");
        puntuaciones.add("1400 Moy");
        puntuaciones.add("1250 perengano");
    }

    @Override public void guardarPuntuacion(int puntos,String nombre, long fecha){
        puntuaciones.add(0,puntos+" "+nombre);
    }

    @Override public Vector<String> listaPuntuaciones(int cantidad){
        return puntuaciones;
    }

}
