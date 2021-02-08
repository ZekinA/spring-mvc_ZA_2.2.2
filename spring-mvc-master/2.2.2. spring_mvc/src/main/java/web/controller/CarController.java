package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService ;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5", required = false) int count, Model model) {
        List<Car> carList = carService.getCarList(count);
        model.addAttribute("cars", carList);
        return "cars";
    }

}