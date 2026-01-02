package master.fss.calcul_statistique_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "calculatrice-service", url = "${calculatrice.service.url}")
public interface CalculatriceClient {

    @GetMapping("/api/calcul/somme")
    Double somme(@RequestParam("a") double a, @RequestParam("b") double b);

    @GetMapping("/api/calcul/soustraction")
    Double soustraction(@RequestParam("a") double a, @RequestParam("b") double b);

    @GetMapping("/api/calcul/multiplication")
    Double multiplication(@RequestParam("a") double a, @RequestParam("b") double b);

    @GetMapping("/api/calcul/division")
    Double division(@RequestParam("a") double a, @RequestParam("b") double b);

    @GetMapping("/api/calcul/test")
    String test();
}