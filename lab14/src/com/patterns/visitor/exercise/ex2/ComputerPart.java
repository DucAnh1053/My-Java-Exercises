package com.patterns.visitor.exercise.ex2;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
