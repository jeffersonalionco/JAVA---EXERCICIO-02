/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.biblioteca.Autor;

/**
 *
 * @author ti01.mtz
 */

public class Autor {
    private String nome;
    private String nascionalidade;
    private String datNasc;
    private boolean estaVivo;
    private String datObto;
    private String cidadeNasc;

    
    // Metodos Getters
    public String getNome() {
        return nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public String getDatNasc() {
        return datNasc;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public String getDatObto() {
        return datObto;
    }

    public String getCidadeNasc() {
        return cidadeNasc;
    }

    
    
    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public void setDatNasc(String datNasc) {
        this.datNasc = datNasc;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setDatObto(String datObto) {
        this.datObto = datObto;
    }

    public void setCidadeNasc(String cidadeNasc) {
        this.cidadeNasc = cidadeNasc;
    }
    
    
    
    
    

}
