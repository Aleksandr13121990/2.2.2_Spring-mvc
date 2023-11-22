package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList;

    public CarServiceImp() {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", "A6", 1996));
        carList.add(new Car("Audi", "TT", 1999));
        carList.add(new Car("BMV", "X6", 2008));
        carList.add(new Car("Lexus", "RX", 2015));
        carList.add(new Car("Toyota", "CAMRY", 2001));
    }

    @Override
    public List<Car> getAllCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
