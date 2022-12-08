/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejodeprodutos;

/**
 *
 * @author Kevin Rivas
 */
public class Precios extends Producto {
    private double Cantidad;
    private double Precio;
    
 public Precios(){
    }
 public Precios(String Codigo, String Nombre, double Cantidad, double Precio){
     this.setCodigo(Codigo);
     this.setNombre(Nombre);
     this.setCantidad(Cantidad);
     this.setPrecio(Precio);
     
  }
 public Precios(double Cantidad, double Precio, double Total){
  this.setCantidad(Cantidad);
  this.setPrecio(Precio);
  
  }
 
public void setCantidad(double Cantidad){
    this.Cantidad = Cantidad;
} 
public void setPrecio(double Precio){
    this.Precio = Precio;
} 

public double getCantidad(){
    return this.Cantidad;
}
public double getPrecio(){
    return this.Precio;
}


    String getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
