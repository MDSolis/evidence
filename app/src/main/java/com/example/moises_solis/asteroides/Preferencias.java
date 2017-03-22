package com.example.moises_solis.asteroides;

import android.app.Activity;
import android.app.FragmentContainer;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;


/**
 * Created by Moises_Solis on 17/03/2017.
 */

public class Preferencias extends Activity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PreferenciasFragment()).commit();

    }
}
