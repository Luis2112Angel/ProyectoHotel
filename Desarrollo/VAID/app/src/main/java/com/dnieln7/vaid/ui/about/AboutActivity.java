package com.dnieln7.vaid.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.dnieln7.vaid.R;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Acerca de");
        setSupportActionBar(toolbar);
    }

    public void facebook(View view) {
        Intent viewIntent =
                new Intent("android.intent.action.VIEW",
                        Uri.parse("https://www.facebook.com/Que-payasos-109455817481166"));
        startActivity(viewIntent);
    }

    public void twitter(View view) {
        Intent viewIntent =
                new Intent("android.intent.action.VIEW",
                        Uri.parse("https://twitter.com/VAID_SA"));
        startActivity(viewIntent);
    }

    public void github(View view) {
        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/Luis501Angel/ProyectoHotel"));
        startActivity(viewIntent);
    }
}
