/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejodeprodutos;

/**
 *
 * @Kevin Rivas
 */
public class Producto {
    private String Codigo;
    private String Nombre;
    
    public Producto(){
    
    }
    
    public Producto(String Codigo, String Nombre){
        this.setCodigo(Codigo);
        this.setNombre(Nombre);
    
    }
    public void setCodigo(String Codigo){
    this.Codigo = Codigo;
    
    }
    public void setNombre(String Nombre){
    this.Nombre = Nombre;
    }
    public String getCodigo(){
    return this.Codigo;
    }
    public String getNombre(){
    return this.Nombre;
    }
}
