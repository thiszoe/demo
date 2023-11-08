package at.ac.htl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    
    @Test
    public void WhenGetSumThenResultIs377()
    {
        var app = new App();
        assertEquals(385, app.getSum());
    }


}
