package com.examples.one.petstore;

public class Kitten {
    
    public Kitten(){
    }
    public Kitten(String name,String breed, int id){
        this.name = name;
        this.breed = breed;
        this.id = id;
    }
    
    
    private int id;
    public String name;
    //Persian, Siamese, Bengal
    public String breed;
    public boolean sensitiveToFeeding;
    
    public boolean addKitten(Kitten newKitten){
        
        this.id = newKitten.id;
        this.breed = newKitten.breed;
        this.name = newKitten.name;
        
        return true;
    }
}
