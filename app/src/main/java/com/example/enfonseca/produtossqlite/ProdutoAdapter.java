package com.example.enfonseca.produtossqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by enfonseca on 26/04/16.
 */
public class ProdutoAdapter extends ArrayAdapter<String> {


    Context context;
    String [] ids;
    String [] nomes;
    String [] precos;

    ProdutoAdapter(Context c, String [] Ids, String [] Nomes, String[] Precos){
        super(c, R.layout.linha_item_produto,R.id.t_nome,Nomes);
        this.context=c;
        this.ids=Ids;
        this.nomes=Nomes;
        this.precos=Precos;
    }

    @Override
    public View getView(int position,View ConvertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.linha_item_produto,parent,false);


        TextView mNome= (TextView) row.findViewById(R.id.t_nome);
        TextView  mId= (TextView) row.findViewById(R.id.t_id);
        TextView  mPreco= (TextView) row.findViewById(R.id.t_preco);


        mNome.setText(nomes[position]);

        mId.setText(ids[position]);

        mPreco.setText(precos[position]);


        return row;
    }

}
