package car.example.constructor.injection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.SocketOption;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car details: "+ specification.toString());
    }
}

