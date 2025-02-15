package com.example.proyecto;

import com.example.parcial.Agregar;
import com.example.parcial.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	Button compras;
	Button carrito;
	Button agregar;
	Context contexto;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contexto=this.getApplicationContext();
        compras=(Button) findViewById(R.id.button1);
        compras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	Intent c=new Intent(contexto,CatalogoActividad.class);
            	startActivity(c);	
            }
        });
        carrito=(Button) findViewById(R.id.button2);
        carrito.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	Intent d=new Intent(contexto,CarritoCompras.class);
            	startActivity(d);	
            }
        });
        agregar=(Button) findViewById(R.id.button3);
        agregar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent e=new Intent(contexto,Agregar.class);
            	startActivity(e);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.otralista1) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}