package by.bsuir.webtech.firstLab.classesAndObjects.ball.service;

import by.bsuir.webtech.firstLab.classesAndObjects.ball.enums.Color;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.model.Ball;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.model.Basket;

public interface BasketService {
    void addBall(Ball ball, Basket basket);
    double getTotalBallsWeight(Basket basket);
    int getBallsCountByColor(Basket basket, Color color);
}
