package dao;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao{
    public double getValue() {
        return 3;
    }
}
