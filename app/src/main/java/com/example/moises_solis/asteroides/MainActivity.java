package com.example.moises_solis.asteroides;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnsalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsalir=(Button)findViewById(R.id.btnsalir);

        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    public void lanzarpreferencias(View view){
        Intent i= new Intent(MainActivity.this,Preferencias.class);
        startActivity(i);
    }

    public void clickacercade(View view){
        Intent intent= new Intent(this,AcercaDe.class);
        startActivity(intent);
    }

    public  void lanzarpuntuaciones(View view){
        Intent i= new Intent(MainActivity.this,Puntuaciones.class);
        startActivity(i);
    }



    public void mostrarpreferencias (View view){
        SharedPreferences preferencias= PreferenceManager.getDefaultSharedPreferences(this);
        String s= "Musica"+preferencias.getBoolean("musica",true) + "  Tipo de conexion"+ preferencias.getString("conexion","?");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.action_settings){
            lanzarpreferencias(null);
        }
        if (id==R.id.action_acercade){
            clickacercade(null);
        }

        return super.onOptionsItemSelected(item);
    }

    public static AlmacenPuntuaciones almacen =new AlmacenPuntuacionesArray();
}
