package com.example.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String [] questions ={"1.Java is a Person?","2.Java was introduced in 1823?",
            "3.Java was created using python?", "4.Java has abstract classes?", "5.Java supports interface?"};
    private final boolean [] answers ={false,false,false,true,true};
    private int score=0;
    private int index=0;
    Button yes;
    Button no;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(view -> {
            //if the array is not going out of bounds
            if(index<=questions.length-1){
                //if you have given correct answer
                if(answers[index]){
                    score++;
                }
                index++;
                if(index<=questions.length-1){
                    question.setText(questions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your Score is "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "Restart the app to play again! ", Toast.LENGTH_SHORT).show();
            }
        });
        no.setOnClickListener(view -> {
            //if the array is not going out of bounds
            if(index<=questions.length-1){
                //if you have given correct answer
                if(!answers[index]){
                    score++;
                }
                index++;
                if(index<=questions.length-1){
                    question.setText(questions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your Score is "+score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "Restart the app to play again! ", Toast.LENGTH_SHORT).show();
            }

        });


    }
}