package com.cydeo.solid.openClosed.example1.bad;

import java.util.List;

public class DrawShape {

    public void draw(List<Object> shapes) {

        for (Object shape : shapes) {

            if (shape instanceof Circle) {
                System.out.println("Drawing a circle.");
            }

            if (shape instanceof Rectangle) {
                System.out.println("Drawing a rectangle.");
            }
// if later on another shape appears, only one statement will be needed. It may mess up everything in some situations
          /*  if (shape instanceof Triangle) {
                System.out.println("Drawing a rectangle.");
            }*/
        }

    }

}
