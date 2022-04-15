package CodeRun;
import java.util.ArrayList;
import java.util.Objects;

public class Comanda {
    public int id;
    public ArrayList<Produs> produse;
    public Client client;
    public int estimatedTime; //minute
    public int totalPrice = 0;

    public void adaugareProdus(Produs produs)
    {
        if(!( (produs.denumire).trim() ).isEmpty() && (produs.pret > 0) )
        {
            produse.add(produs);
            totalPrice += produs.pret;
        }
    }

    public void stergereProdus(String denumire)
    {
        for(Produs p : produse)
            if(Objects.equals(p.denumire, denumire))
            {
                produse.remove(p);
                totalPrice -= p.pret;
                break;
            }
    }
}
