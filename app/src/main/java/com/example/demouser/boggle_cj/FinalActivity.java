package com.example.demouser.boggle_cj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.TextView;
=======
import android.view.View;
import android.widget.Button;
>>>>>>> origin/master

public class FinalActivity extends AppCompatActivity {

    MainActivity main = new MainActivity();
    private String correct = "";
    private String wrong = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

<<<<<<< HEAD
        for (String obj: main.getWordList()){

            System.out.println(obj);
            ((TextView)findViewById(R.id.finalView)).setText(main.getWordList().get(0) + main.getWordList().get(1) + main.getWordList().get(2));

            if (main.getValue(obj))
                correct += (obj + "\n");

            else
                wrong += (obj + "\n");

        }

        ((TextView)findViewById(R.id.correctWords)).setText(correct);
        ((TextView)findViewById(R.id.wrongWords)).setText(wrong);

=======
        ((Button) findViewById(R.id.resetButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
>>>>>>> origin/master
    }

        // reset method, from final activity back to start activity
    private void reset()
    {
        startActivity(new Intent(this, StartActivity.class));

    }

}
