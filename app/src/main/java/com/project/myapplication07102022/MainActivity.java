package com.project.myapplication07102022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void alterarTexto(View view){

        TextView texto = findViewById(R.id.textoExibicao); /* criando referencia ou seja texto recebe, para textview dps coloca apelido ex; texto dps = findViewById encontre uma view ou componente da tela pelo ID, dps acesso id da foram que foi colocado dentro do parentes*/
        texto.setText("Realizado com Sucesso"); /* Pego referencia que criei texto, dps faço setText ou seja confiurar um texto */
    }
}

