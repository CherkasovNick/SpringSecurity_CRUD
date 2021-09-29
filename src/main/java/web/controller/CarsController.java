package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarServiceImp carServiceImp;


    @GetMapping("/cars")
    public String carsList(@RequestParam( value = "count", required = false) Long count, Model model) {
        List<Car> list = carServiceImp.show(count);
        model.addAttribute("cars", list);
        return "cars";
    }

}
