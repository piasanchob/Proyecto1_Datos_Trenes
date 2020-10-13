/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import java.util.ArrayList;

/**
 *
 * 
 */
public class player {
    int dinero;
    int statataque;
    int statdefensa;
    int statspeed;
    int statluck;
    int statsalud;
    inventory inventario;
    ArrayList <item> listaitems;
    item equipado;
    public player(int dinero,int statataque, int statdefensa, int statspeed, int statluck,int statsalud){
        this.dinero  = dinero;
        this.statataque = statataque;
        this.statdefensa = statdefensa;
        this.statluck = statluck;
        this.statsalud = statsalud;
        this.statspeed = statspeed;
        this.listaitems = new ArrayList <item>();
        this.equipado = null;
    }
    public void comprar(item item){
       dinero = dinero - item.precio;
       listaitems.add(item);
       
    }
    public void vender(int index){
        //this.vender(item);Shop.listainventario.remove(item);
        item item = listaitems.remove(index);
        dinero = dinero + item.precio;
    
        
        
        
        
        
    }
    public void equipar(int index){
       if (equipado != null){
           listaitems.add(equipado);
           statataque = statataque - equipado.statataque;
           statdefensa = statdefensa - equipado.statdefensa;
           statspeed = statspeed - equipado.statspeed;
           statluck = statluck - equipado.statluck;
           statsalud = statsalud - equipado.statsalud;    
       }
       item item = listaitems.remove(index);
       
       equipado = item;
       
       statataque = statataque + item.statataque;
       statdefensa = statdefensa + item.statdefensa;
       statspeed = statspeed + item.statspeed;
       statluck = statluck + item.statluck;
       statsalud = statsalud + item.statsalud;
       
       
        
    }
    public void desequipar(){
       
       equipado = null;
       
        
    }
    public void imprimir(){
        System.out.println("Dinero = " + dinero);
        System.out.println("Ataque = " + statataque);
        System.out.println("Defensa = " + statdefensa);
        System.out.println("Velocidad = " + statspeed);
        System.out.println("Suerte = " + statluck);
        System.out.println("Salud = " + statsalud);
        
    }
    
}
