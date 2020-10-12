/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;



//Aquí pretendo importar el archivo items.java

public class Main {
    public static void main(String[] args){
    
    //inventory inventario = new inventory();
    //inventario.crearInventorio();
    player Player1 = new player(1000,10,0,60,20,0);
    shop shop = new shop();
    
    
    item espada = new item("Espada",100,100,0,0,30,0);
    item escudo = new item("Escudo",80,0,100,0,80,0);
    item pocionCorazones = new item ("Pocion Corazones",50,0,30,0,50,100);
    item pocionVelocidad = new item("Pocion Velocidad",30,0,0,100,30,0);
    item pocionConjuro = new item("Pocion Conjuro",60,100,0,0,100,0);
    
    shop.additem(espada);
    shop.additem(escudo);
    shop.additem(pocionCorazones);
    shop.additem(pocionVelocidad);
    shop.additem(pocionConjuro);
    
    Player1.comprar(pocionConjuro);
    item pistola = new item("Pistola",100,100,0,0,0,0);
    inventory lampara = new inventory("Lampara",30);
    inventory latigo = new inventory("Latigo",100);
    inventory armadura = new inventory("Armadura",100);
    inventory medicina = new inventory("Medicina",50);
    inventory pocionV = new inventory("Pocion",40);
    Player1.vender(armadura);
    lampara.imprimirinventario();
    ArrayList<item>listai = new ArrayList();
    listai.add(pocionCorazones);
    listai.add(espada);
    listai.add(escudo);
    listai.add(pistola);
    

        
    
    
    
    //preguntarOb
    Player1.imprimir();
    DefaultListModel modelo = new DefaultListModel();
    gui gui = new gui(Player1,shop);
    for (int i = 0 ; i < listai.size(); i++ ){
    String nombre = listai.get(i).nombre;
    modelo.addElement(nombre);
    
    }
    
    
    gui.inventario.setModel(modelo);
    gui.setVisible(true);
    }
}
    
