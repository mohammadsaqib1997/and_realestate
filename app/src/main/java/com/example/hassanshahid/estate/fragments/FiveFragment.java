package com.example.hassanshahid.estate.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hassanshahid.estate.IconTextTabsActivity;
import com.example.hassanshahid.estate.MainActivity;
import com.example.hassanshahid.estate.MobileVerification;
import com.example.hassanshahid.estate.R;
import com.example.hassanshahid.estate.SecondScreen;


public class FiveFragment extends Fragment {

    public FiveFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.fragment_five, container, false);
        Button b = (Button)V.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),IconTextTabsActivity.class);
                startActivity(it);
            }
        });
        return V;

    }

}
