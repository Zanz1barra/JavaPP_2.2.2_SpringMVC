package web.service;

import web.model.CarModel;

import java.util.List;

public class CarsService {

    public static List<CarModel> getCars(int count) {
        List<CarModel> cars = CarModel.getCarsList();
        if ((count <= 0) || (count > cars.size())) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
