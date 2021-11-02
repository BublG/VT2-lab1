import by.bsuir.webtech.firstLab.classesAndObjects.ball.enums.Color;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.model.Ball;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.model.Basket;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.service.BasketService;
import by.bsuir.webtech.firstLab.classesAndObjects.ball.service.impl.DefaultBasketService;


public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        BasketService basketService = new DefaultBasketService();
        basketService.addBall(new Ball(Color.BLUE, 1.5), basket);
        basketService.addBall(new Ball(Color.GREEN, 2.5), basket);
        basketService.addBall(new Ball(Color.YELLOW, 3.5), basket);
        System.out.println(basketService.getTotalBallsWeight(basket));
    }
}
