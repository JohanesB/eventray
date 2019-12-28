package com.example.eventray;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class e_organizer extends Fragment {
    private TextInputLayout etextInputemail;
    private TextInputLayout etextInputpassword;
    Button button;

    public e_organizer() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_e_organizer, container, false);
        etextInputemail=view.findViewById(R.id.etxt_email);
        etextInputpassword=view.findViewById(R.id.etxt_password);


        button=(Button) view.findViewById(R.id.econfirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validateEmail()|!validatePassword()){
                    return;
                }
                Intent intent=new Intent(getActivity(),mainevent_organizer.class);
                startActivity(intent);
            }
        });


        return view;
    }



    private boolean validateEmail(){
        String emaiInput=etextInputemail.getEditText().getText().toString().trim();
        if (emaiInput.isEmpty()){
            etextInputemail.setError("Fild can't empty");
            return false;
        }else {
            etextInputemail.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String passwordInput=etextInputpassword.getEditText().getText().toString().trim();
        if (passwordInput.isEmpty()){
            etextInputpassword.setError("Fild can't empty");
            return false;
        }else{
            etextInputpassword.setError(null);
            return true;
        }

    }


}
