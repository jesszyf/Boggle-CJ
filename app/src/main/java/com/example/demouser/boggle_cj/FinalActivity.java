package com.example.demouser.boggle_cj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    MainActivity main = new MainActivity();
    private String correct = "";
    private String wrong = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

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

    }
}
