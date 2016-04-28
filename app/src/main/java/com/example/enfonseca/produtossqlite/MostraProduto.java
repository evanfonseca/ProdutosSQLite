package com.example.enfonseca.produtossqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MostraProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_produto);

        String id=getIntent().getExtras().getString("ID");

        Toast.makeText(MostraProduto.this, "ID: "+id, Toast.LENGTH_LONG).show();
    }
}
