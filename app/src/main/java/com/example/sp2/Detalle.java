package com.example.sp2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Detalle# newInstance} factory method to
 * create an instance of this fragment.
 */
public class Detalle extends Fragment {

    int position = 0;
    TextView tvTitle;
    TextView tvDetails;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            if (getArguments() != null) {
                position = getArguments().getInt("position", 0);
            }
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle, parent, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        tvDetails = (TextView) view.findViewById(R.id.tvDetails);
        tvTitle.setText(Pizza.pizzaMenu[position]);
        tvDetails.setText(Pizza.pizzaDetails[position]);
    }
    public void updateView(int position) {
        tvTitle.setText(Pizza.pizzaMenu[position]);
        tvDetails.setText(Pizza.pizzaDetails[position]);
    }
}