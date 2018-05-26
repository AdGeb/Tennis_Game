import model.Points;
import model.Server;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServerTest {

    private Server s = new Server();

    @Test
    public void testAddPoints(){
        s.setServerPoints(Points.LOVE);
        s.addPoints();
        Assert.assertEquals(Points.FIFTEEN, s.getServerPoints());
    }

    @Test
    public void testRemoveAdvantage(){
        s.setServerPoints(Points.ADVANTAGE);
        s.removeAdvantage();
        assertEquals(Points.FORTY, s.getServerPoints());
    }
}