package ball;

public class Service {

    public double getWeightAllBalls(Basket basket) {

        double weight = 0;

        for (Ball ball : basket.getBall()) {
            weight += ball.getWeight();
        }

        return weight;
    }

    public int countColoredBalls(String color, Basket basket){

        int count = 0;

        for (Ball ball : basket.getBall()) {
            if (ball.getColor().equals(color))
                count++;
        }

        return count;
    }

}
