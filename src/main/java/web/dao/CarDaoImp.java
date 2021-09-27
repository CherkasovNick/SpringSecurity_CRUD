package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Corolla", 2002));
        cars.add(new Car(2, "Camry", 2016));
        cars.add(new Car(3, "Auris", 2014));
        cars.add(new Car(4, "Crown", 1998));
        cars.add(new Car(5, "Land Cruiser", 2006));
    }
    @Override
    public List<Car> show(Long count) {
        if (count == 0) {
            return cars;
        } else if (count > 0 && count <= 5) {
            List<Car> countCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                countCars.add(cars.get(i));
            }
            return countCars;
        } else if (count >= 5) {
            return cars;
        } else {
            return cars;
        }

    }


}
