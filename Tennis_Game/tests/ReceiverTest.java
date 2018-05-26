import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiverTest {

    private Receiver r = new Receiver();

    @Test
    public void testAddPoints(){
        r.setReceiverPoints(Points.LOVE);
        r.addPoints();
        Assert.assertEquals(Points.FIFTEEN, r.getReceiverPoints());
    }

    @Test
    public void testRemoveAdvantage(){
        r.setReceiverPoints(Points.ADVANTAGE);
        r.removeAdvantage();
        assertEquals(Points.FOURTY, r.getReceiverPoints());
    }

}