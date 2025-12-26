package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 3.3; // exemple : convertir € → Dinars
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 9000, new Date());
    }

    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 8000, new Date()));
        comptes.add(new Compte(2, 12000, new Date()));
        comptes.add(new Compte(3, 5000, new Date()));
        return comptes;
    }
}
