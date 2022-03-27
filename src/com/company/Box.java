package com.company;

public class Box<Box> {
    private Box var;

    public Box() {
    }

    public Box(Box var) {
        this.var = var;
    }

    public Box getVar() {
        return var;
    }

    public void setVar(Box var) {
        this.var = var;
    }

    public static <Box> Box method(Box box) {
        return box;
    }

    @Override
    public String toString() {
        return " " + var;
    }
}
