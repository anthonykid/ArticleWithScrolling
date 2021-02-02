package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        // Create a toast show it.
        Toast toast = Toast.makeText(this, "Terimakasih Telah Membaca Artikel Kami", Toast.LENGTH_LONG);
        toast.show();
    }
}