package web.model;

import java.util.List;

public class CarModel {
    private String ownerName;
    private String modelName;
    private int series;

    public CarModel(String ownerName, String modelName, int series) {
        this.ownerName = ownerName;
        this.modelName = modelName;
        this.series = series;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getSeries() {
        return series;
    }

    public static List<CarModel> getCarsList() {
        return List.of(new CarModel[]{
                new CarModel("Fred", "Ford Focus", 789),
                new CarModel("Cole", "Toyota Prius", 753),
                new CarModel("John", "Lada Largus", 115),
                new CarModel("Adam", "Honda Civic", 167),
                new CarModel("Michelle", "Jeep Cherokee", 647),
        });
    }
}
