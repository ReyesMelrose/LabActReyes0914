package com.reyes.labactreyes0914;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void ll(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/Lovers.Lane.UST/"));
        startActivity(i);
    }
    public void qpark(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://ph21stcenturypark.blogspot.com/2012/10/ust-quadri-park.html"));
        startActivity(i);
    }
    public void arch(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Arch_of_the_Centuries"));
        startActivity(i);
    }
    public void field(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Field"));
        startActivity(i);
    }
}
