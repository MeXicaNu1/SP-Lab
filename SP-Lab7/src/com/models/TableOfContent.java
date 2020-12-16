package com.models;

public class TableOfContent implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}