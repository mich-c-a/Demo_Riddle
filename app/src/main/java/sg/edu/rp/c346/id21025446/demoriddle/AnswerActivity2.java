package sg.edu.rp.c346.id21025446.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2 = findViewById(R.id.textView2);
        tvAnswer2.setText("In Second Activity");

        Intent intentReceived = getIntent();
        String qnsSelected = intentReceived.getStringExtra("Question");
        tvAnswer2.setText(qnsSelected + " answer is: Gone");
    }
}