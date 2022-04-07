import ball.Ball;
import ball.Basket;
import ball.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Ball> balls = new ArrayList<>();
        balls.add(0, new Ball("red", 2.5, 30));
        balls.add(1, new Ball("red", 2.5, 30));
        balls.add(2, new Ball("yellow", 1.5, 20));
        balls.add(3, new Ball("blue", 2.5, 25));
        balls.add(4, new Ball("red", 3.5, 35));
        balls.add(5, new Ball("green", 2.5, 20));
        balls.add(6, new Ball("pink", 2, 15));
        balls.add(7, new Ball("pink", 5, 25));
        balls.add(8, new Ball("rainbow", 2.4, 30));
        balls.add(9, new Ball("blue", 3, 35));
        balls.add(10, new Ball("red", 2.5, 30));

        Basket basket = new Basket(balls);

        System.out.print("enter one of this color(red, yellow, blue, green, rainbow, pink): ");
        String color = scanner.nextLine();

        Service service = new Service();

        double weight = service.getWeightAllBalls(basket);
        int count = service.countColoredBalls(color, basket);

        System.out.println("all balls weight = " + weight + " in this basket\nthere is(are) " + count + " ball(s) here");

    }

}
