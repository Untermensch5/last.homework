package Assignment6.Factory;

import java.util.*;

public class Test2{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose transport and it will create transport by factory method and execute his task:\n" +
                "1)truck\n" +
                "2)ship\n" +
                "3)car\n" +
                "type one of them");
        String whichTransport = s.nextLine();
        TransportFactory a = createTransport(whichTransport);
        TransportsWork b = a.transportFactory();

        b.deliverCargo();
    }

    static TransportFactory createTransport(String name) throws Exception {
        switch (name){
            case "ship":
                return new ShipFactory();
            case "truck":
                return new TruckFactory();
            case "car":
                return new CarFactory();
            default:
                throw new Exception(name + " idk what this is");
        }
    }

}

interface TransportsWork{
    public void deliverCargo();
}

class Car implements TransportsWork{

    @Override
    public void deliverCargo() {
        System.out.println("Car delivering people by road");
    }
}

class Ship implements TransportsWork{

    @Override
    public void deliverCargo() {
        System.out.println("Ship delivering cargo by sea");
    }
}

class Truck implements TransportsWork{

    @Override
    public void deliverCargo() {
        System.out.println("Truck delivering cargo by road");
    }
}

interface TransportFactory{
    public TransportsWork transportFactory();
}

class CarFactory implements TransportFactory{

    @Override
    public TransportsWork transportFactory() {
        return new Car();
    }
}


class ShipFactory implements TransportFactory{

    @Override
    public TransportsWork transportFactory() {
        return new Ship();
    }
}

class TruckFactory implements TransportFactory{

    @Override
    public TransportsWork transportFactory() {
        return new Truck();
    }
}