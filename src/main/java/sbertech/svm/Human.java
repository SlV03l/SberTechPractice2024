package sbertech.svm;

import java.util.List;

public class Human {
    private List<Parrot> parrots;
    private Cat cat;
    private Dog dog;

    public Human(List<Parrot> parrots, Cat cat, Dog dog) {
        this.parrots = parrots;
        this.cat = cat;
        this.dog = dog;
    }
}
