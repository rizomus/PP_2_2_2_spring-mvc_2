package web.service;

import web.model.Car;

import java.util.List;

public interface CarServiseInterface {

    public List<Car> getCarsList(int count);
}
