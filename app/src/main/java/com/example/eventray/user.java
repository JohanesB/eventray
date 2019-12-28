package com.example.eventray;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.google.android.material.textfield.TextInputLayout;


public class user extends Fragment {

    private TextInputLayout textInputemail;
    private TextInputLayout textInputpassword;
    Button button;






    public user() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_user, container, false);
        textInputemail=view.findViewById(R.id.etxt_email);
        textInputpassword=view.findViewById(R.id.etxt_password);


        button=(Button) view.findViewById(R.id.econfirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validateEmail()|!validatePassword()){
                    return;
                }
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }



    private boolean validateEmail(){
        String emaiInput=textInputemail.getEditText().getText().toString().trim();
        if (emaiInput.isEmpty()){
            textInputemail.setError("Fild can't empty");
            return false;
        }else {
            textInputemail.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String passwordInput=textInputpassword.getEditText().getText().toString().trim();
        if (passwordInput.isEmpty()){
            textInputpassword.setError("Fild can't empty");
            return false;
        }else{
            textInputpassword.setError(null);
            return true;
        }

    }


    }


