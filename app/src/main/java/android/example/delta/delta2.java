package android.example.delta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class delta2 extends AppCompatActivity {
    private static final String TAG = "delta2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delta2);

        Log.d(TAG, "onCreate: Started delta2");


        /*Intent intent = new Intent(Intent.ACTION_MAIN);
        intent=getIntent();*/
        /*Intent intent1 = getIntent();*/

        String value = null;
        Bundle b=getIntent().getExtras();

        if (b != null) {

            value = getIntent().getStringExtra("value");
            
        }

        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);

        final int convertedVal;

        if (!TextUtils.isEmpty(value) && TextUtils.isDigitsOnly(value)) {
            convertedVal = Integer.parseInt(value);
        } else {
            convertedVal = 0;
        }

        int[] Factors = new int[1000];
        int j=0;

        for (int i = 1; i < convertedVal + 1; i++) {
            if (convertedVal % i == 0) {
                Factors[j] = i;
                j++;

            }
        }

        Random r2 = new Random();
        int randomNumber2 = r2.nextInt(100);

        Random r3 = new Random();
        int randomNumber3 = r3.nextInt(100);

        Random r4 = new Random();
        int randomDigit = r4.nextInt(100);
        int correctAnswer = Factors[randomDigit];

        int[] choices = {correctAnswer, randomNumber2, randomNumber3};

        Random r1 = new Random();
        int randomNumber1 = r1.nextInt(2);

        button2.setText(String.valueOf(choices[randomNumber1]));
        if (randomNumber1 == 0) {
            button3.setText(String.valueOf(choices[2]));
            button4.setText(String.valueOf(choices[1]));
        } else if (randomNumber1 == 1) {
            button3.setText(String.valueOf(choices[2]));
            button4.setText(String.valueOf(choices[0]));
        } else {
            button3.setText(String.valueOf(choices[0]));
            button4.setText(String.valueOf(choices[1]));

        }


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (Integer.parseInt(button2.getText().toString()) == convertedVal) {
                    Toast.makeText(delta2.this, "CORRECT", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(delta2.this, "WRONG", Toast.LENGTH_SHORT).show();

                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (Integer.parseInt(button3.getText().toString()) == convertedVal) {
                    Toast.makeText(delta2.this, "CORRECT", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(delta2.this, "WRONG", Toast.LENGTH_SHORT).show();

                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Integer.parseInt(button4.getText().toString()) == convertedVal) {
                    Toast.makeText(delta2.this, "CORRECT", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(delta2.this, "WRONG", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
















