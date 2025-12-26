package presentation;

import metier.IMetier;
import java.io.*;
import java.lang.reflect.Method;

public class PresentationDynamique {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/config.txt"));
        String daoClassName = br.readLine();
        String metierClassName = br.readLine();

        Class<?> cDao = Class.forName(daoClassName);
        Object dao = cDao.getDeclaredConstructor().newInstance();

        Class<?> cMetier = Class.forName(metierClassName);
        Object metier = cMetier.getDeclaredConstructor().newInstance();

        // Injection via réflexion
        Method setDao = cMetier.getMethod("setDao", cDao.getInterfaces()[0]);
        setDao.invoke(metier, dao);

        Method calcul = cMetier.getMethod("calcul");
        System.out.println("Résultat dynamique = " + calcul.invoke(metier));
    }
}
