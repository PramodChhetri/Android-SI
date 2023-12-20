package com.example.activity_simpleinterest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_SimpleInterest extends Fragment {
    EditText etPrincipal,etRate,etTime;
    Button btCalulate;
    TextView tvResult;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_simpleinterest,container,false);

        etPrincipal=view.findViewById(R.id.etPrincipal);
        etRate=view.findViewById(R.id.etRate);
        etTime=view.findViewById(R.id.etTime);

        btCalulate=view.findViewById(R.id.btCalculate);
        tvResult=view.findViewById(R.id.tvResult);

        btCalulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int princpal=Integer.parseInt(etPrincipal.getText().toString());
                int rate=Integer.parseInt(etRate.getText().toString());
                int time=Integer.parseInt(etTime.getText().toString());

                int si=(princpal*rate*time)/100;

                tvResult.setText("Simple Intrest is: "+si);
            }
        });




        return view;
    }
}
