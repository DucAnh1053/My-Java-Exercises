package com.patterns.visitor.exercise.ex1;

public class JavaCoreBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Resource of java core book";
    }

    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}
