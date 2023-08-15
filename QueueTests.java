import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QueueTests {

    @Test
    public void TestQueueConstructor(){
        Queue <Integer> q = new Queue <>();
        assertEquals(true, q.isEmpty());
        assertEquals(0, q.getSize());
    } 

    @Test
    public void TestEnqueue(){
        Queue <Car> q = new Queue <Car>();
        Car c1 = new Car(1, 3, 5.5f);
        q.enqueue(c1);
        assertEquals(1, q.getSize());
    }

    @Test
    public void TestDequeue(){
        Queue <Car> q = new Queue <Car>();
        Car c1 = new Car(1, 3, 5.5f);
        Car c2 = new Car(2, 2, 5.5f);
        Car c3 = new Car(3, 1, 5.5f);
        q.enqueue(c1);
        q.enqueue(c2);
        q.enqueue(c3);
        assertEquals(c1, q.dequeue());
    }

    @Test
    public void TestPeek1(){
        Queue <Car> q = new Queue <Car>();
        Car c1 = new Car(1, 3, 5.5f);
        Car c2 = new Car(2, 2, 5.5f);
        Car c3 = new Car(3, 1, 5.5f);
        q.enqueue(c1);
        q.enqueue(c2);
        q.enqueue(c3);
        assertEquals(c1, q.peek());
    }

    @Test
    public void TestPeek2(){
        Queue <Car> q = new Queue <Car>();
        assertEquals(null, q.peek());
    }

    @Test
    public void TestIsEmpty1(){
        Queue <Car> q1 = new Queue <Car>();
        assertEquals(true, q1.isEmpty());
    }
    
    @Test
    public void TestIsEmpty2(){
        Queue <Car> q2 = new Queue <Car>();
        Car c1 = new Car(1, 3, 5.5f);
        Car c2 = new Car(2, 2, 5.5f);
        Car c3 = new Car(3, 1, 5.5f);
        q2.enqueue(c1);
        q2.enqueue(c2);
        q2.enqueue(c3);
        assertEquals(false, q2.isEmpty());
    }
}
