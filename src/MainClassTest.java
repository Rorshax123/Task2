import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("LocalNumber not equals to 14", getLocalNumber() == 14);
    }
}
