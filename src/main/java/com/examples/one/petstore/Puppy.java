/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

/**
 *
 * @author Giancarlo
 */
public class Puppy {    
    int id;
    String name;
    String breed;
    boolean loadBark;
    int exerciseRequiredPerDay;
    boolean friendlyWithChildren;
    
    public void newPup(){
        this.id = 0;
        this.name = "bubu";
        this.breed = "pitbul";
        this.loadBark = true;  
        this.exerciseRequiredPerDay = 1;
        this.friendlyWithChildren = true;
    }
    
    public static void main(String args[]){
        Puppy p = new Puppy();
        p.newPup();
    }
   
}
