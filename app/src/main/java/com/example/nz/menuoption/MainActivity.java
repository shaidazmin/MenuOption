package com.example.nz.menuoption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Call menu option .....

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    // menu item action .....


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.profile){
            Toast.makeText(MainActivity.this,"Profile",Toast.LENGTH_SHORT).show();
        }  if(item.getItemId()==R.id.settings){
            Toast.makeText(MainActivity.this,"Settings",Toast.LENGTH_SHORT).show();
        }  if(item.getItemId()==R.id.about){
            Toast.makeText(MainActivity.this,"About",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
