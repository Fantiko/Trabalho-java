/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jvmfs
 */

import java.util.ArrayList;


public class Cliente {
    private String nome;
    private int idade;
    private String CPF;
    private String endereco;
    private ArrayList<Fichas> fichas;

    public Cliente(String nome, int idade, String CPF, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public void adicionarFicha(Fichas ficha) {
        this.fichas.add(ficha);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Fichas> getFichas() {
        return fichas;
    }
}

