import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarFleetTests {
    
    @Test
    public void TestCarFleetConstructor(){
        Queue <Car> gasolineCarQueue1 = new Queue <Car>();
        assertEquals(true, gasolineCarQueue1.isEmpty());
        assertEquals(0, gasolineCarQueue1.getSize());
        Queue <Car> hybridCarQueue2 = new Queue <Car>();
        assertEquals(true, hybridCarQueue2.isEmpty());
        assertEquals(0, hybridCarQueue2.getSize());
        Queue <Car> electricCarQueue3 = new Queue <Car>();
        assertEquals(true, electricCarQueue3.isEmpty());
        assertEquals(0, electricCarQueue3.getSize());
    } 

    @Test
    public void TestAddCar(){
        CarFleet cf = new CarFleet();
        Car c1 = new Car(1, 3, 5.5f);
        Car c2 = new Car(2, 2, 5.5f);
        Car c3 = new Car(3, 2, 5.5f);
        assertEquals(true, cf.addCar(c1));
        assertEquals(true, cf.addCar(c2));
        assertEquals(true, cf.addCar(c3));
        assertEquals(1, cf.electricCarQueue3_getSize());
        assertEquals(2, cf.hybridCarQueue2_getSize());
    } 

    @Test
    public void TestProcessRequests(){

        CarFleet cf = new CarFleet();
        Queue<Integer> requestQueue = new Queue<Integer>();
        assertEquals(0, cf.processRequests(requestQueue).size());

        Car c3 = new Car(3, 1, 5.5f);
        cf.addCar(c3);
        requestQueue.enqueue(1);
        requestQueue.enqueue(2);
        requestQueue.enqueue(3);

        for (Car i: cf.processRequests(requestQueue)){
            assertEquals("ID: " + i.getId() + ", Power Source: " + i.getPowerSource() + ", Price Per Day: " + i.getPricePerDay(),i.toString()); 
        }
    }
}
