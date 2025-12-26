package metier;

import jakarta.xml.bind.annotation.*;
import java.util.Date;

// Annotation principale qui indique que cette classe sera convertie en XML
@XmlRootElement(name = "compte")
// JAXB accède directement aux champs (et pas seulement aux getters/setters)
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    private int code;
    private double solde;

    // Cette annotation empêche que la variable apparaisse dans le WSDL et les réponses SOAP
    @XmlTransient
    private Date dateCreation;

    public Compte() {}

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public double getSolde() { return solde; }
    public void setSolde(double solde) { this.solde = solde; }

    public Date getDateCreation() { return dateCreation; }
    public void setDateCreation(Date dateCreation) { this.dateCreation = dateCreation; }
}
