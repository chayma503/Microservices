package master.fss.calcul_statistique_service.controller;

import master.fss.calcul_statistique_service.client.CalculatriceClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feign/stats")
public class StatistiquesFeignController {

    private final CalculatriceClient calculatriceClient;

    public StatistiquesFeignController(CalculatriceClient calculatriceClient) {
        this.calculatriceClient = calculatriceClient;
    }

    @GetMapping("/moyenne")
    public double moyenne(@RequestParam double a, @RequestParam double b) {
        Double somme = calculatriceClient.somme(a, b);
        return somme / 2;
    }

    @GetMapping("/test")
    public String test() {
        return "Service de statistiques avec Feign actif !";
    }

    @GetMapping("/test-calculatrice")
    public String testCalculatrice() {
        return calculatriceClient.test();
    }
}