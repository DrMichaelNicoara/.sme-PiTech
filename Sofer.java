package CodeRun;

public class Sofer implements Comparable<Object> {
    public String nume, vehicle;

    private int soferi = 0;
    public Sofer()
    {
        soferi++;
    }

    public int getNrSoferi() {return soferi;}

    private int venit = 0;
    public void luareComanda(Restaurant restaurant)
    {
        Comanda cmd = restaurant.trimitereComanda();
        venit += cmd.totalPrice;
    }

    public int GetVenit()
    {
        return venit;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(venit, ((Sofer)o).GetVenit());
    }

}
