package com.example.demouser.boggle_cj;


import android.content.res.AssetManager;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private BoogleDictionary dictionary;
    public static String typedWord = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        typedWord = "";


        ((Button)findViewById(R.id.checkButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                check();
            }
        });

        // on click listener for all the buttons in the grid
        ((Button)findViewById(R.id.button00)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button00)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button00)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button01)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button01)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button01)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button02)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button02)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button02)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button03)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button03)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button03)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button10)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button10)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button10)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button11)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button11)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button11)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button12)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button12)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button12)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button13)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button13)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button13)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button20)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button20)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button20)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button21)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button21)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button21)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });


        ((Button)findViewById(R.id.button22)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button22)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button22)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button23)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button23)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button23)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button30)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button30)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button30)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button31)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button31)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button31)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button32)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button32)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button32)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });

        ((Button)findViewById(R.id.button33)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button33)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typedWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button33)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });








        //load the words.txt file
        AssetManager assetManager = getAssets();
        try {
            InputStream inputStream = assetManager.open("m_length_dictionary.txt");
            dictionary = new BoogleDictionary(inputStream);
            //use the text file as dictionary
        } catch (IOException e) {
            Toast toast = Toast.makeText(this, "Could not load dictionary", Toast.LENGTH_LONG);
            toast.show();
        }

    }

    // method to go to final Activity
    private void check()
    {

        startActivity(new Intent(this, FinalActivity.class));


    }





        // Hi we are making changes

}
