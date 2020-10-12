package com.mycompany.tienda;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class shop {
    
    ArrayList <item> listaitems = new ArrayList <item>();
    ArrayList <inventory> listainventario = new ArrayList <inventory>();
    public shop(){
        
    }
    void additem(item item){
        listaitems.add(item);
    }
    void addinventory(inventory in){
        listainventario.add(in);
    }
    item comprar(int index){
        //item comprado = listaitems.get(index);
        //listainventario.add();
        return listaitems.remove(index);
        
    }
    inventory vender(int index){
        return listainventario.remove(index);
    }
  
}

