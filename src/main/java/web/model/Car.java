package web.model;

public class Car {
    String model;
    int series;
    boolean automat;

    public Car(String model, int series, boolean automat) {
        this.model = model;
        this.series = series;
        this.automat = automat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public boolean isAutomat() {
        return automat;
    }

    public void setAutomat(boolean automat) {
        this.automat = automat;
    }

    @Override
    public String toString() {
        return model + " " + series;
    }
}
