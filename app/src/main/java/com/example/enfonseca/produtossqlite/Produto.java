package com.example.enfonseca.produtossqlite;

/**
 * Created by enfonseca on 26/04/16.
 */
public class Produto {

    int id;
    String nome;
    double preco;
    String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }


    public Produto(int id, String nome, double preco, String desc) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.desc = desc;
    }

    public Produto(String nome, double preco, String desc) {
        this.nome = nome;
        this.preco = preco;
        this.desc = desc;
    }



}
