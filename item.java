/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;
import java.util.List;
import java.util.ArrayList;


public class item{
    String nombre;
    int precio;
    int statataque;
    int statdefensa;
    int statspeed;
    int statluck;
    int statsalud;
    
    public item(String nombre,int price, int statataque, int statdefensa, int statspeed,int statluck,int statsalud){
        this.nombre = nombre;
        precio = price;
        this.statataque = statataque;
        this.statdefensa = statdefensa;
        this.statluck = statluck;
        this.statsalud = statsalud;
        this.statspeed = statspeed;
        
    }
    public String imprimir(){
        String mensaje = this.nombre;
        mensaje = mensaje + "PRECIO " + precio;
        if (this.statataque > 0){
            mensaje = mensaje + "ATK " + statataque;
            
        }
        if (this.statdefensa > 0){
            mensaje = mensaje + "DEF " + statdefensa;
            
        }
        if (this.statsalud > 0){
            mensaje = mensaje + "Salud " + statsalud;
            
        }
        if (this.statluck > 0){
            mensaje = mensaje + "Suerte " + statluck;
            
        }
        if (this.statspeed > 0){
            mensaje = mensaje + "Velocidad " + statspeed;
            
        }
        return mensaje;
    }
}
    