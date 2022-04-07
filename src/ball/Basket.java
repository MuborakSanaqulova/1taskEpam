package ball;


import java.util.List;

public class Basket {

    private List<Ball> ball;

    public Basket(List<Ball> ball) {
        this.ball = ball;
    }

    public List<Ball> getBall() {
        return ball;
    }

    public void setBall(List<Ball> ball) {
        this.ball = ball;
    }
}
