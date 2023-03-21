package com.paradeeez.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    Intent intent = getIntent();
    int data;
    int option = intent.getIntExtra("option", data);

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);

        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions : "+totalQuestion);

        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){

            if(selectedAnswer.equals(Animals.getCorrectAnswersAnimal(currentQuestionIndex))){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }

    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }

        int randomAnsA = rand.nextInt(QuestionAnswer.choices.length);
        int randomAnsB = rand.nextInt(QuestionAnswer.choices.length);
        int randomAnsC = rand.nextInt(QuestionAnswer.choices.length);
        int randomAnsD = rand.nextInt(QuestionAnswer.choices.length);

        while (randomAnsA == randomAnsB || randomAnsA == randomAnsC || randomAnsA == randomAnsD) {
            randomAnsA = rand.nextInt(QuestionAnswer.choices.length);
        }
        while (randomAnsB == randomAnsA || randomAnsB == randomAnsC || randomAnsB == randomAnsD) {
            randomAnsB = rand.nextInt(QuestionAnswer.choices.length);
        }
        while (randomAnsC == randomAnsA || randomAnsC == randomAnsB || randomAnsC == randomAnsD) {
            randomAnsC = rand.nextInt(QuestionAnswer.choices.length);
        }

//        if(option == 5) {
//            ansA.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsA));
//            ansB.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsB));
//            ansC.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsC));
//            ansD.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsD));
//
//        }else {
//            ansA.setText(QuestionAnswer.getChoices(currentQuestionIndex, randomAnsA));
//            ansB.setText(QuestionAnswer.getChoices(currentQuestionIndex, randomAnsB));
//            ansC.setText(QuestionAnswer.getChoices(currentQuestionIndex, randomAnsC));
//            ansD.setText(QuestionAnswer.getChoices(currentQuestionIndex, randomAnsD));
//        }

        ansA.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsA));
        ansB.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsB));
        ansC.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsC));
        ansD.setText(Animals.getChoicesAnimal(currentQuestionIndex, randomAnsD));
    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Congratulations you pass!";
        }else{
            passStatus = "Failed, you can try again later.";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();

    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }

}
