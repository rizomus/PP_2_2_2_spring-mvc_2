package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServise;


@Controller
public class CarsController {

    private final CarServise carServise;

    public CarsController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars")
    public String getCarsList(@RequestParam(value = "count",  required=false) Integer count, ModelMap model) {

        if (count == null || count >= 5) {
            count = 5;
        }
        model.addAttribute("carsList", carServise.getCarsList(count));
        return "cars";

    }

}
