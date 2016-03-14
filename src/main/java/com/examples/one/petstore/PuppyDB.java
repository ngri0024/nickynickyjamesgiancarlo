/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicky
 */

/*Properties
 i. Puppies: ArrayList<Puppy>
 b. Methods
 i. addPuppy(Puppy) : boolean
 ii. delPuppy(id) : boolean
 iii. getPuppy(id) : Puppy
 iv. countPuppies() : int*/
public class PuppyDB {

    List<Puppy> puppies = new ArrayList<Puppy>();

    public boolean addPuppy(Puppy p) {
        if (puppies.size() == 10) {
            puppies.add(p);
            return true;
        } else {
            return false;
        }

    }

    public boolean delPuppy(int id) {
        for (Puppy p : puppies) {
            if (p.getID() == id) {
                puppies.remove(p);
                return true;//autommatically breaks
            }
        }
        return false;
    }

    public Puppy getPuppy(int id) {
        for (Puppy p : puppies) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }

    public int countPuppies() {

        return puppies.size();
    }

}
