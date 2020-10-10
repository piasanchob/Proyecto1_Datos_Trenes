/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Andrey Sancho
 */
public class player {
    int dinero;
    int statataque;
    int statdefensa;
    int statspeed;
    int statluck;
    int statsalud;
    public player(int dinero,int statataque, int statdefensa, int statspeed, int statluck,int statsalud){
        this.dinero  = dinero;
        this.statataque = statataque;
        this.statdefensa = statdefensa;
        this.statluck = statluck;
        this.statsalud = statsalud;
        this.statspeed = statspeed;
    }
    public void comprar(item precioproducto,item atq,item def,item speed,item luck,item salud){
       dinero = dinero - precioproducto.precio;
       statataque = statataque + atq.statataque;
       statdefensa = statdefensa + def.statdefensa;
       statspeed = statspeed + speed.statspeed;
       statluck = statluck + luck.statluck;
       statsalud = statsalud + salud.statsalud;
       //PreguntarObando
       
    }
    public void vender(inventory precioprodu){
        dinero = dinero + precioprodu.precio;
        //Eliminar item del inventario preguntar Obando
        
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
