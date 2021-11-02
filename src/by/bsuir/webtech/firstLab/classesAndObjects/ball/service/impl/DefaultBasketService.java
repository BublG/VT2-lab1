package by.bsuir.webtech.firstLab.classesAndObjects.ball.service.impl;

import by.bsuir.webtech.firstLab.classesAndObjects.ball.enums.Color;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.model.Ball;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.model.Basket;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.service.BasketService;

public class DefaultBasketService implements BasketService {
    @Override
    public void addBall(Ball ball, Basket basket) {
        basket.getBalls().add(ball);
    }

    @Override
    public double getTotalBallsWeight(Basket basket) {
        return basket.getBalls().stream()
                .reduce(0.0, (a, b) -> a + b.getWeight(), Double::sum);
    }

    @Override
    public int getBallsCountByColor(Basket basket, Color color) {
        return (int) basket.getBalls().stream()
                .filter(ball -> ball.getColor() == color)
                .count();
    }
}
