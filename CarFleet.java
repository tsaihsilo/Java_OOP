import java.util.List;
import java.util.LinkedList;

public class CarFleet {
    protected Queue <Car> gasolineCarQueue1;
    protected Queue <Car> hybridCarQueue2;
    protected Queue <Car> electricCarQueue3;

    public CarFleet(){
        gasolineCarQueue1 = new Queue <Car>();
        hybridCarQueue2 = new Queue <Car>();
        electricCarQueue3 = new Queue <Car>();
    }

    public int gasolineCarQueue1_getSize() {
        return gasolineCarQueue1.getSize();
    }

    public int hybridCarQueue2_getSize() {
        return hybridCarQueue2.getSize();
    }

    public int electricCarQueue3_getSize() {
        return electricCarQueue3.getSize();
    }

    public boolean addCar(Car c){
        switch (c.getPowerSource()){
            case 1:
                gasolineCarQueue1.enqueue(c);
                return true;
            case 2:
                hybridCarQueue2.enqueue(c);
                return true;
            case 3:
                electricCarQueue3.enqueue(c);
                return true;
            default:
                System.out.println("Nothing added");
                return false;
        }   
    }

    public List<Car> processRequests(Queue <Integer> requests){
        List<Car> outputList = new LinkedList<>();
        
        while (!requests.isEmpty()) {
            Integer request = requests.dequeue();
            if (request == 1) {
                if (!gasolineCarQueue1.isEmpty()) {
                    outputList.add(gasolineCarQueue1.dequeue());
                } else {
                    Car car1 = new Car(0, 1, 0.0f);
                    outputList.add(car1);
                }
            } 
            else if (request == 2) {
                if (!hybridCarQueue2.isEmpty()) {
                    outputList.add(hybridCarQueue2.dequeue());
                } else {
                    Car car2 = new Car(0, 2, 0.0f);
                    outputList.add(car2);
                }
            }
            else if (request == 3) {
                if (!electricCarQueue3.isEmpty()) {
                    outputList.add(electricCarQueue3.dequeue());
                } else {
                    Car car3 = new Car(0, 3, 0.0f);
                    outputList.add(car3);
                }
            }
        }

        return outputList;
    }

    public static void main(String[] args){
        // Car c1 = new Car(1, 3, 5.5f);
        // Car c2 = new Car(2, 2, 5.5f);
        Car c3 = new Car(3, 1, 5.5f);
        Queue<Integer> q = new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        CarFleet cf = new CarFleet();
        cf.addCar(c3);
        for (Car i: cf.processRequests(q)){
            System.out.println(i.toString());
        }
    }
    
}