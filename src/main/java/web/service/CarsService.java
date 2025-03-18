package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarsService {
    private List<Car> cars = List.of(new Car[]{
            new Car("Fred", "Ford Focus", 789),
            new Car("Cole", "Toyota Prius", 753),
            new Car("John", "Lada Largus", 115),
            new Car("Adam", "Honda Civic", 167),
            new Car("Michelle", "Jeep Cherokee", 647),
    });

    public List<Car> getCars(int count) {
        if ((count <= 0) || (count > cars.size())) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
