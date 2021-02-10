package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp  implements CarService {
        private List<Car> carList = new ArrayList<>(Arrays.asList(
                new Car("Toyota Supra","White",201469),
                new Car("Nissan Eclipse","White",486795),
                new Car("Honda Accord","Silver",624978),
                new Car("Mitsubishi Lancer","Red",845762),
                new Car("Subaru Forester","Blue",752469)));
        @Override
        public List<Car> getCarList(int count) {
            if ((count == 0) || (count >= 5)) {
                count = carList.size();
            }
            return carList.subList(0, count);
        }
}
