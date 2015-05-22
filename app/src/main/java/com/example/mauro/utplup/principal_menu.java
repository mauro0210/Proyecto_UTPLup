package com.example.mauro.utplup;

import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class principal_menu extends Activity {


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recorrido_buses, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_menu);

    }


    public void Pasarabuses(View view) {
        Intent button1 = new Intent(this,recorrido_buses.class);
        startActivity(button1);
    }

    public void Pasaracarreras(View view) {
        Intent button2 = new Intent(this,Lista_carreras.class);
        startActivity(button2);
    }

    public void Pasaraorganizador(View view) {
        Intent button3 = new Intent(this,lista_tareas.class);
        startActivity(button3);
    }

    public void Pasaramiprogreso(View view) {
        Intent button4 = new Intent(this,lista_tareas.class);
        startActivity(button4);
    }
}
