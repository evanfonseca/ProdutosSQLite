package com.example.enfonseca.produtossqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class Inserir extends AppCompatActivity {

    EditText nome,preco;
    Button inserir;
    DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);

        db = new DatabaseHandler(this);


        nome = (EditText) findViewById(R.id.nome);

        preco = (EditText) findViewById(R.id.preco);

        inserir= (Button) findViewById(R.id.inserir);

        inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n= nome.getText().toString();
                double pr=Double.parseDouble(preco.getText().toString());

                Produto p = new Produto(n,pr);


                long id=db.addPruduto(p);
                Toast.makeText(Inserir.this, "Foi inserido um produto com o ID: "+id,Toast.LENGTH_LONG).show();

            }
        });




    }







}
