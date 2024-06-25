package sbertech.svm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Human {
    private final Parrot parrot1;
    private final Parrot parrot2;
    private final Cat cat;
    private final Dog dog;

    @Autowired
    public Human(Parrot parrot1, Parrot parrot2, Cat cat, Dog dog) {
        this.parrot1 = parrot1;
        this.parrot2 = parrot2;
        this.cat = cat;
        this.dog = dog;
        System.out.println("Успех");
    }
}