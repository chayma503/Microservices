package master.fss.calcul_statistique_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/stats")
public class StatistiquesController {

    private final RestTemplate restTemplate;
    private final String calculateServiceUrl;

    public StatistiquesController(RestTemplate restTemplate,
                                  @Value("${calculatrice.service.url}") String calculateServiceUrl) {
        this.restTemplate = restTemplate;
        this.calculateServiceUrl = calculateServiceUrl;
    }

    @GetMapping("/moyenne")
    public double moyenne(@RequestParam double a, @RequestParam double b) {
        // Appel au service calculatrice pour faire la somme
        String url = calculateServiceUrl + "/api/calcul/somme?a=" + a + "&b=" + b;
        Double somme = restTemplate.getForObject(url, Double.class);

        // Calcul de la moyenne
        return somme / 2;
    }

    @GetMapping("/test")
    public String test() {
        return "Service de statistiques actif !";
    }
}