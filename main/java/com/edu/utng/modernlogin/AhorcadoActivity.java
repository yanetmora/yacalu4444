package com.edu.utng.modernlogin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**

 */
public class AhorcadoActivity extends Activity {
	private LinearLayout layout;
	static String palabra = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ahorcado);

		// Obtencion de las vistas:
		layout = (LinearLayout) findViewById(R.id.activity_gameAh);

		// Modificacion de la fuente para las vistas:
//		Typeface tf = Typeface.createFromAsset(getAssets(), "tiza.ttf");

		for (int i = 0; i < layout.getChildCount(); i++) {
			View vista = layout.getChildAt(i);
			if (vista.getClass() == TextView.class
					|| vista.getClass() == Button.class) {
//				((TextView) vista).setTypeface(tf, Typeface.BOLD);
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_insertar:
			lanzarInsercion(null);
			break;
		case R.id.action_jugar:
			lanzarJuego(null);
			break;
		case R.id.action_salir:
			salir(null);
			break;
		}
		return true;
	}

	public void lanzarInsercion(View view) {
		Intent intent = new Intent(this, Insercion.class);
		startActivity(intent);
	}

	public void lanzarJuego(View view) {
		if (palabra != null) {
			Intent intent = new Intent(this, Juego.class);
			startActivity(intent);
		} else {
			Toast.makeText(this, R.string.error_falta_palabra,
					Toast.LENGTH_LONG).show();
		}
	}

	public void salir(View view) {
		finish();
	}

}
