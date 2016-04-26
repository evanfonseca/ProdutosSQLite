package com.example.enfonseca.produtossqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListarProdutos extends AppCompatActivity {

    DatabaseHandler db;
    ListView list;

    String [] ids;
    String [] nomes;
    String [] precos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos);



        db = new DatabaseHandler(this);
        list= (ListView) findViewById(R.id.listView);

        ProdutoAdapter adapter = new ProdutoAdapter(this,ids,nomes,precos);
        list.setAdapter(adapter);



        //Toast.makeText(ListarProdutos.this, "Lendo todos os produtos..", Toast.LENGTH_LONG).show();
        List<Produto> ListaProdutos = db.getAllProdutos();
        int i=0;
        for (Produto p: ListaProdutos) {
            String log = "Id: "+p.getId()+" ,Nome: " + p.getNome() + " ,Preço: " + p.getPreco();
            // Writing Contacts to log
            //Log.d("Name: ", log);
            ids[i]=p.getNome();
            nomes[i]=p.getNome();
            precos[i]=p.getNome();
            i++;

            //Toast.makeText(ListarProdutos.this, log,Toast.LENGTH_LONG).show();
        }




    }
}