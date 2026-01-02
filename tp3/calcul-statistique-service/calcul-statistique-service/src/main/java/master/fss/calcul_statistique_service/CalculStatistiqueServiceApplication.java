package master.fss.calcul_statistique_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  // ← AJOUTE CETTE LIGNE
public class CalculStatistiqueServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculStatistiqueServiceApplication.class, args);
    }
}