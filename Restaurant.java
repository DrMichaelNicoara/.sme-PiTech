package CodeRun;

import java.util.HashMap;

public class Restaurant {
    public String denumire, specific;

    public Restaurant(String denumire, String specific)
    {
        this.denumire = denumire;
        this.specific = specific;
    }

    private HashMap<Integer, Comanda> comenzi = new HashMap<Integer, Comanda>();

    private int pierderi = 0;
    public int pierderiSarbatori()
    {
        return pierderi;
    }

    public void plasareComanda(Comanda comanda)
    {
        int hash = comanda.hashCode();
        comenzi.put(hash, comanda);
        pierderi = comanda.totalPrice / 9;
    }

    public Comanda trimitereComanda()
    {
        Integer firstKey = comenzi.keySet().stream().findFirst().get();
        Comanda cmd = comenzi.get(firstKey);
        comenzi.remove(firstKey);
        return cmd;
    }
}
