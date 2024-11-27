package com.tweak.fragments.frag;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tweak.fragments.MainActivity2;
import com.tweak.fragments.R;

public class FirstFrag extends Fragment {

    public FirstFrag() {
        // Required empty public constructor
    }

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);

        tv=view.findViewById(R.id.textview);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), MainActivity2.class);
                startActivity(intent);
            }
        });



        return view;
    }
}
