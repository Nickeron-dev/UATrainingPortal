import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalInt;

public class Testing {
    int [] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    @Test
    public void averageTest() {
        Assert.assertEquals(5.0, (double) Solutions.average(array), 1.0);
    }

    @Test
    public void minValueTest() {
        Assert.assertEquals(0, Solutions.minValue(array));
    }

    @Test
    public void getIndexTest() {
        Assert.assertEquals(9, Solutions.getIndex(array, 0));
    }

    @Test
    public void zeroValuesAmountTest() {
        Assert.assertEquals(1, Solutions.zeroValuesAmount(array));
    }

    @Test
    public void valuesLargerThanZeroTest() {
        Assert.assertEquals(9, Solutions.valuesLargerThanZero(array));
    }

    @Test
    public void multiplyArrayByValueTest() {
        Assert.assertEquals(" 5  10  15  20  25  30  35  40  45  0 ", Solutions.multiplyArrayByValue(array, 5));
    }

}
