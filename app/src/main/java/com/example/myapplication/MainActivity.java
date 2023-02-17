package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("logs", "onCreate");
        Log.e("logs", "onCreate");
        Log.i("logs", "onCreate");
        Log.v("logs", "onCreate");
        Log.w("logs", "onCreate");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d("logs", "onStart");
        Log.e("logs", "onStart");
        Log.i("logs", "onStart");
        Log.v("logs", "onStart");
        Log.w("logs", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d("logs", "onResume");
        Log.e("logs", "onResume");
        Log.i("logs", "onResume");
        Log.v("logs", "onResume");
        Log.w("logs", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.d("logs", "onPause");
        Log.e("logs", "onPause");
        Log.i("logs", "onPause");
        Log.v("logs", "onPause");
        Log.w("logs", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.d("logs", "onStop");
        Log.e("logs", "onStop");
        Log.i("logs", "onStop");
        Log.v("logs", "onStop");
        Log.w("logs", "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("logs", "onDestroy");
        Log.e("logs", "onDestroy");
        Log.i("logs", "onDestroy");
        Log.v("logs", "onDestroy");
        Log.w("logs", "onDestroy");

    }



}