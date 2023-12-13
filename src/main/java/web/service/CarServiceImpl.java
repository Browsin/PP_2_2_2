package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDaoImpl carDao;

    public CarServiceImpl() {
        carDao = new CarDaoImpl();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
