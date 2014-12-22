package com.tb.tebakgambar;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {
EditText jawabannaik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jawabannaik=(EditText)findViewById(R.id.isinaik);
        jawabannaik.setFilters(new InputFilter[] { new InputFilter.AllCaps()});
    }
    public void CekJawabanNaik(View v){
		String jawabanbenar = "NAIK HAJI";
		String jawabanbenar2 = "NAIKHAJI";
		String jawabanuser=jawabannaik.getText().toString();
		if (jawabanuser.equals(jawabanbenar)){
			Toast.makeText(getApplicationContext(), "JAWABAN " + jawabanbenar + " BENAR", 
					Toast.LENGTH_LONG).show();
			Intent i = new Intent(getApplicationContext(),AngkatTanganActivity.class);
			startActivity(i);
			finish();
		}else if (jawabanuser.equals(jawabanbenar2)){
			Toast.makeText(getApplicationContext(), "JAWABAN " + jawabanbenar2 + " BENAR", 
					Toast.LENGTH_LONG).show();
			Intent i = new Intent(getApplicationContext(),AngkatTanganActivity.class);
			startActivity(i);
			finish();
		}else {
			Toast.makeText(getApplicationContext(), "Jawaban anda salah",
					Toast.LENGTH_LONG).show();
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
