package com.example.sp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements lista.OnItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
           lista firstFragment = new lista();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.flContainer, firstFragment);
            ft.commit();
        }
    }
    public void onPizzaItemSelected(int position) {
        Detalle secondFragment = new Detalle();

        Bundle args = new Bundle();
        args.putInt("position", position);
        secondFragment.setArguments(args);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flContainer, secondFragment)
                .addToBackStack(null)
                .commit();
    }
}