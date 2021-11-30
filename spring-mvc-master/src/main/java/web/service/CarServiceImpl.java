package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listOfCars(int count) {
        List<Car> ListOfCars =  new LinkedList<>();
        ListOfCars.add(new Car(1, "Lada", "Blue"));
        ListOfCars.add(new Car(2,"Mercedes","Red"));
        ListOfCars.add(new Car(3,"BMW","Orange"));
        ListOfCars.add(new Car(4,"Nissan","Black"));
        ListOfCars.add(new Car(5,"KIA","Green"));
        if( count>5){
            return ListOfCars;
        }
        List<Car> resultList = ListOfCars.subList(0,count);
        return resultList;
    }
}
