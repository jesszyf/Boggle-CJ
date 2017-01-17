package com.example.demouser.boggle_cj;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private BoogleDictionary dictionary;
    private String typedWord="";
    StringBuilder mStringBuilder = new StringBuilder("");
    public ArrayList<String> wordList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

//        final Button button00= (Button)findViewById(R.id.button00);
//        final Button button01= (Button)findViewById(R.id.button01);
//        final Button button02= (Button)findViewById(R.id.button02);
//        final Button button03= (Button)findViewById(R.id.button03);
//        final Button button10= (Button)findViewById(R.id.button10);
//        final Button button11= (Button)findViewById(R.id.button11);
//        final Button button12= (Button)findViewById(R.id.button12);
//        final Button button13= (Button)findViewById(R.id.button13);
//        final Button button20= (Button)findViewById(R.id.button20);
//        final Button button21= (Button)findViewById(R.id.button21);
//        final Button button22= (Button)findViewById(R.id.button22);
//        final Button button23= (Button)findViewById(R.id.button23);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setBoogle((Button)findViewById(R.id.button00));
        //setBoogle((Button)findViewById(R.id.button01));
        //setBoogle((Button)findViewById(R.id.button02));
        ((Button)findViewById(R.id.button00)).setText("a");
        ((Button)findViewById(R.id.button01)).setText("b");
        ((Button)findViewById(R.id.button02)).setText("o");
        ((Button)findViewById(R.id.button03)).setText("u");
        ((Button)findViewById(R.id.button10)).setText("t");
        ((Button)findViewById(R.id.button11)).setText("h");
        ((Button)findViewById(R.id.button12)).setText("e");
        ((Button)findViewById(R.id.button13)).setText("r");



        clickBoogle();

        //load the words.txt file
        AssetManager assetManager = getAssets();
        try {
            InputStream inputStream = assetManager.open("m_length_dictionary.txt");
            dictionary = new BoogleDictionary(inputStream, MainActivity.this);
            //use the text file as dictionary
        } catch (IOException e) {
            Toast toast = Toast.makeText(this, "Could not load dictionary", Toast.LENGTH_LONG);
            toast.show();
        }

    }

    /**
     * sets the boogle according to the letters
     */
    private void setBoogle(Button button){

        int random = (int) (Math.random() * 10);

        if (random<3)
            button.setText("a");

        else if (random>6)
            button.setText("b");

        else
            button.setText("c");
    }

    /**
     * if anything is getting clicked
     */
    private void clickBoogle(){

        ((Button)findViewById(R.id.button00)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button00)).getText().toString();
                mStringBuilder.append(add);
            }
        });

        ((Button)findViewById(R.id.button01)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button01)).getText().toString();
                mStringBuilder.append(add);
            }
        });

        ((Button)findViewById(R.id.button02)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button02)).getText().toString();
                mStringBuilder.append(add);
            }
        });
        ((Button)findViewById(R.id.button03)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button03)).getText().toString();
                mStringBuilder.append(add);
            }
        });
        ((Button)findViewById(R.id.button10)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button10)).getText().toString();
                mStringBuilder.append(add);
            }
        });
        ((Button)findViewById(R.id.button11)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button11)).getText().toString();
                mStringBuilder.append(add);
            }
        });
        ((Button)findViewById(R.id.button12)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button12)).getText().toString();
                mStringBuilder.append(add);
            }
        });
        ((Button)findViewById(R.id.button13)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String add = ((Button)findViewById(R.id.button13)).getText().toString();
                mStringBuilder.append(add);
            }
        });


        ((Button)findViewById(R.id.finalButton)).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                newWord();
            }

        });

        ((Button)findViewById(R.id.resultButton)).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                check();
            }

        });

    }

    private void check(){

        startActivity(new Intent(this, FinalActivity.class));
    }

    private void newWord(){

        String typedWord = mStringBuilder.toString();
        wordList.add(typedWord);

        ((TextView)findViewById(R.id.editText)).setText(typedWord);
        mStringBuilder = new StringBuilder(typedWord+"\n");
    }

    public ArrayList<String> getWordList(){

        return wordList;
    }

    public boolean getValue(String obj){

        return dictionary.getMap().get(obj).booleanValue();
    }


}
