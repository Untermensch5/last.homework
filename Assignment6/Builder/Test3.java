package Assignment6.Builder;



import java.util.*;
import java.util.concurrent.TimeUnit;
import java.sql.*;

public class Test3{
    public static void main(String[] args) throws Exception {


    }
}

class Director{

    public void makeSportCar(Builder builder){
        builder.setEngine("engine");
        builder.setGPS(true);
        builder.setSeats(4);
        builder.setTripComputer(true);
    }

    public void SUV(Builder builder){
        builder.setEngine("Big engine");
        builder.setGPS(true);
        builder.setSeats(6);
        builder.setTripComputer(true);
    }
}

interface Builder{
    public void reset();
    public void setSeats(int number);
    public void setEngine(String str);
    public void setTripComputer(boolean bl);
    public void setGPS(boolean bl);
}

class CarManual implements Builder{
    private CarManual carManual;
    private int seats = 2;
    private String engine = "engine";
    private boolean tripComputer = false;
    private boolean GPS = false;

    private CarManual(int seats, String engine, boolean tripComputer, boolean GPS) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
    }

    public CarManual getResult() {
        return this.carManual = new CarManual(seats, engine, tripComputer, GPS);
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public boolean isGPS() {
        return GPS;
    }

    @Override
    public void reset() {
        this.seats = 0;
        this.engine = "";
        this.tripComputer = false;
        this.GPS = false;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }
}

class Car implements Builder{
    private Car car;
    private int seats = 2;
    private String engine = "engine";
    private boolean tripComputer = false;
    private boolean GPS = false;

    private Car(int seats, String engine, boolean tripComputer, boolean GPS) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
    }

    public Car getResult() {
        return this.car = new Car(seats, engine, tripComputer, GPS);
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public boolean isGPS() {
        return GPS;
    }

    @Override
    public void reset() {
        this.seats = 0;
        this.engine = "";
        this.tripComputer = false;
        this.GPS = false;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }
