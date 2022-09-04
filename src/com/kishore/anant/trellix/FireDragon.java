package com.kishore.anant.trellix;

import java.util.concurrent.Callable;

interface Reptile {
    ReptileEgg lay();
}

public class FireDragon implements Reptile, Callable<Reptile> {
    public FireDragon() {
        // TODO document why this constructor is empty
    }

    public ReptileEgg lay(){
        return new ReptileEgg(new FireDragon());
    }

    public static void main(String[] args) throws Exception {
        FireDragon fireDragon = new FireDragon();
        System.out.println(fireDragon instanceof Reptile);
        ReptileEgg egg = fireDragon.lay();
        egg.hatch();
    }

    public Reptile call(){
        return new FireDragon();
    }
}

class ReptileEgg implements Callable<Reptile> {
    public ReptileEgg(Callable<Reptile> createReptile) {


    }

    public Reptile hatch() throws Exception {
        Reptile reptile = new FireDragon();
        return reptile;
    }

    public Reptile call(){
        return new FireDragon();
    }
}
