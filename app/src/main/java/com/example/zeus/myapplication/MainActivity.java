package com.example.zeus.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        String textValue = editText.getText().toString();
        if (!textValue.trim().equals("")) {
            textView.append("\n ---------------------------------------------- \n\n");
            textView.append(textValue + " \n");
        }
        editText.setText("");
    }


}
