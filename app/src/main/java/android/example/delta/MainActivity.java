package android.example.delta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "onCreate: Started");

        Button button =  (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(TAG, "onClick: Started btn");
                final EditText editText = (EditText) findViewById(R.id.editText);
                String val  =  editText.getText().toString();

                TextView textView2 = (TextView) findViewById(R.id.editText2);
                textView2.setText(String.valueOf(val));

                Intent intent = new Intent(MainActivity.this,delta2.class);
                intent.putExtra("value", val);
                startActivity(intent);


            }

        }
        );


    }
}