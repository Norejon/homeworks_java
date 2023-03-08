package Car;

public class Car {
    private String model;
    private int power;
    private int volumeEngine;
    private boolean turbo;

    public Car(){
    }

    public Car(String model, int power, int volumeEngine, boolean turbo){
        this.model = model;
        this.power = power;
        this.turbo = turbo;
        this.volumeEngine = volumeEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }
    public void setVolumeEngine(int volumeEngine){
        this.volumeEngine = volumeEngine;
    }
    public void setTurbo(boolean turbo){
        this.turbo= turbo;
    }
    public boolean getTurbo(){
        return turbo;
    }

    @Override
    public String toString(){
        return " "+ model+" "+turbo;
    }

}
