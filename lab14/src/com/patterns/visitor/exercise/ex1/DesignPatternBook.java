package com.patterns.visitor.exercise.ex1;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Resource of design pattern book";
    }

    public String getBestSeller() {
        return "The best Seller of design pattern book";
    }
}
