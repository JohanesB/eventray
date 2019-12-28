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
import android.widget.Toast;
import android.content.Context;

/**
 * A simple {@link Fragment} subclass.
 */
public class search extends Fragment implements AdapterView.OnItemSelectedListener {
    Button button;

    public search() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_search, container, false);
        Spinner time_works=view.findViewById(R.id.time_works);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(
                getActivity().getApplicationContext(),
                R.array.time_works,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        time_works.setAdapter(adapter);
        time_works.setOnItemSelectedListener(this);

        Spinner spnr=view.findViewById((R.id.spinner));
        ArrayAdapter<CharSequence> b= ArrayAdapter.createFromResource(
                getActivity().getApplicationContext(),
                R.array.time_works,
                android.R.layout.simple_spinner_item
        );
        b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnr.setAdapter(b);
        spnr.setOnItemSelectedListener(this);

        Spinner spinner=view.findViewById((R.id.spinner2));
        ArrayAdapter<CharSequence> a= ArrayAdapter.createFromResource(
                getActivity().getApplicationContext(),
                R.array.sounds_good,
                android.R.layout.simple_spinner_item
        );
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnr.setAdapter(a);
        spnr.setOnItemSelectedListener(this);

       button=(Button) view.findViewById(R.id.buttonn);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(),search_for.class);
               startActivity(intent);
           }
       });
       return view;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
