package com.example.gulpdog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Primaria1_math extends AppCompatActivity {
    Toolbar tb_math;
    BottomNavigationView bnv_math;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primaria1_math);
        bnv_math = findViewById(R.id.bnv_math);
        tb_math = findViewById(R.id.tb_math);
        tb_math.setTitle("Contenidos");
        setSupportActionBar(tb_math);
        getSupportFragmentManager().beginTransaction().add(R.id.fL_math,new Contenido()).commitNow();
        bnv_math.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.id_cont:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fL_math,new Contenido()).commit();
                        tb_math.setTitle("Contenidos");
                        return true;
                    case R.id.id_eva:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fL_math,new Evaluacion()).commit();
                        tb_math.setTitle("Evaluaciones");
                        return true;
                    case R.id.id_not:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fL_math,new Nota()).commit();
                        tb_math.setTitle("Notas");
                        return true;
                }
                return false;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.curso){
            Intent dasboard = new Intent(this, Dashboard_main.class);
            startActivity(dasboard);
            Toast.makeText(this,"Se seleccionó Curso. Volviendo.",Toast.LENGTH_LONG).show();
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