package com.example.enfonseca.produtossqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListarProdutos extends AppCompatActivity {

    DatabaseHandler db;
    ListView list;

    String [] ids;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos);



        db = new DatabaseHandler(this);
        list= (ListView) findViewById(R.id.listView);






        Toast.makeText(ListarProdutos.this, "Lendo todos os produtos..", Toast.LENGTH_LONG).show();
        List<Produto> ListaProdutos = db.getAllProdutos();

        int N=ListaProdutos.size();
        Toast.makeText(ListarProdutos.this, " total: "+N,Toast.LENGTH_LONG).show();

        ids= new String[N];
        String [] nomes= new String[N];
        String [] precos = new String[N];;

        int i=0;
        for (Produto p: ListaProdutos) {
            String log = "Id: "+p.getId()+" ,Nome: " + p.getNome() + " ,Preço: " + p.getPreco();
            // Writing Contacts to log
            //Log.d("Name: ", log);
            ids[i]=""+p.getId();
            nomes[i]=p.getNome();
            precos[i]=""+p.getPreco();
            i++;

            //Toast.makeText(ListarProdutos.this, log,Toast.LENGTH_LONG).show();
        }

        final ProdutoAdapter adapter = new ProdutoAdapter(this,ids,nomes,precos);

        list.setAdapter(adapter);

        // ListView on item selected listener.
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                //Toast.makeText(ListarProdutos.this, ""+position, Toast.LENGTH_SHORT).show();

                String ID = ids[position];



                Intent intent = new Intent(ListarProdutos.this,MostraProduto.class);
                intent.putExtra("ID", ID);

                startActivity(intent);
            }
        });

    }
}
