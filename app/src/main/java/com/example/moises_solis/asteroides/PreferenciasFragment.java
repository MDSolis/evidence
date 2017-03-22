package com.example.moises_solis.asteroides;

import android.os.Bundle;
import android.preference.PreferenceFragment;


/**
 * Created by Moises_Solis on 17/03/2017.
 */

public class PreferenciasFragment extends PreferenceFragment {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
