public class Receiver implements IGame{
    private Points receiverPoints;

    public Receiver() {
        receiverPoints = Points.LOVE;
    }

    public void setReceiverPoints(Points receiverPoints) {
        this.receiverPoints = receiverPoints;
    }

    public Points getReceiverPoints() {
        return receiverPoints;
    }

    @Override
    public void addPoints() {
        setReceiverPoints(receiverPoints.next());
    }

    @Override
    public void removeAdvantage() {
        setReceiverPoints(receiverPoints.previous());
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "receiverPoints=" + receiverPoints +
                '}';
    }
}
