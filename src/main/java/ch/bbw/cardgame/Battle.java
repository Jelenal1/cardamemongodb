package ch.bbw.cardgame;

public class Battle {

    Car leftcar;
    Car rightcar;
    String winner;

    public Battle(){

    }

    public Battle(Car leftcar, Car rightcar, String winner) {
        this.leftcar = leftcar;
        this.rightcar = rightcar;
        this.winner = winner;
    }

    public Car getLeftcar() {
        return leftcar;
    }

    public void setLeftcar(Car leftcar) {
        this.leftcar = leftcar;
    }

    public Car getRightcar() {
        return rightcar;
    }

    public void setRightcar(Car rightcar) {
        this.rightcar = rightcar;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
