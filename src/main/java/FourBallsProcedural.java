import processing.core.PApplet;


public class FourBallsProcedural extends PApplet{
    public static final int WINDOW_HEIGHT = 480;
    public static final int WINDOW_WIDTH = 640;
    public static final int BALL_DIAMETER = 10;
    public static final double HEIGHT_FACTOR = 0.2;
    int ball1Velocity = 0;
    int ball2Velocity = 0;
    int ball3Velocity = 0;
    int ball4Velocity = 0;

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        ball1();
        ball2();
        ball3();
        ball4();
    }


    private void ball1() {
        ellipse(ball1Velocity, (float) (WINDOW_HEIGHT * HEIGHT_FACTOR), BALL_DIAMETER, BALL_DIAMETER);
        ball1Velocity += 1;
    }

    private void ball2() {
        ellipse(ball2Velocity, (float) (WINDOW_HEIGHT * (2 * HEIGHT_FACTOR)), BALL_DIAMETER, BALL_DIAMETER);
        ball2Velocity += 2;
    }

    private void ball3() {
        ellipse(ball3Velocity, (float) (WINDOW_HEIGHT * (3 * HEIGHT_FACTOR)), BALL_DIAMETER, BALL_DIAMETER);
        ball3Velocity += 3;
    }

    private void ball4() {
        ellipse(ball4Velocity, (float) (WINDOW_HEIGHT * (4 * HEIGHT_FACTOR)), BALL_DIAMETER, BALL_DIAMETER);
        ball4Velocity += 4;
    }


    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural", args);
    }
}
