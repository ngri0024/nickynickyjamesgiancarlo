package com.examples.one.petstore;

public class Puppy {

    private int id;
    private String name;
    private String breed;
    private boolean loadBark=false;
    private int exerciseRequiredPerDay;
    private boolean friendlyWithChildren=false;

    public Puppy(int id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        int loadR=(int)(Math.random()*1+1);
        int friendR=(int)(Math.random()*1+1);
        exerciseRequiredPerDay=(int)(Math.random()*4+1);
        if(loadR==1){
            loadBark=true;
        }
        if(friendR==1){
            loadBark=true;
        }
        
    }
    //GETTERS

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public Boolean getLoadBark() {
        return this.loadBark;
    }

    public int getExercise() {
        return this.exerciseRequiredPerDay;
    }

    public Boolean getFriendly() {
        return this.friendlyWithChildren;
    }

    //SETTERS

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String br) {
        this.breed = br;
    }

    public void setLoadBark(boolean lb) {
        this.loadBark = lb;
    }

    public void setExercise(int erpd) {
        this.exerciseRequiredPerDay = erpd;
    }

    public void setFriendly(boolean fwc) {
        this.friendlyWithChildren = fwc;
    }
}
