package com.example.gulpdog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Dashboard_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_main);
        //Toolbar important invocation
        Toolbar mytool = findViewById(R.id.top_dashboard);
        setSupportActionBar(mytool);
    }

    public void irpanelmate(View view) {
        Intent intent = new Intent(this, Primaria1_math.class);
        startActivity(intent);
    }
    public void irpanelleng(View view){
        Intent intent = new Intent(this, Primaria1_leng.class);
        startActivity(intent);
    }
    public void irpanelciennat(View view) {
        Intent intent = new Intent(this, Primaria1_math.class);
        startActivity(intent);
    }
    public void irpanelciensoc(View view){
        Intent intent = new Intent(this, Primaria1_leng.class);
        startActivity(intent);
    }
    public void irpaneledufis(View view) {
        Intent intent = new Intent(this, Primaria1_math.class);
        startActivity(intent);
    }
    public void irpanelart(View view){
        Intent intent = new Intent(this, Primaria1_leng.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.curso) {
            Toast.makeText(this, "Se seleccionó Curso. Estas en curso", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Calendario) {
            Toast.makeText(this, "Se seleccionó Calendario. Saliendo.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Biblioteca) {
            Toast.makeText(this, "Se seleccionó Biblioteca. Saliendo.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Ajustes) {
            Toast.makeText(this, "Se seleccionó Ajustes.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Perfil) {
            Toast.makeText(this, "Se seleccionó Perfil.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Cerrar) {
            Toast.makeText(this, "Se seleccionó Cerrando Sesion.", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}