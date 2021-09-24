package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    private CarDaoImp carDao;

    @Override
    public List<Car> show(Long count) {
        return carDao.show(count);
    }
}
