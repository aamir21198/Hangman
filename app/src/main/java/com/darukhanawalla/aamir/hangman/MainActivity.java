package com.darukhanawalla.aamir.hangman;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Intent intent;
    int score;

    //public static final String MyPREFERENCES = "MyPrefs" ;
    //SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText)findViewById(R.id.word);

        //sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        //score = sharedPreferences.getInt("score", 0);
    }

    @Override
    protected void onResume() {
        super.onResume();

        et.getText().clear();
    }

    public void animals(View view)
    {
        toGame(1);
    }

    public void games(View view)
    {
        toGame(2);
    }

    public void fruits(View view)
    {
        toGame(3);
    }

    public void countries(View view)
    {
        toGame(4);
    }

    public void twoPlayer(View view)
    {
        String word=et.getText().toString().toLowerCase();
        if(word.equals(""))
        {
            Toast.makeText(this, "Please Enter Something", Toast.LENGTH_SHORT).show();
        }
        else
        {
            intent=new Intent(MainActivity.this,ActivityTwo.class);
            intent.putExtra("Category",0);
            intent.putExtra("word",word);
            startActivity(intent);
        }

    }

    public void toGame(int a)
    {
        intent=new Intent(MainActivity.this,ActivityTwo.class);
        intent.putExtra("Category",a);
        startActivity(intent);
    }
}
