package com.sevrep.group2popupmenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.item1) {
            customToast("Acebo");
            return true;
        } else if (itemId == R.id.item2) {
            customToast("Capecenio");
            return true;
        } else if (itemId == R.id.item3) {
            customToast("Cinco");
            return true;
        } else if (itemId == R.id.item4) {
            customToast("Galve");
            return true;
        } else if (itemId == R.id.item5) {
            customToast("Orsal");
            return true;
        } else if (itemId == R.id.item6) {
            customToast("Semilla");
            return true;
        }
        return false;
    }

    public void customToast(String mensahe) {
        Toast.makeText(this, mensahe, Toast.LENGTH_SHORT).show();
    }

}