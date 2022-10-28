package ch.bbw.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Statistic {
    String startTime;
    List<Car> leftcars;
    List<Car> rightcars;
    List<Battle> battles;
    String winner;
    String winTime;

    public Statistic(){
        leftcars = new ArrayList<>();
        rightcars = new ArrayList<>();
        battles = new ArrayList<>();
    }
    public Statistic(String startTime, List<Car> leftcars, List<Car> rightcars, List<Battle> battles, String winner, String winTime) {
        this.startTime = startTime;
        this.leftcars = leftcars;
        this.rightcars = rightcars;
        this.battles = battles;
        this.winner = winner;
        this.winTime = winTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<Car> getLeftcars() {
        return leftcars;
    }

    public void setLeftcars(List<Car> leftcars) {
        this.leftcars = leftcars;
    }

    public List<Car> getRightcars() {
        return rightcars;
    }

    public void setRightcars(List<Car> rightcars) {
        this.rightcars = rightcars;
    }

    public List<Battle> getBattles() {
        return battles;
    }

    public void setBattles(List<Battle> moves) {
        this.battles = moves;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinTime() {
        return winTime;
    }

    public void setWinTime(String winTime) {
        this.winTime = winTime;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "startTime='" + startTime + '\'' +
                ", leftcars=" + leftcars +
                ", rightcars=" + rightcars +
                ", moves=" + battles +
                ", winner='" + winner + '\'' +
                ", winTime='" + winTime + '\'' +
                '}';
    }
}
