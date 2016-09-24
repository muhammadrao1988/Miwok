package com.example.muhammad.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the view that shows the number category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView family = (TextView)findViewById(R.id.family);
        TextView phrases = (TextView)findViewById(R.id.phrases);
        TextView colors = (TextView)findViewById(R.id.colors);

        /*Method 1 OnclickListenr*/
        //creating object numberClickListenr
        //NumbersClickListener clickListener = new NumbersClickListener();
        //set a click listener on that View
        //numbers.setOnClickListener(clickListener);

        /*Method 2*/
        //numbers.setOnClickListener(new NumbersClickListener());

        /*Method 3*
        /calling numbers onclicklistner
         */
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect to NumbersActivity
                Intent intentNumber = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intentNumber);
            }
        });
        //family onclickListener
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect to FamilyActivity
                Intent intentFamily = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(intentFamily);
            }
        });
        //phrases onclickListener
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect to PhrasesActivity
                Intent intentPhrases = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intentPhrases);
            }
        });
        //colors onclickListener
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //redirect to ColorsActivity
                Intent intentColors = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intentColors);
            }
        });












    }
    //OnClick Function. Shows Numbers activity when click on numbers textview
    public void openNumberList(View view){
        Intent intentNumber = new Intent(MainActivity.this,NumbersActivity.class);
        startActivity(intentNumber);
    }
}
