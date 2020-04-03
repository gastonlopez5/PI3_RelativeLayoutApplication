package com.example.pi3_relativelayoutapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imagen;
    private int orden = 1;
    private Button adelante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        imagen = findViewById(R.id.foto);

        adelante = findViewById(R.id.btAdelante);
        adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (orden){
                    case 1: imagen.setImageResource(R.drawable.img2);
                        orden++;
                        break;

                    case 2: imagen.setImageResource(R.drawable.img3);
                        orden++;
                        break;

                    case 3: imagen.setImageResource(R.drawable.img4);
                        orden++;
                        break;

                    case 4: imagen.setImageResource(R.drawable.img4);
                        orden = 4;
                        break;
                }
            }
        });
    }

    public void retrocer(View v){
        switch (orden){
            case 1: imagen.setImageResource(R.drawable.img1);
                orden = 1;
                break;

            case 2: imagen.setImageResource(R.drawable.img1);
                orden--;
                break;

            case 3: imagen.setImageResource(R.drawable.img2);
                orden--;
                break;

            case 4: imagen.setImageResource(R.drawable.img3);
                orden--;
                break;
        }
    }
}
