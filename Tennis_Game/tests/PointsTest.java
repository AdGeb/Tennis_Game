import model.Points;
import org.junit.Assert;
import org.junit.Test;

public class PointsTest {

    @Test
    public void testNextMethod(){
        Assert.assertEquals(Points.FIFTEEN, Points.LOVE.next());
        Assert.assertEquals(Points.ADVANTAGE, Points.ADVANTAGE.next());
    }

    @Test
    public void testPreviousMethod(){
        Assert.assertEquals(Points.FIFTEEN, Points.THIRTY.previous());
        Assert.assertEquals(Points.LOVE, Points.LOVE.previous());
    }

    @Test
    public void getValue(){
        Assert.assertEquals("15", Points.FIFTEEN.getValue());
        Assert.assertEquals("0", Points.LOVE.getValue());
        Assert.assertEquals("A", Points.ADVANTAGE.getValue());
    }
}