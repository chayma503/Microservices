package master.fss.Caculatrice_Service.metier;

import org.springframework.stereotype.Service;

@Service
public class Calculatrice implements ICalculatrice {
    public double somme(double a, double b) { return a + b; }
    public double soustraction(double a, double b) { return a - b; }
    public double multiplication(double a, double b) { return a * b; }
    public double division(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division par zéro");
        return a / b;
    }
}