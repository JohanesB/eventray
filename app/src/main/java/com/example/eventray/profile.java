package com.example.eventray;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class profile extends Fragment implements AdapterView.OnItemSelectedListener {
    Button button;


    public profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);

        Spinner spinnerac=view.findViewById(R.id.email_phone);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(
                getActivity().getApplicationContext(),
                R.array.email_phone,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerac.setAdapter(adapter);
        spinnerac.setOnItemSelectedListener(this);

        button=(Button) view.findViewById(R.id.buttonp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),manage_profile.class);
                startActivity(intent);
            }
        });
        return view;




    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
