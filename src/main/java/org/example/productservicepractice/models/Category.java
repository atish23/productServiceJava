package org.example.productservicepractice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

// This class is a model for the Category object
@Getter
@Setter
public class Category {
    private long id;
    private String title;

    public Category(String category) {
        this.title = category;
        this.id = Math.abs(new Random().nextLong());
    }
}
//git remote set-url origin https://atish23@github.com/atish23/productsServiceJava.git
//https://github.com/atish23/productsServiceJava.git

//git@github.com-personal:personal-atish23/productsServiceJava.git