package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    private CarDaoImp carDao;

    @Override
    public List<Car> show(Long count) {
        if(count == null) {
            count = 0L;
        }
        if (count == 0) {
            return carDao.show();
        } else if (count > 0 && count <= 5) {
            List<Car> countCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                countCars.add(carDao.show().get(i));
            }
            return countCars;
        } else if (count > 5) {
            return carDao.show();
        } else {
            return carDao.show();
        }
    }
}
