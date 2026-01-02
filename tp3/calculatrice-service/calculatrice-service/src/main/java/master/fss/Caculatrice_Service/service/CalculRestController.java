package master.fss.Caculatrice_Service.service;

import master.fss.Caculatrice_Service.metier.Calculatrice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calcul")
public class CalculRestController {

    private final Calculatrice calculatrice;

    public CalculRestController(Calculatrice calculatrice) {
        this.calculatrice = calculatrice;
    }

    @GetMapping("/somme")
    public double somme(@RequestParam double a, @RequestParam double b) {
        return calculatrice.somme(a, b);
    }

    @GetMapping("/soustraction")
    public double soustraction(@RequestParam double a, @RequestParam double b) {
        return calculatrice.soustraction(a, b);
    }

    @GetMapping("/multiplication")
    public double multiplication(@RequestParam double a, @RequestParam double b) {
        return calculatrice.multiplication(a, b);
    }

    @GetMapping("/division")
    public double division(@RequestParam double a, @RequestParam double b) {
        return calculatrice.division(a, b);
    }

    @GetMapping("/test")
    public String test() {
        return "Service de calculatrice actif !";
    }
}