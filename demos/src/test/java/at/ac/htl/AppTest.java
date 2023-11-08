package at.ac.htl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void WhenGetSumThenResultIs377()
    {
        var app = new App();
        assertEquals(385, app.getSum());
    }


}
