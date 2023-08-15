import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTests {
    
    @Test
    public void TestCarConstructor(){
        Car c1 = new Car(1, 3, 5.5f);
        assertEquals(1, c1.getId());
        assertEquals(3, c1.getPowerSource());
        assertEquals(5.5f, c1.getPricePerDay(), 0.001f);
    } 

    @Test
    public void TestGetId(){
        Car c1 = new Car(1, 3, 5.5f);
        Car c2 = new Car(2, 2, 5.5f);
        Car c3 = new Car(3, 1, 5.5f);
        assertEquals(1, c1.getId());
        assertEquals(2, c2.getId());
        assertEquals(3, c3.getId());
    } 

    @Test
    public void TestSetId(){
        Car c1 = new Car(1, 3, 5.5f);
        c1.setId(5);
        Car c2 = new Car(2, 2, 5.5f);
        c2.setId(10);
        assertEquals(5, c1.getId());
        assertEquals(10, c2.getId());
    } 

    @Test
    public void TestGetPowerSource(){
        Car c1 = new Car(1, 3, 5.5f);
        Car c2 = new Car(2, 2, 5.5f);
        Car c3 = new Car(3, 1, 5.5f);
        assertEquals(3, c1.getPowerSource());
        assertEquals(2, c2.getPowerSource());
        assertEquals(1, c3.getPowerSource());
    } 

    @Test
    public void TestSetPowerSource(){
        Car c1 = new Car(1, 3, 5.5f);
        c1.setPowerSource(1);
        Car c2 = new Car(2, 2, 5.5f);
        c2.setPowerSource(3);
        assertEquals(1, c1.getPowerSource());
        assertEquals(3, c2.getPowerSource());
    } 

    @Test
    public void TestGetPricePerDay(){
        Car c1 = new Car(1, 3, 1.5f);
        Car c2 = new Car(2, 2, 2.5f);
        Car c3 = new Car(3, 1, 3.5f);
        assertEquals(1.5f, c1.getPricePerDay(), 0.001f);
        assertEquals(2.5f, c2.getPricePerDay(), 0.001f);
        assertEquals(3.5f, c3.getPricePerDay(), 0.001f);
    } 

    @Test
    public void TestSetPricePerDay(){
        Car c1 = new Car(1, 3, 5.5f);
        c1.setPricePerDay(10.5f);
        Car c2 = new Car(2, 2, 5.5f);
        c2.setPricePerDay(20.5f);
        assertEquals(10.5f, c1.getPricePerDay(), 0.001f);
        assertEquals(20.5f, c2.getPricePerDay(), 0.001f);
    } 
}
