import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Test
    public void testEatMeatReturnsPredator() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFamilyReturnsFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensReturns1() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

}
