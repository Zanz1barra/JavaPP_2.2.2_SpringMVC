package web.model;

public class Car {
    private String ownerName;
    private String modelName;
    private int series;

    public Car(String ownerName, String modelName, int series) {
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
}
