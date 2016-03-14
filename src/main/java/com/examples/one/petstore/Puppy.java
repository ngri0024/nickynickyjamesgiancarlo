
package com.examples.one.petstore;

public class Puppy {
    private int id;
    private String name;
    private String breed;
    private boolean loadBark;
    private int exerciseRequiredPerDay;
    private boolean friendlyWithChildren;
    
    
    //GETTERS
    
    public int getID(){
        return this.id;
    }
    
     public String getName(){
        return this.name;
    }
     
      public String getBreed(){
        return this.breed;
    }
      
       public Boolean getLoadBark(){
        return this.loadBark;
    }
       
        public int getExercise(){
        return this.exerciseRequiredPerDay;
    }
        
        public Boolean getFriendly(){
        return this.friendlyWithChildren;
    }
    //SETTERS
    public void setID(int id){
        this.id=id;
    }
    
    
     public void setName(String name){
        this.name = name;
    }
     
      public void setBreed(String br){
        this.breed = br;
    }
      
       public void setLoadBark(boolean lb){
        this.loadBark = lb;
    }
       
        public void setExercise(int erpd){
        this.exerciseRequiredPerDay = erpd;
    }
        
        public void setFriendly(boolean fwc){
        this.friendlyWithChildren = fwc;
    }
        
    public void newPup() {
        this.id = 0;
        this.name = "labrador";
        this.breed = "pitbul";
        this.loadBark = true;
        this.exerciseRequiredPerDay = 1;
        this.friendlyWithChildren = true;
    }

}
