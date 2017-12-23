package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int scoreAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void result(View view) {

        int score = calculateScore();
        Toast.makeText(this, getString(R.string.score) + score, Toast.LENGTH_SHORT).show();
        scoreAnswers = 0;
    }


    public int calculateScore() {
        // declare radio buttons for first question
        RadioButton playRadioButton = (RadioButton) findViewById(R.id.play_radio_button);

        // declare radio buttons for second question
        RadioButton isTryingRadioButton = (RadioButton) findViewById(R.id.is_trying_radio_button);

        // declare check box for third question
        CheckBox dancedCheckBox = (CheckBox) findViewById(R.id.danced_check_box);
        CheckBox couldBarkCheckBox = (CheckBox) findViewById(R.id.could_bark_check_box);
        CheckBox todayCheckBox = (CheckBox) findViewById(R.id.today_check_box);
        CheckBox noVerbCheckBox = (CheckBox) findViewById(R.id.no_verb_check_box);

        // declare check box for fourth question
        CheckBox goodMorningCheckBox = (CheckBox) findViewById(R.id.good_morning_check_box);
        CheckBox helloCheckBox = (CheckBox) findViewById(R.id.hello_check_box);
        CheckBox goodByeCheckBox = (CheckBox) findViewById(R.id.good_bye_check_box);
        CheckBox whrerAreYouCheckBox = (CheckBox) findViewById(R.id.whrer_are_you_check_box);

        // declare edit text for fifth question
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String editText1 = editText.getText().toString();


        if (playRadioButton.isChecked())
            scoreAnswers += 5;

        if (isTryingRadioButton.isChecked())
            scoreAnswers = scoreAnswers + 5;

        if (dancedCheckBox.isChecked() && couldBarkCheckBox.isChecked() && !todayCheckBox.isChecked() && !noVerbCheckBox.isChecked())
            scoreAnswers = scoreAnswers + 5;


        if (goodMorningCheckBox.isChecked() && helloCheckBox.isChecked() && goodByeCheckBox.isChecked() && !whrerAreYouCheckBox.isChecked())
            scoreAnswers = scoreAnswers + 5;


        if (editText1.equalsIgnoreCase(getString(R.string.no)))
            scoreAnswers = scoreAnswers + 5;

        return scoreAnswers;

    }


    public void reset(View view) {
        // declare first radio Group
        RadioGroup radioGroupSecond = (RadioGroup) findViewById(R.id.radio_group_second);

        // declare first radio Group
        RadioGroup radioGroupFirst = (RadioGroup) findViewById(R.id.radio_group_first);

        // declare check box for third question
        CheckBox dancedCheckBox = (CheckBox) findViewById(R.id.danced_check_box);
        CheckBox couldBarkCheckBox = (CheckBox) findViewById(R.id.could_bark_check_box);
        CheckBox todayCheckBox = (CheckBox) findViewById(R.id.today_check_box);
        CheckBox noVerbCheckBox = (CheckBox) findViewById(R.id.no_verb_check_box);

        //declare check box for fourth question
        CheckBox goodMorningCheckBox = (CheckBox) findViewById(R.id.good_morning_check_box);
        CheckBox helloCheckBox = (CheckBox) findViewById(R.id.hello_check_box);
        CheckBox goodByeCheckBox = (CheckBox) findViewById(R.id.good_bye_check_box);
        CheckBox whrerAreYouCheckBox = (CheckBox) findViewById(R.id.whrer_are_you_check_box);

        // declare edit text for fifth question
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String editText1 = editText.getText().toString();

        // clear radio buttons after submit
        radioGroupFirst.clearCheck();
        radioGroupSecond.clearCheck();

        // clear checks boxes after submit
        dancedCheckBox.setChecked(false);
        couldBarkCheckBox.setChecked(false);
        todayCheckBox.setChecked(false);
        noVerbCheckBox.setChecked(false);
        goodByeCheckBox.setChecked(false);
        helloCheckBox.setChecked(false);
        goodMorningCheckBox.setChecked(false);
        goodByeCheckBox.setChecked(false);
        whrerAreYouCheckBox.setChecked(false);

        // clear edit text after submit
        editText.setText("");

        scoreAnswers = 0;
        Toast.makeText(this, getString(R.string.score) + scoreAnswers, Toast.LENGTH_SHORT).show();
    }
}


