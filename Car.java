public class Car{
    protected int id;
    protected int powerSource;
    protected float pricePerDay;

    public Car(int id, int powerSource, float pricePerDay){
        this.id = id;
        this.powerSource = powerSource;
        this.pricePerDay = pricePerDay;
    }

    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getPowerSource(){
        return this.powerSource;
    }
    
    public void setPowerSource(int powerSource){
        this.powerSource = powerSource;
    }

    public float getPricePerDay(){
        return this.pricePerDay;
    }
    
    public void setPricePerDay(float pricePerDay){
        this.pricePerDay = pricePerDay;
    }

    public String toString(){
        return "ID: " + getId() + ", Power Source: " + getPowerSource() + ", Price Per Day: " + getPricePerDay();
    }
}