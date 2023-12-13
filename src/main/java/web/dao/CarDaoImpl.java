package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1,"BMW", 520));
        cars.add(new Car(2,"Audi", 80));
        cars.add(new Car(3,"Mercedes-Benz", 63));
        cars.add(new Car(4,"Porsche", 911));
        cars.add(new Car(5,"Saab", 9000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
