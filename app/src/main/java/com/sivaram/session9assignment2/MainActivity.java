package com.sivaram.session9assignment2;

import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Override method to Create Options Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Loop Through Option Menu Items Enums available in MenuList Class And Add to
        // Option Menu Items.
        for(MenuList.OptionMenuItems menuItem : MenuList.OptionMenuItems.values())
            menu.add(menuItem.toString());

        return super.onCreateOptionsMenu(menu);
    }

    // Override Method for Options Menu Item Selection
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Show Toast with Selected Menu Item Title as text On Options Menu Item Click
        Toast.makeText(this, item.getTitle() + " Menu Item Selected", Toast.LENGTH_SHORT).show();
        
        return true;
    }
}
