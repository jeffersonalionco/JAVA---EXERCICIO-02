/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.biblioteca.biblioteca;

/**
 *
 * @author ti01.mtz
 */
public class Livro {
    private String titulo;
    private String genero ;
    private String anoPublic;
    private boolean estaDisponivel;

    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    
    public String anoPublic(){
        return anoPublic;
    }
    public void setAnoPublic(String anoPublic){
        this.anoPublic = anoPublic;
    }

    
    public boolean getEstaDisponivel(){
        return estaDisponivel;
    }
    public void setEstaDisponivel(boolean estaDisponivel){
        this.estaDisponivel = estaDisponivel;
    }
}
