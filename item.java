/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;
import java.util.List;
import java.util.ArrayList;


public class item{
    
    int precio;
    int statataque;
    int statdefensa;
    int statspeed;
    int statluck;
    int statsalud;
    public item(int price, int statataque, int statdefensa, int statspeed,int statluck,int statsalud){
        precio = price;
        this.statataque = statataque;
        this.statdefensa = statdefensa;
        this.statluck = statluck;
        this.statsalud = statsalud;
        this.statspeed = statspeed;
    }
}
    