package com.example.guiadecanales;

import java.io.IOException;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener{
	ImageView principal, pollo, pato, perro, pajarito;
	Button insertar;
	int movil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        principal = (ImageView) findViewById(R.id.ivPrincipal);
        pollo = (ImageView) findViewById(R.id.ivPolluelo);
        pato = (ImageView) findViewById(R.id.ivPatito);
        perro = (ImageView) findViewById(R.id.ivPerro1);
        pajarito = (ImageView) findViewById(R.id.ivPajarito);
       
        
        pollo.setOnClickListener(this);
        pato.setOnClickListener(this);
        perro.setOnClickListener(this);
        pajarito.setOnClickListener(this);
        insertar.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @SuppressWarnings("deprecation")

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.ivPolluelo:
			principal.setImageResource(R.drawable.polluelo);
			movil =R.drawable.polluelo;
			break;
		case R.id.ivPatito:
			principal.setImageResource(R.drawable.patito);
			movil =R.drawable.patito;
			break;
			
		case R.id.ivPerro1:
			principal.setImageResource(R.drawable.perro1);
			movil =R.drawable.perro1;
			break;
		case R.id.ivPajarito:
			principal.setImageResource(R.drawable.pajarito);
			movil =R.drawable.pajarito;
			break;
		case R.id.btInsertar:
			Bitmap imagen=BitmapFactory.decodeStream(getResources().openRawResource(movil));
			
			try {
				getApplicationContext().setWallpaper(imagen);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Toast mensaje=Toast.makeText(this, "The wallpaper was setted", Toast.LENGTH_SHORT);
			mensaje.show();
			break;


		}
    
    }


}

