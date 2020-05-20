package com.example.android.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitAnswer(View view) {
        score = 0;
        QuestionOne();
        QuestionTwo();
        QuestionThree();
        QuestionFour();
        QuestionFive();
        if (score == 5) {
            Toast.makeText(getApplicationContext(),
                    "Congratulations\nYou Correctly Answered All \nYou Scored: " + score, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),
                    "Try Again\nYou Scored: " + score, Toast.LENGTH_SHORT).show();
        }
    }

    private void QuestionOne() {
        RadioButton Q1 = (RadioButton) findViewById(R.id.option1);
        boolean isChecked = Q1.isChecked();
        if (isChecked) {
            score += 1;
        }
    }

    private void QuestionTwo() {
        CheckBox c1 = (CheckBox) findViewById(R.id.option1C);
        CheckBox c2 = (CheckBox) findViewById(R.id.option2C);
        CheckBox c3 = (CheckBox) findViewById(R.id.option3C);
        CheckBox c4 = (CheckBox) findViewById(R.id.option4C);
        boolean isCheckedC1, isCheckedC2, isCheckedC3, isCheckedC4;
        isCheckedC1 = c1.isChecked();
        isCheckedC2 = c2.isChecked();
        isCheckedC3 = c3.isChecked();
        isCheckedC4 = c4.isChecked();
        if (isCheckedC1 && isCheckedC2 && !isCheckedC3 && !isCheckedC4) {
            score += 1;
        }
    }

    private void QuestionThree() {
        EditText editText = (EditText) findViewById(R.id.Edittxt1);
        String UserAns = editText.getText().toString();
        if (UserAns.trim().equalsIgnoreCase("scope resolution")) {
            score += 1;
        }
    }

    private void QuestionFour() {
        RadioButton rb = (RadioButton) findViewById(R.id.Roption1);
        boolean isChecked = rb.isChecked();
        if (isChecked) {
            score += 1;
        }
    }

    private void QuestionFive() {
        CheckBox c1 = (CheckBox) findViewById(R.id.option1C1);
        CheckBox c2 = (CheckBox) findViewById(R.id.option2C1);
        CheckBox c3 = (CheckBox) findViewById(R.id.option3C1);
        CheckBox c4 = (CheckBox) findViewById(R.id.option4C1);
        boolean isCheckedC1, isCheckedC2, isCheckedC3, isCheckedC4;
        isCheckedC1 = c1.isChecked();
        isCheckedC2 = c2.isChecked();
        isCheckedC3 = c3.isChecked();
        isCheckedC4 = c4.isChecked();
        if (!isCheckedC1 && isCheckedC2 && !isCheckedC3 && isCheckedC4) {
            score += 1;
        }
    }
}
