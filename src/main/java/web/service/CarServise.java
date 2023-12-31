package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServise implements CarServiseInterface {

    private List<Car> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Tesla", 1, true));
        carsList.add(new Car("BMV", 2, true));
        carsList.add(new Car("Audi", 3, true));
        carsList.add(new Car("UAZ", 4, false));
        carsList.add(new Car("Kamaz", 5, false));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carsList.subList(0, count);
    }

}
