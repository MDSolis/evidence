package com.example.moises_solis.asteroides;

import java.util.Vector;

/**
 * Created by Moises_Solis on 22/03/2017.
 */

public interface AlmacenPuntuaciones {
    public void guardarPuntuaciones(int puntos, String nombre, long fecha);
    public Vector<String> listaPuntuaciones(int cantidad);
}
