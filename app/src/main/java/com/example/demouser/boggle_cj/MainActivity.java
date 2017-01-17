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
<<<<<<< HEAD
    private String typedWord="";
    StringBuilder mStringBuilder = new StringBuilder("");
    public ArrayList<String> wordList = new ArrayList<String>();

=======
    public static String typedWord = "";
>>>>>>> origin/master

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

<<<<<<< HEAD
=======


        ((Button)findViewById(R.id.finishButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        ((Button)findViewById(R.id.enterButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                enter();
            }
        });

        ((Button)findViewById(R.id.clearButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                clear();
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
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
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button32)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });
>>>>>>> origin/master

        ((Button)findViewById(R.id.button33)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // add the on button to typedWord String
                typedWord += ((Button)findViewById(R.id.button33)).getText().toString();
                // update text view
                ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
                // set the button to a clicked color
                ((Button)findViewById(R.id.button33)).setBackgroundColor(getResources().getColor(R.color.clickedButton));

            }
        });








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

<<<<<<< HEAD
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

=======
    // method to go to final Activity
    public void finish()
    {
        clear();
>>>>>>> origin/master
        startActivity(new Intent(this, FinalActivity.class));


    }

    public void clear()
    {
       // clear the text
       typedWord = "";
        ((TextView)findViewById(R.id.typingWord)).setText(typedWord);
        // all button goes back to normal background color
        ((Button)findViewById(R.id.button00)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button01)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button02)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button03)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button10)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button11)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button12)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button13)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button20)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button21)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button22)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button23)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button30)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button31)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button32)).setBackgroundResource(android.R.drawable.btn_default);
        ((Button)findViewById(R.id.button33)).setBackgroundResource(android.R.drawable.btn_default);





    }

<<<<<<< HEAD
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
=======
    public void enter()
    {

       clear();



    }



>>>>>>> origin/master


}
