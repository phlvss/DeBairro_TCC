package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuporteConfiguracaoActivity extends AppCompatActivity {

private Button voltarso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suporte_configuracao_layout);

        voltarso = findViewById(R.id.btn_Voltarconfsuporte);
        voltarso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SuporteConfiguracaoActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });
    }
}