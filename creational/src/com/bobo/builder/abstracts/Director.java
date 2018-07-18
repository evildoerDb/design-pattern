package com.bobo.builder.abstracts;

/**
 * Created by bobo.dou on 2018/7/17 11:05
 */
public class Director {

    public void construct(Builder builder){

        builder.buildA();
        builder.buildB();
    }
}
