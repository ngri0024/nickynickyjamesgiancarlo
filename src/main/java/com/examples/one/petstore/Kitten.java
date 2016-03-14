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
    
    public int getID(){
        return this.id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void newKitten(){
        
        this.id = 123;
        this.breed = "Persian";
        this.name = "James";
        this.sensitiveToFeeding = false;
    }
}
