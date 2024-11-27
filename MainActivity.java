package com.tweak.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

import com.tweak.fragments.frag.FirstFrag;
import com.tweak.fragments.frag.SecondFreg;

public class MainActivity extends AppCompatActivity {

    Button btnFirst, btnSecond;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnFirst = findViewById(R.id.btn1);
        btnSecond = findViewById(R.id.btn2);
        linearLayout = findViewById(R.id.linLay);


        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFrag firstFrag = new FirstFrag();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linLay, firstFrag);
                transaction.commit();
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFreg secondFrag = new SecondFreg();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linLay, secondFrag);
                transaction.commit();
            }
        });
    }
}