package com.example.menumenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:{
                Intent i = new Intent(getApplicationContext(),Activity1.class);
                startActivity(i);

            }
            break;
            case R.id.item2:{
                Intent i = new Intent(getApplicationContext(),Activity2.class);
                startActivity(i);

            }
            break;
            case R.id.item3:{
                Intent i = new Intent(getApplicationContext(),Activity3.class);
                startActivity(i);

            }
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
}
