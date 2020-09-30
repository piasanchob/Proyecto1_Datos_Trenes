/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;
import java.util.List;
import java.util.ArrayList;


public class item{     //Estos son los atributos de la clase
    private int atq;
    private int def;
    private int hp;
    private int luk;
    private int vel;


    /*
    La idea es que todos los items tengan todos los stats pero en caso de que no se ocupen,
    se les pone 0. 

    Por ejemplo un item de atq tendría def 0.
    */


    public item(int atq, int def, int hp, int lck, int vel){ //aquí va el constructor

        super();

        this.atq = atq;
        this.def = def;
        this.hp = hp;
        this.luk = lck;
        this.vel = vel;
        
        /*ArrayList<item> listaitemsatq = new ArrayList<item>();

        item item01_atq = new item(50,0,5,0,5);
        item item02_atq = new item(75,0,10,5,0);
        item item03_atq = new item(85,10,25,0,0);
        item item04_atq = new item(100,20,0,0,0);
        item item05_atq = new item(105,0,15,25,5);


        ArrayList<item> listaitemsdef = new ArrayList<item>();

        item item01_def = new item(0,75,0,0,5);
        item item02_def = new item(0,100,0,0,10);
        item item03_def = new item(0,105,0,25,0);
        item item04_def = new item(0,125,0,0,40);
        item item05_def = new item(0,85,0,25,50);
        System.out.println(listaitemsatq);
        System.out.println(listaitemsdef);*/

    }
    
    //item item1 = new item(50,0,5,0,0);



}
