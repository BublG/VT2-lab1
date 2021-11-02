package by.bsuir.webtech.firstLab.classesAndObjects.ball.model;

import by.bsuir.webtech.firstLab.classesAndObjects.ball.enums.Color;

public class Ball {
    private Color color;
    private double weight;

    public Ball(Color color, double weight) {
        this.color = color;
        setWeight(weight);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be less than or equal to zero ");
        }
        this.weight = weight;
    }
}
