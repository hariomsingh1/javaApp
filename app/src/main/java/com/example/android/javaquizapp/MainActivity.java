package com.example.android.javaquizapp;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String [] questions={"java is a person?","java was introduced in 1233?", "java was created using python?","Java has abstract class?","java supports interface?","Constructor overloading is not possible in Java","Garbage Collection is manual process.","All binary operators except for the assignment operators are evaluated from Left to Right","Java programming is not statically-typed, means all variables should not first be declared before they can be used.","All bitwise operations are carried out with the same level of precedence in Java."};
    private boolean[] answers={false,false,false,true,true,false,false,true,false,false};
    private int  index =0;
    private int score =0;
    Button yes;
    Button no;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        textView=findViewById(R.id.question);


            textView.setText(questions[index]);

            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (index <=answers.length - 1) {
                        if (answers[index]) {
                            score++;

                        }

                        if (index < questions.length - 1) {
                            index++;

                            textView.setText(questions[index]);
                        } else {
                            Toast.makeText(MainActivity.this, "your score: "+score+" /"+questions.length,Toast.LENGTH_SHORT).show();
                            index++;
                        }

                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "restart app to play again", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (index <=answers.length- 1) {
                        if (!answers[index]) {
                            score++;

                        }

                        if (index < questions.length - 1) {
                            index++;


                            textView.setText(questions[index]);
                        } else {
                            Toast.makeText(MainActivity.this, "your score: " + score+" /"+questions.length, Toast.LENGTH_SHORT).show();
                            index++;
                        }


                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "restart app to play again", Toast.LENGTH_SHORT).show();
                    }
                }
            });



    }
}