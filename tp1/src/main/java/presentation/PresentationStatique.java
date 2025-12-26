package presentation;
import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;
public class PresentationStatique {
    public static void main(String[] args) {
        IDao dao = new DaoImpl ();
        MetierImpl metier = new MetierImpl();
//Injection de dependence
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}