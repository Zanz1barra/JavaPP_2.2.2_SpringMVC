package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(
            @RequestParam(name = "count", defaultValue = "5") int carsCount,
            ModelMap model) {
        model.addAttribute("list", CarsService.getCars(carsCount));
        return "cars";
    }

}