package com.cydeo.solid.openClosed.example1.good;

import java.util.List;

public class DrawShape {

    public void startDrawing(List<Shape> shapes){

        for (Shape shape: shapes){
            shape.draw();// each class extending Shape has its own implementation of draw(), whenever you create new shape,
            // it will have its own draw() and thus printed here without possibility to affect
        }
    }
}
