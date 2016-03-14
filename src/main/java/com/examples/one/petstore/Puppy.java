
package com.examples.one.petstore;

public class Puppy {
    private int id;
    private String name;
    private String breed;
    private boolean loadBark;
    private int exerciseRequiredPerDay;
    private boolean friendlyWithChildren;
    
    
    //GETTERS
    
    public void getID(int id){
        id = this.id;
    }
    
     public void getName(String name){
        name = this.name;
    }
     
      public void getBreed(String br){
        br = this.breed;
    }
      
       public void getLoadBark(boolean lb){
        lb = this.loadBark;
    }
       
        public void getExercise(int erpd){
        erpd = this.exerciseRequiredPerDay;
    }
        
        public void getFriendly(boolean fwc){
        fwc = this.friendlyWithChildren;
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
