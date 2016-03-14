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

    private int id;
    private String name;
    private String breed;
    private boolean loadBark;
    private int exerciseRequiredPerDay;
    private boolean friendlyWithChildren;
    
    
    //SETTERS
    public void setID(int id){
        this.id=id;
    }
    public void newPup() {
        this.id = 0;
        this.name = "labrador";
        this.breed = "pitbul";
        this.loadBark = true;
        this.exerciseRequiredPerDay = 1;
        this.friendlyWithChildren = true;
    }

    //getters
}
