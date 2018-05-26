package model;

public class Server implements IGame {

    private Points serverPoints;

    public Server() {
        serverPoints = Points.LOVE;
    }

    public Points getServerPoints() {
        return serverPoints;
    }

    public void setServerPoints(Points serverPoints) {
        this.serverPoints = serverPoints;
    }

    @Override
    public void addPoints() {
        setServerPoints(serverPoints.next());
    }

    @Override
    public void removeAdvantage() {
        setServerPoints(serverPoints.previous());
    }

    @Override
    public String toString() {
        return "Server{" +
                "serverPoints=" + serverPoints +
                '}';
    }
}
